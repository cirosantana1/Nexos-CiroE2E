package org.example.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import static org.example.Ui.HomePage.*;

public class VerificaReCaptchaQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Ensure.that(TXT_RECAPTCHA).text().isEqualTo("Please verify reCaptcha to register!");

        return TXT_RECAPTCHA.resolveFor(actor).isPresent();
    }

    public static VerificaReCaptchaQuestions verificaReCaptchaQuestions() {
        return new VerificaReCaptchaQuestions();
    }
}

