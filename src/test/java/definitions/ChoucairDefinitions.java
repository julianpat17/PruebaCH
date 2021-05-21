package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ChoucairPageSteps;

import java.util.List;

public class ChoucairDefinitions {

    @Steps
    ChoucairPageSteps choucairPageSteps;

    @Given("^I open the main page$")
    public void iOpenTheMainPage() {
        choucairPageSteps.iOpenPage();

    }

    @Given("^I click on the jobs button$")
    public void iClickOnTheJobsButton() {
        choucairPageSteps.clickOnEmpleosButton();

    }

    @Given("^I click on jobs$")
    public void iClickOnJobs() {
        choucairPageSteps.clickOnSerCHButton();

    }

    @Then("^I look at the available vacancies$")
    public void iLookAtTheAvailableVacancies() {
        choucairPageSteps.clickOnConvocatorias();

    }

    @Then("^write the name of the vacancy$")
    public void writeTheNameOfTheVacancy() {
        choucairPageSteps.buscarVacante();
    }

    @Then("^I select the vacancy$")
    public void iselectTheVacancy() {
        choucairPageSteps.aplicarVacante();

    }

    @Then("^I click on the button apply to vacancy$")
    public void i_ClickOnTheButtonApplyToVacancy() {
        choucairPageSteps.aplicarEmpleoButton();

    }

    @Then("^I write my personal information$")
    public void iWriteMyPersonalInformation() {

        choucairPageSteps.llenarForm();
    }


    @Then("^Click on the button submit application$")
    public void clickOnTheButtonSubmitApplication() {

    }

    @Then("^Finish the application correctly$")
    public void finishTheApplicationCorrectly() {
        choucairPageSteps.verify();

    }

    @And("^I click on the button apply to vacancy <Nombre>,<Correo>,<Celular>,<Formacion>,<Experiencia>,<ConocimientoAut>,<Salario>,<Disponibilidad>,<MensajeAdicional>$")
    public void iClickOnTheButtonApplyToVacancyNombreCorreoCelularFormacionExperienciaConocimientoAutSalarioDisponibilidadMensajeAdicional() {
    }
}
