package steps;

import net.thucydides.core.annotations.Step;
import pagesObject.ChoucairEmpleosPage;
import pagesObject.ChoucairPage;

import java.lang.reflect.Parameter;
import java.util.List;

public class ChoucairPageSteps {

        ChoucairEmpleosPage choucairEmpleosPage;
        ChoucairPage choucairPage;

        @Step
        public void iOpenPage (){
            choucairPage.open();
        }

        @Step
        public void clickOnEmpleosButton (){
            choucairEmpleosPage.buttonEmpleos();
        }

        @Step
        public void clickOnSerCHButton (){
            choucairEmpleosPage.serChoucair();
        }

        @Step
        public void clickOnConvocatorias (){choucairEmpleosPage.convocatoriasDisponibles(); }

        @Step
        public void buscarVacante(){choucairEmpleosPage.buscarVancanteNombre();}

        @Step
        public void aplicarVacante(){
            choucairEmpleosPage.aplicarAVacante();
        }

        @Step
        public void aplicarEmpleoButton(){
            choucairEmpleosPage.aplicarEmpleo();
        }

        @Step
        public void llenarForm(){choucairEmpleosPage.llenarFormulario(); }

        public void verify(){choucairEmpleosPage.verificacion(); }

    }