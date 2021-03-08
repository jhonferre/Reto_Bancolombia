package co.com.choucair.utest2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFormularioPaso4 {
    public static final Target PASSWORD= Target.the("ingreso de contraseña")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD= Target.the("ingreso de contraseña confirmar")
            .located(By.id("confirmPassword"));
    public static final Target TERMS= Target.the("aceptar terminos")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY= Target.the("aceptar politicas")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE= Target.the("boton completar")
            .located(By.id("laddaBtn"));
    public static final Target WORD= Target.the("boton completar")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));
}
