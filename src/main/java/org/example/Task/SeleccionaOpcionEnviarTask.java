package org.example.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.Ui.HomePage.*;

public class SeleccionaOpcionEnviarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SUBMIT));
    }
    public static SeleccionaOpcionEnviarTask seleccionaOpcionEnviarTask() {
        return instrumented (SeleccionaOpcionEnviarTask.class);
    }
}
