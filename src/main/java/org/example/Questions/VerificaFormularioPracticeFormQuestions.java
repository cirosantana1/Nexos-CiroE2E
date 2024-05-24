package org.example.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.Ui.HomePage.*;

public class VerificaFormularioPracticeFormQuestions implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_STUDENT_FORM, isVisible()).forNoMoreThan(15).seconds());

        return TXT_STUDENT_FORM.resolveFor(actor).isPresent();
    }

    public static VerificaFormularioPracticeFormQuestions verificaFormularioPracticeFormQuestions() {
        return new VerificaFormularioPracticeFormQuestions();
    }
}

