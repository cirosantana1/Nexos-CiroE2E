package org.example.Task;


import static org.example.Ui.HomePage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDatosTask implements Task {

    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String password;

    public IngresarDatosTask(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_NEWUSER),
                Click.on(BTN_NEWUSER));
        actor.attemptsTo(
                Scroll.to(BTN_REGISTER),
                Enter.theValue(firstName).into(TXT_FIRSTNAME),
                Enter.theValue(lastName).into(TXT_LASTNAME),
                Enter.theValue(userName).into(TXT_USERNAME),
                Enter.theValue(password).into(TXT_PASSWORD));
    }
    public static IngresarDatosTask ingresarDatosTask(String firstName, String lastName, String userName, String password) {
        return instrumented (IngresarDatosTask.class,firstName,lastName,userName,password);
    }

}
