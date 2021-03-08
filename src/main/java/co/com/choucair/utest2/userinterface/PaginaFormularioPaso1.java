package co.com.choucair.utest2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFormularioPaso1 {
    public static final Target FIRST_NAME= Target.the("ingreso de primer nombre")
            .located(By.id("firstName"));
    public static final Target LAST_NAME= Target.the("ingreso de Apellidos")
            .located(By.id("lastName"));
    public static final Target EMAIL= Target.the("ingreso de correo")
            .located(By.id("email"));
    public static final Target MONTH= Target.the("ingreso de mes de nacimiento")
            .located(By.id("birthMonth"));
    public static final Target DAY= Target.the("ingreso de dia de nacimiento")
            .located(By.id("birthDay"));
    public static final Target YEAR= Target.the("ingreso de año de nacimiento")
            .located(By.id("birthYear"));
    public static final Target NEXT_LOCATION= Target.the("boton siguiente")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
