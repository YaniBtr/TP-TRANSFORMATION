/*
 * generated by Xtext 2.26.0
 */
package composant.xtext.comp.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import composant.xtext.comp.CompRuntimeModule;
import composant.xtext.comp.CompStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CompIdeSetup extends CompStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CompRuntimeModule(), new CompIdeModule()));
	}
	
}
