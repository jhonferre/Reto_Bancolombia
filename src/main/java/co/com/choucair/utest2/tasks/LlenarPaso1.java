package co.com.choucair.utest2.tasks;

import co.com.choucair.utest2.model.FormularioDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.utest2.userinterface.PaginaFormularioPaso1.*;

public class LlenarPaso1 implements Task {
    private  List<FormularioDatos> datos;

    public LlenarPaso1(List<FormularioDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaso1 DatosPersonales(List<FormularioDatos> datos) {
        return Tasks.instrumented(LlenarPaso1.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getFirstName()).into(FIRST_NAME),
                Enter.theValue(datos.get(0).getLastName()).into(LAST_NAME),
                Enter.theValue(datos.get(0).geteMail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getMonth()).from(MONTH),
                SelectFromOptions.byVisibleText(datos.get(0).getDay()).from(DAY),
                SelectFromOptions.byVisibleText(datos.get(0).getYear()).from(YEAR),
                Click.on(NEXT_LOCATION));

    }
}
