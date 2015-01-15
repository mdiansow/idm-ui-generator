package uimodel_generator.transform

import UiModel.Color
import UiModel.ComboBoxQuestion
import UiModel.Poll
import UiModel.Question
import UiModel.Questionnaire
import UiModel.RadioButtonQuestion
import UiModel.impl.UiModelFactoryImpl
import fr.istic.PmlStandaloneSetup
import fr.istic.PsqStandaloneSetup
import fr.istic.pml.ColorEnum
import fr.istic.pml.Presentation
import fr.istic.pml.StyleEnum
import java.io.FileWriter
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class Generator {

	def loadPollSpec(URI uri) {
		new PsqStandaloneSetup().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as fr.istic.psq.Questionnaire
	}

	def loadUiSpec(URI uri) {
		new PmlStandaloneSetup().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as Presentation
	}

	def saveUiModel(URI uri, Questionnaire q) {
		var Resource rs = new ResourceSetImpl().createResource(uri);
		rs.getContents.add(q);
		rs.save(new HashMap());
	}

	def getHtml() {
		val q = toUiModel()

		val html = toHtml(q)

		val fw = new FileWriter("questionnaire.html")
		fw.write(html.toString)
		fw.close
	}

	def getGWT() {
		val q = toUiModel()

		val gwt = toGWT(q)

		val fw = new FileWriter("questionnaire.java")
		fw.write(gwt.toString)
		fw.close
	}

	def toUiModel() {

		val uiSpec = loadUiSpec(URI.createURI("ui.pml"))
		val pollSpec = loadPollSpec(URI.createURI("questionnaire.psq"))

		val uiFactory = new UiModelFactoryImpl()

		val pck = uiFactory.uiModelPackage
		val questionnaire = uiFactory.createQuestionnaire()

		pollSpec.polls.forEach [ p |
			var pollRule = uiSpec.headerRules.findFirst[r|r.name == p.name]
			val poll = uiFactory.createPoll()
			poll.name = p.name
			if (pollRule == null || pollRule.color.color == ColorEnum.BLACK) {
				poll.color = Color.BLACK
			} else {
				poll.color = getUiColor(pollRule.color.color)
			}
			p.questions.forEach [ q |
				var colorRule = uiSpec.questionRules.findFirst[r|r.name == q.name && r.color != null]
				var ColorEnum color
				if (colorRule != null) {
					color = colorRule.color.color
				} else {
					color = ColorEnum.BLACK
				}
				var styleRule = uiSpec.questionRules.findFirst[r|r.name == q.name && r.style != null]
				if (styleRule == null || styleRule.style.style == StyleEnum.RADIO) {

					val question = uiFactory.createRadioButtonQuestion()
					question.color = getUiColor(color)
					question.wording = q.text
					q.options.labelOptions.forEach [ o |
						var option = uiFactory.createAnswer()
						var optionRule = uiSpec.optionRules.findFirst[r|r.name == o.name]
						option.wording = o.text
						if (optionRule == null || optionRule.color.color == ColorEnum.BLACK) {
							option.color = Color.BLACK
						} else {
							option.color = getUiColor(optionRule.color.color)
						}
						question.options.add(option)
					]
					poll.questions.add(question)
				} else {

					val question = uiFactory.createComboBoxQuestion()
					question.color = getUiColor(color)
					question.wording = q.text
					q.options.labelOptions.forEach [ o |
						question.options.add(o.text)
					]
					poll.questions.add(question)
				}
			]
			questionnaire.polls.add(poll)
		]

		//saveUiModel(URI.createURI("model.xmi"), questionnaire)
		return questionnaire
	}

	def getUiColor(ColorEnum color) {
		switch (color) {
			case ColorEnum.RED:
				return Color.RED
			case ColorEnum.GREEN:
				return Color.GREEN
			case ColorEnum.BLUE:
				return Color.BLUE
			case ColorEnum.BLACK:
				return Color.BLACK
		}
	}

	def toHtml(Questionnaire questionnaire) '''
		<html>
		<body>
		«FOR Poll p : questionnaire.polls»
			«IF p.name != null»
				<h1 style="color:«p.color.literal»">
				«p.name»
				</h1>
			«ENDIF»
			«FOR q : p.questions»
				<h2 style color:«q.color.literal»">
				«q.wording»
				</h2>
				«IF q instanceof RadioButtonQuestion»
					<form action="">
					«FOR o : (q as RadioButtonQuestion).options»
						<input type="radio" 
							name="answer"
							value="«o.wording»">
							<span style="color:«o.color»">«o.wording»</span>
						<br>
					«ENDFOR»
				«ELSE»
					<form action="">
					<select list=options>
					<datalist id=options>
					«FOR o : (q as ComboBoxQuestion).options»
						<option> «o»
					«ENDFOR»
					</datalist>
					</select>
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		<button type="button">Sousmettre</button>
		</body>
		</html>
		
	'''

	def toGWT(Questionnaire questionnaire) '''
	
		import com.google.gwt.core.client.EntryPoint;
		import com.google.gwt.core.client.GWT;
		import com.google.gwt.user.client.ui.HTML;
		import com.google.gwt.user.client.ui.HorizontalPanel;
		import com.google.gwt.user.client.ui.ListBox;
		import com.google.gwt.user.client.ui.RadioButton;
		import com.google.gwt.user.client.ui.RootPanel;
		import com.google.gwt.user.client.ui.VerticalPanel;

		public class Questionnaire implements EntryPoint {
			public void onModuleLoad() {
				VerticalPanel container = new VerticalPanel();
				«FOR Poll p : questionnaire.polls»
					«IF p.name != null»
						container.add(new HTML("<h1 style="+'"'+"color:«p.color.literal»"+'"'+">«p.name»</h1>"));
					«ENDIF»
					«var i = 0»
					«var j = 0»
					«var k = 0»
					«var l = 0»
					«FOR Question q : p.questions»
						container.add(new HTML("<h2 style="+'"'+"color:«q.color.literal»"+'"'+">«q.wording»</h2>"));
										
						«IF q instanceof RadioButtonQuestion»
							VerticalPanel vPanelRB_«j» = new VerticalPanel();
							«FOR o : (q as RadioButtonQuestion).options»
								RadioButton rb_«k» = new RadioButton("group_«i»","«o.wording»");
								vPanelRB_«j».add(rb_«k»);
							//	«k = k + 1»
							«ENDFOR»
							container.add(vPanelRB_«j»);
							// «j = j + 1»
							// «k = 0»
						«ELSE»
							HorizontalPanel hPanelLB_«l» = new HorizontalPanel();
							ListBox list_«l» = new ListBox();
							«FOR o : (q as ComboBoxQuestion).options»
								list_«l».addItem("«o»");
							«ENDFOR»
							hPanelLB_«l».add(list_«l»);
							container.add(hPanelLB_«l»);
						//	«l = l + 1»
						«ENDIF»
						 // «i = i + 1»
					«ENDFOR»
				«ENDFOR»
				RootPanel.get().add(container);
			}
		}
	'''
}
