package org.example.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.Ui.HomePage.*;

public class SeleccionaOpcionOkTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_OK));
    }
    public static SeleccionaOpcionOkTask seleccionaOpcionLoginTask() {
        return instrumented (SeleccionaOpcionOkTask.class);
    }
}
