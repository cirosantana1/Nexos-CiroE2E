package org.example.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.Ui.HomePage.*;

public class SeleccionaOpcionNestedFramesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_ALERT_FRAME_WINDOWS),
                Click.on(BTN_ALERT_FRAME_WINDOWS),
                Click.on(BTN_NESTED_FRAMES));
    }
    public static SeleccionaOpcionNestedFramesTask seleccionaOpcionNestedFramesTask() {
        return instrumented (SeleccionaOpcionNestedFramesTask.class);
    }
}
