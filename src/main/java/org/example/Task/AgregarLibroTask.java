package org.example.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.Ui.HomePage.*;

public class AgregarLibroTask implements Task {

    private final String book;

    public AgregarLibroTask(String book) {
        this.book = book;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BOOKSTORE),
                Enter.theValue(book).into(TXT_SEARCHBOOK),
                Scroll.to(By.xpath("//a[contains(text(),'"+book+"')]")),
                Click.on(By.xpath("//a[contains(text(),'"+book+"')]")));

        //Se agrega esta espera para que se evidencie que luego de seleccionar el libro se queda en blanco la app
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static AgregarLibroTask agregarLibroTask(String book) {
        return instrumented (AgregarLibroTask.class,book);
    }
}
