package m2mplugin;

import com.google.common.base.Objects;
import fr.istic.idm.CssDslStandaloneSetupGenerated;
import fr.istic.idm.QuestionnaireDslStandaloneSetupGenerated;
import fr.istic.idm.cssDsl.Css;
import fr.istic.idm.cssDsl.Widget;
import fr.istic.idm.questionnaireDsl.Option;
import fr.istic.idm.questionnaireDsl.Question;
import fr.istic.idm.questionnaireDsl.Questionnaire;
import fr.istic.idm.questionnaireDsl.Sondage;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import pivotMM.PivotMMFactory;
import pivotMM.PollSystem;
import pivotMM.UiModel;
import pivotMM.impl.PivotMMFactoryImpl;

@SuppressWarnings("all")
public class M2M {
  public Sondage loadQuestionnaireDsl(final URI uri) {
    Sondage _xblockexpression = null;
    {
      QuestionnaireDslStandaloneSetupGenerated _questionnaireDslStandaloneSetupGenerated = new QuestionnaireDslStandaloneSetupGenerated();
      _questionnaireDslStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((Sondage) _get);
    }
    return _xblockexpression;
  }
  
  public Css loadCssDsl(final URI uri) {
    Css _xblockexpression = null;
    {
      CssDslStandaloneSetupGenerated _cssDslStandaloneSetupGenerated = new CssDslStandaloneSetupGenerated();
      _cssDslStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((Css) _get);
    }
    return _xblockexpression;
  }
  
  public void savePollSystem(final URI uri, final PollSystem pollS) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(pollS);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadTest() {
    URI _createURI = URI.createURI("sample.q");
    Sondage q = this.loadQuestionnaireDsl(_createURI);
    Assert.assertNotNull(q);
    URI _createURI_1 = URI.createURI("sample.css");
    final Css css = this.loadCssDsl(_createURI_1);
    Assert.assertNotNull(css);
    final PivotMMFactoryImpl model = new PivotMMFactoryImpl();
    final PollSystem modelImpl = model.createPollSystem();
    EList<Questionnaire> _sondage = q.getSondage();
    final Questionnaire questionnaire = _sondage.get(0);
    String _name = questionnaire.getName();
    modelImpl.setTitle(_name);
    EList<Question> _questionnaire = questionnaire.getQuestionnaire();
    final Consumer<Question> _function = new Consumer<Question>() {
      public void accept(final Question p) {
        final String qName = p.getName();
        EList<Widget> _css = css.getCss();
        final Function1<Widget, Boolean> _function = new Function1<Widget, Boolean>() {
          public Boolean apply(final Widget c) {
            String _id = c.getId();
            return Boolean.valueOf(_id.equals(qName));
          }
        };
        final Widget cssValue = IterableExtensions.<Widget>findFirst(_css, _function);
        String _text = p.getText();
        String _plus = ("La question \t" + _text);
        InputOutput.<String>println(_plus);
        final UiModel uimodel = model.createUiModel();
        String _name = p.getName();
        uimodel.setId(_name);
        String _text_1 = p.getText();
        uimodel.setLaQuestion(_text_1);
        final EList<Option> question = p.getQuestion();
        final Consumer<Option> _function_1 = new Consumer<Option>() {
          public void accept(final Option opt) {
            String _id = cssValue.getId();
            String _plus = ("ID " + _id);
            String _plus_1 = (_plus + "\t");
            String _value = cssValue.getValue();
            String _plus_2 = (_plus_1 + _value);
            InputOutput.<String>println(_plus_2);
            final EList<String> rep = opt.getText();
            final Consumer<String> _function = new Consumer<String>() {
              public void accept(final String text) {
                InputOutput.<String>println(("\tRéponse \t" + text));
                String _value = cssValue.getValue();
                final pivotMM.Widget widgetType = M2M.this.getWidgetType(_value, model);
                Assert.assertNotNull(widgetType);
                widgetType.setValue(text);
                EList<pivotMM.Widget> _widgets = uimodel.getWidgets();
                _widgets.add(widgetType);
              }
            };
            rep.forEach(_function);
          }
        };
        question.forEach(_function_1);
        EList<UiModel> _models = modelImpl.getModels();
        _models.add(uimodel);
      }
    };
    _questionnaire.forEach(_function);
    URI _createURI_2 = URI.createURI("./Model.xmi");
    this.savePollSystem(_createURI_2, modelImpl);
  }
  
  public pivotMM.Widget getWidgetType(final String name, final PivotMMFactory pivot) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(name, "CheckBox")) {
        _matched=true;
        return pivot.createCheckBox();
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "ComboBox")) {
        _matched=true;
        return pivot.createComboBox();
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "TextField")) {
        _matched=true;
        return pivot.createTextField();
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "RadioButton")) {
        _matched=true;
        return pivot.createRadioButton();
      }
    }
    return pivot.createTextField();
  }
}
