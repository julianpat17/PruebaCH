package pagesObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class ChoucairEmpleosPage extends PageObject {

    @FindBy (xpath = "//li[@id='menu-item-550']//a[@href='https://www.choucairtesting.com/empleos-testing/']")
    WebElementFacade buttonEmpleos;

    @FindBy(xpath = "//a[@href='#ser']//img[@title='serchazuleMesa de trabajo 1']")
    WebElementFacade serChButton;

    @FindBy (xpath = "//a[@href='#convocatorias']//img[@title='empleosazuleMesa de trabajo 1']")
    WebElementFacade convocatoriasDispButton;

    @FindBy (xpath = "//input[@type='submit']")
    WebElementFacade buttonBuscar;

    @FindBy (xpath = "//li[@class='post-7547 job_listing type-job_listing status-publish has-post-thumbnail hentry']")
    WebElementFacade vacanteEscogida;

    @FindBy (xpath = "//input[@id='search_keywords']")
    WebElementFacade busquedaEmpleoNombre;

    @FindBy (xpath = "//input[@id='search_location']")
    WebElementFacade busquedaEmpleoLocalizacion;

    @FindBy (xpath = "//span[@class='tagline']")
    WebElementFacade seleccionarVacante;

    @FindBy(xpath = "//input[@type='button']")
    WebElementFacade aplicarEmpleoBut;

    @FindBy (xpath = "//input[@id='nombre-completo']")
    WebElementFacade nombreForm;

    @FindBy(xpath = "//input[@id='correo-electronico']")
    WebElementFacade correoForm;

    @FindBy(xpath = "//input[@id='celular-o-telefono-de-contacto']")
    WebElementFacade celularForm;

    @FindBy (xpath = "//textarea[@id='que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente']")
    WebElementFacade formacionForm;

    @FindBy (xpath = "//textarea[@id='que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica']")
    WebElementFacade experienciaForm;

    @FindBy (xpath = "//textarea[@id='conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica']")
    WebElementFacade conocimientosAutoForm;

    @FindBy (xpath = "//input[@id='cual-es-tu-aspiracion-salarial']")
    WebElementFacade salarioForm;

    @FindBy (xpath = "//input[@id='si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias']")
    WebElementFacade dispTiempoForm;

    @FindBy (xpath = "//textarea[@id='mensaje-adicional']")
    WebElementFacade mensajeAdicionalForm;

    @FindBy (xpath = "//input[@type='submit']")
    WebElementFacade enviarAplicacionButton;

    @FindBy (xpath = "//input[@type='file']")
    WebElementFacade subirArchivoButton;

    @FindBy (xpath = "//input[@id='cv']")
    WebElementFacade seleccionarArchivoCv;

    @FindBy (xpath = "//p[@class='job-manager-message']")
    WebElementFacade menssageFinish;

    public void buttonEmpleos(){
        buttonEmpleos.click();
    }

    public void serChoucair (){
        serChButton.click();

    }

    public void convocatoriasDisponibles (){
        buttonEmpleos.click();
        convocatoriasDispButton.click();

    }

    public void buscarVancanteNombre(){
        waitFor(busquedaEmpleoNombre).waitUntilClickable();
        busquedaEmpleoNombre.type("Analista de Pruebas Medellín y Bogotá");
        waitFor(busquedaEmpleoLocalizacion).waitUntilClickable().and().click();

    }

     public void aplicarAVacante (){
       waitFor(seleccionarVacante).waitUntilClickable().and().click();

    }

    public void aplicarEmpleo(){
       waitFor(10).second().clickOn(aplicarEmpleoBut);
    }

    public void llenarFormulario(){

       // nombreForm.type(Parameters.getItem(0));
       /*
       correoForm.type(parametros.get(1));
       celularForm.type(parametros.get(2));
       formacionForm.type(parametros.get(3));
       experienciaForm.type(parametros.get(4));
       conocimientosAutoForm.type(parametros.get(5));
       salarioForm.type(parametros.get(6));
       dispTiempoForm.type(parametros.get(7));
       mensajeAdicionalForm.type(parametros.get(8));

        */

       nombreForm.click();
       nombreForm.clear();
       nombreForm.sendKeys("Juan Perez");
       correoForm.sendKeys("juan@gmail.com");
       celularForm.sendKeys("3001234567");
       formacionForm.sendKeys("ingeniero de sistemas");
       experienciaForm.sendKeys("ninguna");
       conocimientosAutoForm.sendKeys("conceptos basicos");
       salarioForm.sendKeys("2000000");
       dispTiempoForm.sendKeys("Inmediato");
       mensajeAdicionalForm.sendKeys("Deseo participar en la convocatoria");
       seleccionarArchivoCv.sendKeys("C:\\Users\\Julian Patiño\\IdeaProjects\\PruebaChoucair\\src\\test\\resources\\dataDrive\\prueba.png");

    }

    public void enviarAplicacionVacante(){
        enviarAplicacionButton.click();
    }

    public void verificacion() {

        String verificar = menssageFinish.getText();

        if (verificar.equals(menssageFinish)) {
            System.out.println("Test Pass");
        }else{
                System.out.println("Test Fail");

        }
    }
}
