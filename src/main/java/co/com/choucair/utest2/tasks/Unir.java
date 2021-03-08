package co.com.choucair.utest2.tasks;


import co.com.choucair.utest2.userinterface.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.utest2.userinterface.PaginaInicio.JOIN_TODAY;

public class Unir implements Task {
    public static Unir Ahora() {
        return Tasks.instrumented(Unir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JOIN_TODAY));

    }
}
