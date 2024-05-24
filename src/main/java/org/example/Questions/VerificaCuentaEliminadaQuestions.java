package org.example.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static org.example.Ui.HomePage.TXT_RECAPTCHA;

public class VerificaCuentaEliminadaQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Ensure.that(TXT_RECAPTCHA).text().isEqualTo("Invalid username or password!");

        return TXT_RECAPTCHA.resolveFor(actor).isPresent();
    }

    public static VerificaCuentaEliminadaQuestions verificaCuentaEliminadaQuestions() {
        return new VerificaCuentaEliminadaQuestions();
    }
}

