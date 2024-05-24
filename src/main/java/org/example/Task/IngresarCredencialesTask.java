package org.example.Task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.Ui.HomePage.*;

public class IngresarCredencialesTask implements Task {

    private final String userName;
    private final String password;

    public IngresarCredencialesTask(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_NEWUSER));
        actor.attemptsTo(
                Enter.theValue(userName).into(TXT_USERNAME),
                Enter.theValue(password).into(TXT_PASSWORD));
    }
    public static IngresarCredencialesTask ingresarCredencialesTask(String userName, String password) {
        return instrumented (IngresarCredencialesTask.class,userName,password);
    }

}
