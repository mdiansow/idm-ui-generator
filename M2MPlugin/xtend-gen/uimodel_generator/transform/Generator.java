package uimodel_generator.transform;

import java.io.FileWriter;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class Generator {
  public Questionnaire loadPollSpec(final URI uri) {
    throw new Error("Unresolved compilation problems:"
      + "\nfr.istic.psq.Questionnaire cannot be resolved to a type."
      + "\nPsqStandaloneSetup cannot be resolved."
      + "\ncreateInjectorAndDoEMFRegistration cannot be resolved");
  }
  
  public Presentation loadUiSpec(final URI uri) {
    throw new Error("Unresolved compilation problems:"
      + "\nPresentation cannot be resolved to a type."
      + "\nPmlStandaloneSetup cannot be resolved."
      + "\ncreateInjectorAndDoEMFRegistration cannot be resolved");
  }
  
  public void saveUiModel(final URI uri, final /* Questionnaire */Object q) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(q);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void getHtml() {
    try {
      final Object q = this.toUiModel();
      final CharSequence html = this.toHtml(q);
      final FileWriter fw = new FileWriter("questionnaire.html");
      String _string = html.toString();
      fw.write(_string);
      fw.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void getGWT() {
    try {
      final Object q = this.toUiModel();
      final CharSequence gwt = this.toGWT(q);
      final FileWriter fw = new FileWriter("questionnaire.java");
      String _string = gwt.toString();
      fw.write(_string);
      fw.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object toUiModel() {
    throw new Error("Unresolved compilation problems:"
      + "\nColorEnum cannot be resolved to a type."
      + "\nUiModelFactoryImpl cannot be resolved."
      + "\nThe method name is undefined for the type Generator"
      + "\nThe method name is undefined for the type Generator"
      + "\nThe method name is undefined for the type Generator"
      + "\nThe method or field ColorEnum is undefined for the type Generator"
      + "\nThe method or field Color is undefined for the type Generator"
      + "\nThe method questions is undefined for the type Generator"
      + "\nThe method name is undefined for the type Generator"
      + "\nThe method name is undefined for the type Generator"
      + "\nThe method color is undefined for the type Generator"
      + "\nThe method or field ColorEnum is undefined for the type Generator"
      + "\nThe method name is undefined for the type Generator"
      + "\nThe method name is undefined for the type Generator"
      + "\nThe method style is undefined for the type Generator"
      + "\nThe method or field StyleEnum is undefined for the type Generator"
      + "\nThe method text is undefined for the type Generator"
      + "\nThe method options is undefined for the type Generator"
      + "\nThe method name is undefined for the type Generator"
      + "\nThe method name is undefined for the type Generator"
      + "\nThe method text is undefined for the type Generator"
      + "\nThe method or field ColorEnum is undefined for the type Generator"
      + "\nThe method or field Color is undefined for the type Generator"
      + "\nThe method text is undefined for the type Generator"
      + "\nThe method options is undefined for the type Generator"
      + "\nThe method text is undefined for the type Generator"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nuiModelPackage cannot be resolved"
      + "\ncreateQuestionnaire cannot be resolved"
      + "\npolls cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nheaderRules cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncreatePoll cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nBLACK cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nBLACK cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nquestionRules cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nBLACK cannot be resolved"
      + "\nquestionRules cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nstyle cannot be resolved"
      + "\nstyle cannot be resolved"
      + "\n== cannot be resolved"
      + "\nRADIO cannot be resolved"
      + "\ncreateRadioButtonQuestion cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nwording cannot be resolved"
      + "\nlabelOptions cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ncreateAnswer cannot be resolved"
      + "\noptionRules cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\n== cannot be resolved"
      + "\nwording cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nBLACK cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nBLACK cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\noptions cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nquestions cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ncreateComboBoxQuestion cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nwording cannot be resolved"
      + "\nlabelOptions cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\noptions cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nquestions cannot be resolved"
      + "\nadd cannot be resolved"
      + "\npolls cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public Object getUiColor(final /* ColorEnum */Object color) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ColorEnum is undefined for the type Generator"
      + "\nThe method or field Color is undefined for the type Generator"
      + "\nThe method or field ColorEnum is undefined for the type Generator"
      + "\nThe method or field Color is undefined for the type Generator"
      + "\nThe method or field ColorEnum is undefined for the type Generator"
      + "\nThe method or field Color is undefined for the type Generator"
      + "\nThe method or field ColorEnum is undefined for the type Generator"
      + "\nThe method or field Color is undefined for the type Generator"
      + "\nRED cannot be resolved"
      + "\nRED cannot be resolved"
      + "\nGREEN cannot be resolved"
      + "\nGREEN cannot be resolved"
      + "\nBLUE cannot be resolved"
      + "\nBLUE cannot be resolved"
      + "\nBLACK cannot be resolved"
      + "\nBLACK cannot be resolved");
  }
  
  public CharSequence toHtml(final /* Questionnaire */Object questionnaire) {
    throw new Error("Unresolved compilation problems:"
      + "\nPoll cannot be resolved to a type."
      + "\nRadioButtonQuestion cannot be resolved to a type."
      + "\nRadioButtonQuestion cannot be resolved to a type."
      + "\nComboBoxQuestion cannot be resolved to a type."
      + "\npolls cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nliteral cannot be resolved"
      + "\nname cannot be resolved"
      + "\nquestions cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nliteral cannot be resolved"
      + "\nwording cannot be resolved"
      + "\noptions cannot be resolved"
      + "\nwording cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nwording cannot be resolved"
      + "\noptions cannot be resolved");
  }
  
  public CharSequence toGWT(final /* Questionnaire */Object questionnaire) {
    throw new Error("Unresolved compilation problems:"
      + "\nPoll cannot be resolved to a type."
      + "\nQuestion cannot be resolved to a type."
      + "\nRadioButtonQuestion cannot be resolved to a type."
      + "\nRadioButtonQuestion cannot be resolved to a type."
      + "\nComboBoxQuestion cannot be resolved to a type."
      + "\npolls cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nliteral cannot be resolved"
      + "\nname cannot be resolved"
      + "\nquestions cannot be resolved"
      + "\ncolor cannot be resolved"
      + "\nliteral cannot be resolved"
      + "\nwording cannot be resolved"
      + "\noptions cannot be resolved"
      + "\nwording cannot be resolved"
      + "\noptions cannot be resolved");
  }
}
