package org.example.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static org.example.Ui.HomePage.*;

public class VerificaAutenticacionQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(Scroll.to(BTN_DELETEACCOUNT));
        return BTN_DELETEACCOUNT.resolveFor(actor).isPresent();
    }

    public static VerificaAutenticacionQuestions verificaAutenticacionQuestions() {
        return new VerificaAutenticacionQuestions();
    }
}

