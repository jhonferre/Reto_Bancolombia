package co.com.choucair.utest2.tasks;

import co.com.choucair.utest2.model.FormularioDatos;
import co.com.choucair.utest2.userinterface.PaginaFormularioPaso4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.utest2.userinterface.PaginaFormularioPaso4.*;

public class LlenarPaso4 implements Task {
    private List<FormularioDatos> datos;

    public LlenarPaso4(List<FormularioDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaso4 Contrasena(List<FormularioDatos> datos) {
        return Tasks.instrumented(LlenarPaso4.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getPassword()).into(PASSWORD),
                Enter.theValue(datos.get(0).getPassword()).into(CONFIRM_PASSWORD),
                Click.on(TERMS),
                Click.on(PRIVACY),
                Click.on(COMPLETE));

    }
}
