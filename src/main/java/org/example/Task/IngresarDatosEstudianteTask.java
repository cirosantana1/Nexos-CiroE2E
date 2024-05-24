package org.example.Task;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.example.Ui.HomePage.*;

public class IngresarDatosEstudianteTask implements Task {


    public IngresarDatosEstudianteTask(String firstName, String lastName, String email, String mobile, String dateBirth, String subjects, String hobbies, String currentAddress, String state, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.dateBirth = dateBirth;
        this.subjects = subjects;
        this.hobbies = hobbies;
        this.currentAddress = currentAddress;
        this.state = state;
        this.city = city;
    }

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String mobile;
    private final String dateBirth;
    private final String subjects;
    private final String hobbies;
    private final String currentAddress;
    private final String state;
    private final String city;



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TXT_STUDENT_FORM));

        actor.attemptsTo(
                Enter.theValue(firstName).into(TXT_FIRSTNAME_STUDENT),
                Enter.theValue(lastName).into(TXT_LASTNAME_STUDENT),
                Enter.theValue(email).into(TXT_EMAIL),
                Click.on(RBT_GENDER),
                Enter.theValue(mobile).into(TXT_MOBILE));
        Serenity.takeScreenshot();
                //Click.on(TXT_DATE));
                //Clear.field(TXT_DATE));

        actor.attemptsTo(
               // Enter.theValue(dateBirth).into(TXT_DATE),
               Scroll.to(TXT_SUBJECTS));
        actor.attemptsTo(Click.on(TXT_SUBJECTS));
        System.out.println("DIO CLIC");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Actions actions = new Actions(getDriver());

        actions.sendKeys(""+subjects).perform();
        Serenity.takeScreenshot();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        actor.attemptsTo(
                Click.on(CHK_HOBBIES),
                Enter.theValue(currentAddress).into(TXT_CURRENT_ADDRESS),
                Click.on(SLC_STATE));
        actions.sendKeys(Keys.TAB).perform();

        actor.attemptsTo(
                Click.on(SLC_CITY));
        actions.sendKeys(Keys.TAB).perform();
        Serenity.takeScreenshot();

    }
    public static IngresarDatosEstudianteTask ingresarDatosEstudianteTask(String firstName, String lastName, String email, String mobile, String dateBirth, String subjects, String hobbies, String currentAddress, String state, String city) {
        return instrumented (IngresarDatosEstudianteTask.class,firstName,lastName,email,mobile,dateBirth,subjects,hobbies,currentAddress,state,city);
    }

}
