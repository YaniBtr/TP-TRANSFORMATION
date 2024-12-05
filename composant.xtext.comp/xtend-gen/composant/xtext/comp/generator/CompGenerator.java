/**
 * generated by Xtext 2.26.0
 */
package composant.xtext.comp.generator;

import com.google.common.collect.Iterators;
import composant.Composant;
import composant.Connecteur;
import composant.Direction;
import composant.Port;
import composant.Property;
import java.util.Objects;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CompGenerator extends AbstractGenerator {
  public static String toJava(final Composant c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import javax.swing.JFrame;");
    _builder.newLine();
    _builder.append("import java.awt.Dimension;");
    _builder.newLine();
    _builder.append("import javax.swing.JPanel;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class C");
    String _name_1 = c.getName();
    _builder.append(_name_1);
    _builder.append(" extends JFrame {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private JPanel panneau = new JPanel();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public C");
    String _name_2 = c.getName();
    _builder.append(_name_2, "\t");
    _builder.append(" (String nom, int hauteur, int largeur) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("setTitle(nom);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setSize(new Dimension(largeur, hauteur));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("init");
    String _name_3 = c.getName();
    _builder.append(_name_3, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("setContentPane(panneau);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setVisible(true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("new C");
    String _name_4 = c.getName();
    _builder.append(_name_4, "\t\t");
    _builder.append("(\"");
    String _name_5 = c.getName();
    _builder.append(_name_5, "\t\t");
    _builder.append("\", 400, 900);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void init");
    String _name_6 = c.getName();
    _builder.append(_name_6, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    {
      EList<Composant> _fils = c.getFils();
      for(final Composant sc : _fils) {
        _builder.append("\t\t");
        _builder.append("//");
        String _name_7 = sc.getName();
        _builder.append(_name_7, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        final Function1<Property, Boolean> _function = (Property it) -> {
          String _clee = it.getClee();
          return Boolean.valueOf(Objects.equals(_clee, "type"));
        };
        String typeComposant = IterableExtensions.<Property>head(IterableExtensions.<Property>filter(sc.getProperties(), _function)).getValeur();
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append(typeComposant, "\t\t");
        _builder.append(" ");
        String _name_8 = sc.getName();
        _builder.append(_name_8, "\t\t");
        _builder.append(" = new ");
        _builder.append(typeComposant, "\t\t");
        _builder.append("(\"");
        String _name_9 = sc.getName();
        _builder.append(_name_9, "\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("panneau.add(");
        String _name_10 = sc.getName();
        _builder.append(_name_10, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        {
          final Function1<Port, Boolean> _function_1 = (Port it) -> {
            Direction _direction = it.getDirection();
            return Boolean.valueOf(Objects.equals(_direction, Direction.OUT));
          };
          Iterable<Port> _filter = IterableExtensions.<Port>filter(sc.getPorts(), _function_1);
          for(final Port p : _filter) {
            _builder.append("\t\t");
            _builder.append("OutputPort port");
            String _name_11 = sc.getName();
            _builder.append(_name_11, "\t\t");
            _builder.append("_");
            String _name_12 = p.getName();
            _builder.append(_name_12, "\t\t");
            _builder.append(" = ");
            String _name_13 = sc.getName();
            _builder.append(_name_13, "\t\t");
            _builder.append(".getPort_");
            String _name_14 = p.getName();
            _builder.append(_name_14, "\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("repaint();");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Connecteur> _connecteurs = c.getConnecteurs();
      for(final Connecteur cnt : _connecteurs) {
        _builder.append("\t\t");
        _builder.append("Connecteur ");
        String _name_15 = cnt.getName();
        _builder.append(_name_15, "\t\t");
        _builder.append(" = new Connecteur(");
        String _name_16 = cnt.getDst().getComposant().getName();
        _builder.append(_name_16, "\t\t");
        _builder.append(".getPort_");
        String _name_17 = cnt.getDst().getName();
        _builder.append(_name_17, "\t\t");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("port");
        String _name_18 = cnt.getSrc().getComposant().getName();
        _builder.append(_name_18, "\t\t");
        _builder.append("_");
        String _name_19 = cnt.getSrc().getName();
        _builder.append(_name_19, "\t\t");
        _builder.append(".ajouterConnecteur(");
        String _name_20 = cnt.getName();
        _builder.append(_name_20, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    return _builder.toString();
  }

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Function1<Composant, Boolean> _function = (Composant it) -> {
      Composant _pere = it.getPere();
      return Boolean.valueOf((_pere == null));
    };
    Set<Composant> _set = IteratorExtensions.<Composant>toSet(IteratorExtensions.<Composant>filter(Iterators.<Composant>filter(resource.getAllContents(), Composant.class), _function));
    for (final Composant c : _set) {
      String _name = c.getName();
      String _plus = ("C" + _name);
      String _plus_1 = (_plus + ".java");
      fsa.generateFile(_plus_1, CompGenerator.toJava(c));
    }
  }
}
