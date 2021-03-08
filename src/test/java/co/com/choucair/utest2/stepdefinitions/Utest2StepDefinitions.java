package co.com.choucair.utest2.stepdefinitions;
import co.com.choucair.utest2.model.FormularioDatos;
import co.com.choucair.utest2.questions.Respuesta;
import co.com.choucair.utest2.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Utest2StepDefinitions {

    @Before
    public void setStage(){ setTheStage(new OnlineCast());}
    @Given("^Estoy en Utest Para registrarme$")
    public void estoyEnUtestParaRegistrarme() {
        theActorCalled("nuevo usuario").wasAbleTo(Abrir.LaPagina(), Unir.Ahora());
    }

    @When("^Lleno el formulario de registro$")
    public void llenoElFormularioDeRegistro(List<FormularioDatos> datos) {
        theActorInTheSpotlight().attemptsTo(LlenarPaso1.DatosPersonales(datos), LlenarPaso2.Ubicacion(datos), LlenarPaso3.Divice(datos),LlenarPaso4.Contrasena(datos));

    }

    @Then("^El Registro se completa$")
    public void elRegistroSeCompleta(List<FormularioDatos> datos) {
        theActorInTheSpotlight().should(seeThat(Respuesta.aPalabra(datos)));

    }



}
