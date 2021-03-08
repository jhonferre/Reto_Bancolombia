package co.com.choucair.utest2.questions;

import co.com.choucair.utest2.model.FormularioDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.utest2.userinterface.PaginaFormularioPaso4.WORD;

public class Respuesta implements Question<Boolean> {
    private List<FormularioDatos> datos;

    public Respuesta(List<FormularioDatos> datos) {
        this.datos = datos;
    }

    public static Respuesta aPalabra(List<FormularioDatos> datos) {
        return new Respuesta(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Palabra = Text.of(WORD).viewedBy(actor).asString();
        if (datos.get(0).getWord().equals(Palabra)){result=true;}
        else{result=false;}
        return result;
    }
}
