package org.example.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Open;
import org.example.Questions.*;
import org.example.Task.*;
import org.example.Ui.HomePage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CasosDePruebaSteps {

    private HomePage homePage = new HomePage();

    @Given("^El usuario (.*) se encuentra en la aplicacion$")
    public void elUsuarioCiroSeEncuentraEnLaAplicacion(String nombreUser) {
        theActorCalled(nombreUser).wasAbleTo(Open.browserOn(homePage));
        getDriver().manage().window().maximize();
    }

    @When("^El usuario ingresa sus datos personales \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void elUsuarioIngresaSusDatosPersonales(String firstName, String lastName, String userName, String password)  {
        theActorInTheSpotlight().wasAbleTo(IngresarDatosTask.ingresarDatosTask(firstName,lastName,userName,password));
        Serenity.takeScreenshot();
    }

    @And("^Selecciona la opción registrarse$")
    public void seleccionaLaOpcionRegistrarse() {
        theActorInTheSpotlight().wasAbleTo(SeleccionaOpcionRegistrarTask.seleccionaOpcionRegistrarTask());
        Serenity.takeScreenshot();
    }

    @Then("^El sistema alertara que verifique el reCaptcha$")
    public void elSistemaAlertaraQueVerifiqueElReCaptcha() {
        VerificaReCaptchaQuestions.verificaReCaptchaQuestions().answeredBy(theActorInTheSpotlight());
    }

    @When("^Busca y agrega el libro \"([^\"]*)\"$")
    public void buscaYAgregaElLibro(String book) {
        theActorInTheSpotlight().wasAbleTo(AgregarLibroTask.agregarLibroTask(book));
        Serenity.takeScreenshot();
    }

    @When("^El usuario ingresa sus credenciales \"([^\"]*)\",\"([^\"]*)\"$")
    public void elUsuarioIngresaSusCredenciales(String userName, String password) {
        theActorInTheSpotlight().wasAbleTo(IngresarCredencialesTask.ingresarCredencialesTask(userName, password));
        Serenity.takeScreenshot();
    }

    @And("^Selecciona la opción login$")
    public void seleccionaLaOpcionLogin() {
        theActorInTheSpotlight().wasAbleTo(SeleccionaOpcionLoginTask.seleccionaOpcionLoginTask());
        Serenity.takeScreenshot();
    }

    @Then("^Se muestra el perfil del usuario$")
    public void seMuestraElPerfilDelUsuario() {
        VerificaAutenticacionQuestions.verificaAutenticacionQuestions().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @When("^Selecciona la opción eliminar$")
    public void seleccionaLaOpcionEliminar() {
        theActorInTheSpotlight().wasAbleTo(SeleccionaEliminarTask.seleccionaEliminarTask());
        Serenity.takeScreenshot();
    }

    @Then("^El sistema alerta al usuario si esta seguro de eliminar la cuenta$")
    public void elSistemaAlertaAlUsuarioSiEstaSeguroDeEliminarLaCuenta() {
        VerificaConfirmacionEliminarQuestions.verificaConfirmacionEliminarQuestions().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @When("^Selecciona la opción ok$")
    public void seleccionaLaOpcionOk() {
       theActorInTheSpotlight().attemptsTo(SeleccionaOpcionOkTask.seleccionaOpcionLoginTask());
        Serenity.takeScreenshot();
    }

    @Then("^Se muestra informa que el usuario fue eliminado$")
    public void seMuestraInformaQueElUsuarioFueEliminado() {
        VerificaUsuarioEliminadoQuestions.verificaUsuarioEliminadoQuestions().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @Then("^Se alerta al usuario que las credenciales son invalidas$")
    public void seAlertaAlUsuarioQueLasCredencialesSonInvalidas() {
        VerificaCuentaEliminadaQuestions.verificaCuentaEliminadaQuestions().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @When("^Selecciona la opción nested frames$")
    public void seleccionaLaOpcionNestedFrames() {
        theActorInTheSpotlight().wasAbleTo(SeleccionaOpcionNestedFramesTask.seleccionaOpcionNestedFramesTask());
        Serenity.takeScreenshot();
    }

    @Then("^Se muestra al usuario el formulario nested frames y captura los valores$")
    public void seMuestraAlUsuarioElFormularioNestedFramesYCapturaLosValores() {
        VerificaFormularioNestedFramesQuestions.verificaUsuarioEliminadoQuestions().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @When("^Selecciona la opción practice form$")
    public void seleccionaLaOpcionPracticeForm() {
        theActorInTheSpotlight().wasAbleTo(SeleccionaOpcionPracticeFormTask.seleccionaOpcionPracticeFormTask());
        Serenity.takeScreenshot();
    }

    @Then("^Se muestra al usuario el formulario practice form$")
    public void seMuestraAlUsuarioElFormularioPracticeForm() {
        VerificaFormularioPracticeFormQuestions.verificaFormularioPracticeFormQuestions().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @When("^El usuario diligencia la información solicitada \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void elUsuarioDiligenciaLaInformacionSolicitada(String firstName, String lastName, String email, String mobile, String dateBirth, String subjects, String hobbies, String currentAddress, String state, String city) {
        theActorInTheSpotlight().wasAbleTo(IngresarDatosEstudianteTask.ingresarDatosEstudianteTask(firstName, lastName, email, mobile, dateBirth, subjects, hobbies, currentAddress, state, city));
        Serenity.takeScreenshot();
    }

    @And("^Selecciona la opción enviar$")
    public void seleccionaLaOpcionEnviar() {
        theActorInTheSpotlight().attemptsTo(SeleccionaOpcionEnviarTask.seleccionaOpcionEnviarTask());
        Serenity.takeScreenshot();
    }
}
