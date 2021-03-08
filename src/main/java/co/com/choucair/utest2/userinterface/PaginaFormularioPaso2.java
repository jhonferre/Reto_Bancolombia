package co.com.choucair.utest2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFormularioPaso2 {
    public static final Target CITY= Target.the("ingreso de ciudad")
            .located(By.id("city"));
    public static final Target ZIP= Target.the("ingreso de codigo postal")
            .located(By.id("zip"));
    public static final Target COUNTRY= Target.the("ingreso de pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target COUNTRY_INPUT= Target.the("ingreso texto de pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DIVICES= Target.the("boton siguiente")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
