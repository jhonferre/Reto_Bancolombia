package co.com.choucair.utest2.tasks;

import co.com.choucair.utest2.model.FormularioDatos;
import co.com.choucair.utest2.userinterface.PaginaFormularioPaso2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.utest2.userinterface.PaginaFormularioPaso2.*;

public class LlenarPaso2 implements Task {
    private List<FormularioDatos> datos;

    public LlenarPaso2(List<FormularioDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaso2 Ubicacion(List<FormularioDatos> datos) {
        return Tasks.instrumented(LlenarPaso2.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getCity()).into(CITY),
                Enter.theValue(datos.get(0).getZip()).into(ZIP),
                Click.on(COUNTRY),
                Enter.theValue(datos.get(0).getCountry()).into(COUNTRY_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(NEXT_DIVICES));

    }
}
