package org.example.Questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.example.Ui.HomePage.*;

public class VerificaFormularioNestedFramesQuestions implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_NESTED_FRAMES, isVisible()).forNoMoreThan(15).seconds(),
                Scroll.to(TXT_NESTED_FRAMES));

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        WebElement  iframe = getDriver().findElement(By.id("frame1"));
        getDriver().switchTo().frame(iframe);
        String textoUno = getDriver().findElement(By.tagName("body")).getText();
        System.out.println("El texto del nivel uno es: " + textoUno);

        getDriver().switchTo().frame(0);
        String textoCero = getDriver().findElement(By.tagName("p")).getText();
        System.out.println("El texto del nivel cero es: " + textoCero);

        getDriver().switchTo().defaultContent();

        Serenity.recordReportData().withTitle("Texto iframe grande").andContents(textoUno);
        Serenity.recordReportData().withTitle("Texto iframe chiquito").andContents(textoCero);


        return TXT_NESTED_FRAMES.resolveFor(actor).isPresent();
    }

    public static VerificaFormularioNestedFramesQuestions verificaUsuarioEliminadoQuestions() {
        return new VerificaFormularioNestedFramesQuestions();
    }
}

