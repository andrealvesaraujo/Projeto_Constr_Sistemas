package br.eic.sca.modules.sem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;

import br.eic.sca.api.ScaModule;
import br.eic.sca.core.security.Permission;

@DependsOn("sieModule")
@ComponentScan("br.eic.sca.modules.sem")
public class SemModule extends ScaModule
{
	@Override
	public String getName() 
	{
		return "Seminário";
	}
	
	@Override
	public Permission[] providePermissions() 
	{
		return new Permission[] 
		{
			new Permission("Seminários", "Relação Seminários", "/sem/seminario.jsf" , "ADMIN")          			
		};
	}
}