package org.example.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.Ui.HomePage.BTN_LOGIN;

public class SeleccionaOpcionLoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN));
    }
    public static SeleccionaOpcionLoginTask seleccionaOpcionLoginTask() {
        return instrumented (SeleccionaOpcionLoginTask.class);
    }
}
