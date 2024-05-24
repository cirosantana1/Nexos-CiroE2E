package org.example.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static org.example.Ui.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionaOpcionRegistrarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_REGISTER),
                Click.on(BTN_REGISTER));
    }
    public static SeleccionaOpcionRegistrarTask seleccionaOpcionRegistrarTask() {
        return instrumented (SeleccionaOpcionRegistrarTask.class);
    }
}
