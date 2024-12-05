/*
 * generated by Xtext 2.26.0
 */
package composant.xtext.comp.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import composant.Composant
import composant.Direction

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CompGenerator extends AbstractGenerator {

	static def String toJava(Composant c)
	'''
	package �c.name�;
	import javax.swing.JFrame;
	import java.awt.Dimension;
	import javax.swing.JPanel;
	
	public class C�c.name� extends JFrame {
	
		private static final long serialVersionUID = 1L;
		
		private JPanel panneau = new JPanel();
	
		public C�c.name� (String nom, int hauteur, int largeur) {
			setTitle(nom);
			setSize(new Dimension(largeur, hauteur));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			init�c.name�();
			setContentPane(panneau);
			setVisible(true);
		}
		
		public static void main(String[] args) {
			new C�c.name�("�c.name�", 400, 900);
		}
			
		private void init�c.name�() {
			�FOR sc : c.fils�
				//�sc.name�
				�var typeComposant = sc.properties.filter[clee=="type"].head.valeur�
				�typeComposant� �sc.name� = new �typeComposant�("�sc.name�");
				panneau.add(�sc.name�);
				�FOR p : sc.ports.filter[direction == Direction.OUT]�
					OutputPort port�sc.name�_�p.name� = �sc.name�.getPort_�p.name�();
				�ENDFOR�
			�ENDFOR�
			
			repaint();
	
			�FOR cnt : c.connecteurs�
				Connecteur �cnt.name� = new Connecteur(�cnt.dst.composant.name�.getPort_�cnt.dst.name�());
				port�cnt.src.composant.name�_�cnt.src.name�.ajouterConnecteur(�cnt.name�);
			�ENDFOR�
		}
	
	}'''

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (c : resource.allContents.filter(Composant).filter[pere===null].toSet)
			fsa.generateFile('C'+c.name+'.java', c.toJava)
	}
}
