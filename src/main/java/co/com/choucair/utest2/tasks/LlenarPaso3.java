package co.com.choucair.utest2.tasks;

import co.com.choucair.utest2.model.FormularioDatos;
import co.com.choucair.utest2.userinterface.PaginaFormularioPaso3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.utest2.userinterface.PaginaFormularioPaso3.*;

public class LlenarPaso3 implements Task {
    private List<FormularioDatos> datos;

    public LlenarPaso3(List<FormularioDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaso3 Divice(List<FormularioDatos> datos) {
        return Tasks.instrumented(LlenarPaso3.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER),
                Enter.theValue(datos.get(0).getComputer()).into(COMPUTER_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(VERSION),
                Enter.theValue(datos.get(0).getVersion()).into(VERSION_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LANGUAGE),
                Enter.theValue(datos.get(0).getLanguague()).into(LANGUAGE_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(MOBILE),
                Enter.theValue(datos.get(0).getMobile()).into(MOBILE_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(MODEL),
                Enter.theValue(datos.get(0).getModel()).into(MODEL_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(SYSTEM),
                Enter.theValue(datos.get(0).getSystem()).into(SYSTEM_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LAST_STEP)

                );

    }
}
