package org.example.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.example.Ui.HomePage.BTN_LOGIN;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class VerificaUsuarioEliminadoQuestions implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        String alertText = getDriver().switchTo().alert().getText();
        getDriver().switchTo().alert().accept();


        System.out.println("Texto de la alerta: " + alertText);

        return BTN_LOGIN.resolveFor(actor).isPresent();
    }

    public static VerificaUsuarioEliminadoQuestions verificaUsuarioEliminadoQuestions() {
        return new VerificaUsuarioEliminadoQuestions();
    }
}

