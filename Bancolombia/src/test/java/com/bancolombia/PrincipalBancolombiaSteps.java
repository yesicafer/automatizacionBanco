package com.bancolombia;

import java.util.Map;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.actions.OpenUrl;
import pagina.bancolombia.BancolombiaPageObject;
import org.junit.Assert;


public class PrincipalBancolombiaSteps {
	BancolombiaPageObject  principalPageObjet;
	PaginaPrincipalPageObect     paginaPrincipalPageObject;
	
	
	@Step	
	public void iniciaPaginaPrincipal (){
		
		principalPageObjet.open();	
        System.out.println("Page is opened");

	}
	
	

	@Step
	
	public void botonSolicitudProducto () {
		paginaPrincipalPageObject.botonSolicitudProducto();
		
	}
	
	@Step
	
	public void botonSolicitudCuentaNomina () {
		paginaPrincipalPageObject.botonSolicitudCuentaAhorro();
		
	}
	
	@Step
	
	public void ingresoDatosPersonales (Map<String, String> mapDatosFormulario) {
		paginaPrincipalPageObject.seleccionaTipoDocumento();
		//paginaPrincipalPageObject.inputNumeroDocumento(mapDatosFormulario.get("numero documento"));
		//paginaPrincipalPageObject.inputNumeroCelular(mapDatosFormulario.get("numero celular"));
		paginaPrincipalPageObject.inputCorreoElectronico(mapDatosFormulario.get("correo electronico"));
		paginaPrincipalPageObject.seleccionaAutorizaBancolombia();
		paginaPrincipalPageObject. botonContinuarDatosPesonales();
	}
	
	@Step
	
	public void comparoTituloEncuesta() {
		
		paginaPrincipalPageObject.comparoTituloEncuesta();
	}
}
