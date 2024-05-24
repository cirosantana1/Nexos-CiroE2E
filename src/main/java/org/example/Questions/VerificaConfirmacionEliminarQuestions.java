package org.example.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.Ui.HomePage.*;

public class VerificaConfirmacionEliminarQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(POP_UP_DELETEACCOUNT, isVisible()).forNoMoreThan(15).seconds());

        return POP_UP_DELETEACCOUNT.resolveFor(actor).isPresent();
    }

    public static VerificaConfirmacionEliminarQuestions verificaConfirmacionEliminarQuestions() {
        return new VerificaConfirmacionEliminarQuestions();
    }
}

