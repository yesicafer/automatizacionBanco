package com.bancolombia;

//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;

//import junit.framework.Assert;
import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
 

//import net.thucydides.core.annotations.findby.By;
 
public class PaginaPrincipalPageObect extends PageObject{
	String comparoTituloEncuesta = " ¿Tienes el número Nit de la empresa? ";
	//String slsTipoCC="//input[@value='%s']";
	
	String slsTipoCC="//input[@value='%s']";
	
	@FindBy(id="header-solicitud-productos")
	WebElementFacade btnSolicitudProductos;
	
	
	@FindBy (id="solicita-cuenta-2")
	WebElementFacade btnSolicitaCuentaAhoro;
	
	@FindBy (xpath="//input[@id='bc-select1-input']")
	WebElementFacade slsTipoDocumento;
		
	@FindBy (xpath="//*[@class='show-list']")
	WebElementFacade slsTipoDocumentoSeleccionado;
	
	
	@FindBy (xpath="//*[@id='numeroDocumento' and @class='ng-untouched ng-pristine ng-invalid bc-input']")
	WebElementFacade txtnumeroDocumento;
	
	@FindBy (xpath="//*[@id='numeroDocumento' and @class='ng-pristine ng-invalid bc-input ng-touched bc-input-error']")
	WebElementFacade txtnumeroDocumento2;
	
	@FindBy (id="numeroCelular")
	WebElementFacade txgtnumeroCelular;
	

	@FindBy (id="correoElectronico")
	WebElementFacade txgtCorreoElectronico;
	

	@FindBy (xpath="//span[@class='bc-chk-web']")
	WebElementFacade slcAutorizaBancolombia;
	
	@FindBy (id="next-butt")
	WebElementFacade btnSiguiente;
	
	@FindBy (xpath="//*[@class='font-dark-nt-24' and contains(text(),' ¿Tienes el número Nit de la empresa? ') ]")
	WebElementFacade tltNitEmpresa;
	
	public void alertaAceptar()
	{
		
		Alert alert =getDriver().switchTo().alert();
		alert.accept();
	}
	
	public void botonSolicitudProducto() {
		btnSolicitudProductos.click();
		
	}
	
	public void botonSolicitudCuentaAhorro() {
		btnSolicitaCuentaAhoro.click();
		
	}
	
	public void seleccionaTipoDocumento() {
	
	slsTipoDocumento.click();
	slsTipoDocumentoSeleccionado.click();
	
	}
	
	public void inputNumeroDocumento(String numeroDoc) {
		System.out.println("imprimee "+numeroDoc);
	    
		txtnumeroDocumento.click();
		txtnumeroDocumento.sendKeys(numeroDoc);

		
	}
	
	 /*private CharSequence keysToSend(String numeroDoc) {
		// TODO Auto-generated method stub
		return null;
	} NEVER USED */

	public void inputNumeroCelular(String numeroCel) {
		txgtnumeroCelular.sendKeys(numeroCel+Keys.ENTER);
			
		}
	
	public void inputCorreoElectronico(String correoElectronico) {
		System.out.println(correoElectronico);
		txgtCorreoElectronico.click();
	//	txgtCorreoElectronico.typeAndEnter(correoElectronico);
		txgtCorreoElectronico.sendKeys(correoElectronico);
			
		}
	
	public void seleccionaAutorizaBancolombia() {
		slcAutorizaBancolombia.click();
			
		}
	
	public void botonContinuarDatosPesonales() {
		 btnSiguiente.click();
			
		}
	
	public void comparoTituloEncuesta() {
		 Assert.assertEquals(tltNitEmpresa.getText(), comparoTituloEncuesta);
		
	}
	
	
}
