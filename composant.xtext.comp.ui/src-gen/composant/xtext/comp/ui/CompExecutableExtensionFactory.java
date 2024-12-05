/*
 * generated by Xtext 2.26.0
 */
package composant.xtext.comp.ui;

import com.google.inject.Injector;
import composant.xtext.comp.ui.internal.CompActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CompExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(CompActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		CompActivator activator = CompActivator.getInstance();
		return activator != null ? activator.getInjector(CompActivator.COMPOSANT_XTEXT_COMP_COMP) : null;
	}

}
