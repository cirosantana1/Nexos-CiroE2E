package org.example.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.Ui.HomePage.*;

public class SeleccionaOpcionPracticeFormTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_FORMS),
                Click.on(BTN_FORMS),
                Click.on(BTN_PRACTICE_FORM));
    }
    public static SeleccionaOpcionPracticeFormTask seleccionaOpcionPracticeFormTask() {
        return instrumented (SeleccionaOpcionPracticeFormTask.class);
    }
}
