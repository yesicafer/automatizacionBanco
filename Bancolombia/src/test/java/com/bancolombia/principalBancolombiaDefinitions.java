package com.bancolombia;

import java.util.Map;

//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import net.thucydides.core.annotations.Steps;

 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
 

public class principalBancolombiaDefinitions {
 
	@Steps		
	PrincipalBancolombiaSteps  principalSteps;
	
	@Given("Ingreso a la pagina principal de bancolombia")
	public void openAplication() {
		principalSteps.iniciaPaginaPrincipal();
	}
	

	/*@Given("^Ingreso a la pagina principal de bancolombia$")
	public void ingreso_a_la_pagina_principal_de_bancolombia()   {
		principalSteps.iniciaPaginaPrincipal();
	} */

	@Given("^Solicito productos$")
	public void solicito_productos()  {
		principalSteps.botonSolicitudProducto();
	  
	}

	@Given("^Solicito producto cuenta nomina$")
	public void solicito_producto_cuenta_nomina()  {
		principalSteps.botonSolicitudCuentaNomina();
	 
	}

	@When("^Registra informacion personal$")
	public void registra_informacion_personal(Map<String, String> mapDatosFormulario)  {
	    principalSteps.ingresoDatosPersonales(mapDatosFormulario);
	}

	@Then("^valida inicio encuesta de bancolombia$")
	public void valida_inicio_encuesta_de_bancolombia()   {
	    principalSteps.comparoTituloEncuesta();
	}


	
}
