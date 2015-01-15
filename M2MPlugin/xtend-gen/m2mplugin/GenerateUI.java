package m2mplugin;

import com.google.common.base.Objects;
import fr.istic.idm.pivotMM.CheckBox;
import fr.istic.idm.pivotMM.PollSystem;
import fr.istic.idm.pivotMM.RadioButton;
import fr.istic.idm.pivotMM.TextField;
import fr.istic.idm.pivotMM.UiModel;
import fr.istic.idm.pivotMM.Widget;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenerateUI {
  public CharSequence toHtml(final PollSystem pollS) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<title>");
    String _title = pollS.getTitle();
    _builder.append(_title, "\t");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<h1 style=\"color:rouge\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Le questionnaire sur ");
    String _title_1 = pollS.getTitle();
    _builder.append(_title_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</h1>");
    _builder.newLine();
    {
      EList<UiModel> _models = pollS.getModels();
      for(final UiModel p : _models) {
        {
          String _id = p.getId();
          boolean _notEquals = (!Objects.equal(_id, null));
          if (_notEquals) {
            _builder.append("<p>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<h4>Question n° ");
            String _id_1 = p.getId();
            _builder.append(_id_1, "\t");
            _builder.append(" : ");
            String _laQuestion = p.getLaQuestion();
            _builder.append(_laQuestion, "\t");
            _builder.append("</h4>");
            _builder.newLineIfNotEmpty();
            {
              EList<Widget> _widgets = p.getWidgets();
              Widget _get = _widgets.get(0);
              if ((_get instanceof CheckBox)) {
                {
                  EList<Widget> _widgets_1 = p.getWidgets();
                  for(final Widget o : _widgets_1) {
                    _builder.append("\t");
                    _builder.append("<INPUT type=\"");
                    EClass _eClass = o.eClass();
                    String _name = _eClass.getName();
                    _builder.append(_name, "\t");
                    _builder.append("\" name=\"");
                    String _value = o.getValue();
                    _builder.append(_value, "\t");
                    _builder.append("\">");
                    String _value_1 = o.getValue();
                    _builder.append(_value_1, "\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            {
              EList<Widget> _widgets_2 = p.getWidgets();
              Widget _get_1 = _widgets_2.get(0);
              if ((_get_1 instanceof TextField)) {
                {
                  EList<Widget> _widgets_3 = p.getWidgets();
                  for(final Widget o_1 : _widgets_3) {
                    _builder.append("\t");
                    String _value_2 = o_1.getValue();
                    _builder.append(_value_2, "\t");
                    _builder.append(" : <input name=\"");
                    String _value_3 = o_1.getValue();
                    _builder.append(_value_3, "\t");
                    _builder.append("\"> &nbsp&nbsp");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.newLine();
              }
            }
            {
              EList<Widget> _widgets_4 = p.getWidgets();
              Widget _get_2 = _widgets_4.get(0);
              if ((_get_2 instanceof RadioButton)) {
                _builder.append("\t");
                _builder.append("<select name=\"widget\">");
                _builder.newLine();
                {
                  EList<Widget> _widgets_5 = p.getWidgets();
                  for(final Widget o_2 : _widgets_5) {
                    _builder.append("\t");
                    _builder.append("<option>");
                    String _value_4 = o_2.getValue();
                    _builder.append(_value_4, "\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("</select>\t\t");
                _builder.newLine();
              }
            }
            _builder.append("</p>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<button type=\"button\">Sousmettre</button>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
