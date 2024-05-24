package org.example.Ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/login")
public class HomePage extends PageObject {

    public static final Target BTN_LOGIN = Target.the("Boton login ")
            .located(By.id("login"));
    public static final Target BTN_NEWUSER = Target.the("Boton nuevo usuario")
            .located(By.id("newUser"));
    public static final Target TXT_FIRSTNAME = Target.the("Input nombre")
            .located(By.id("firstname"));
    public static final Target TXT_LASTNAME = Target.the("Input apellido")
            .located(By.id("lastname"));
    public static final Target TXT_USERNAME = Target.the("Input usuario")
            .located(By.id("userName"));
    public static final Target TXT_PASSWORD = Target.the("Input apellido")
            .located(By.id("password"));
    public static final Target BTN_REGISTER = Target.the("Boton registro")
            .located(By.id("register"));
    public static final Target TXT_RECAPTCHA = Target.the("Texto del recaptcha")
            .located(By.xpath("//p[@id='name']"));
    public static final Target BTN_BOOKSTORE = Target.the("Boton tienda de libros")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[2]"));
    public static final Target TXT_SEARCHBOOK = Target.the("Buscar libro")
            .located(By.xpath("//input[@id='searchBox']"));
    public static final Target BTN_DELETEACCOUNT = Target.the("Boton eliminar cuenta")
            .located(By.xpath("//button[contains(text(),'Delete Account')]"));
    public static final Target POP_UP_DELETEACCOUNT = Target.the("PopUp eliminar cuenta")
            .located(By.xpath("//div[contains(text(),'Do you want to delete your account?')]"));
    public static final Target BTN_OK = Target.the("Boton ok ")
            .located(By.xpath("//button[@id='closeSmallModal-ok']"));
    public static final Target BTN_ALERT_FRAME_WINDOWS = Target.the("Boton alerta ventanas")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]"));
    public static final Target BTN_NESTED_FRAMES = Target.the("Boton marcos anidados")
            .located(By.xpath("//span[contains(text(),'Nested Frames')]"));
    public static final Target TXT_NESTED_FRAMES = Target.the("Titulo marcos anidados")
            .located(By.xpath("//h1[contains(text(),'Nested Frames')]"));
    public static final Target BTN_FORMS = Target.the("Boton formularios")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]"));
    public static final Target BTN_PRACTICE_FORM = Target.the("Boton praticar formulario")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]"));
    public static final Target TXT_STUDENT_FORM = Target.the("Titulo formulario estudiante")
            .located(By.xpath("//h5[contains(text(),'Student Registration Form')]"));
    public static final Target RBT_GENDER = Target.the("Opción genero")
            .located(By.xpath("//label[contains(text(),'Male')]"));
    public static final Target TXT_EMAIL = Target.the("Input correo")
            .located(By.id("userEmail"));
    public static final Target TXT_MOBILE = Target.the("Input numero")
            .located(By.id("userNumber"));
    public static final Target TXT_DATE = Target.the("Input fecha nacimiento")
            .located(By.xpath("//*[contains(@id, 'dateOfBirthInput')]"));
    public static final Target TXT_SUBJECTS = Target.the("Input sujeto")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
    public static final Target CHK_HOBBIES = Target.the("Check hobies")
            .located(By.xpath("//label[contains(text(),'Music')]"));
    public static final Target TXT_CURRENT_ADDRESS = Target.the("Input dirección actual")
            .located(By.xpath("//textarea[@id='currentAddress']"));
    public static final Target SLC_STATE = Target.the("Selector estado")
            .located(By.xpath("//div[contains(text(),'Select State')]"));
    public static final Target SLC_CITY = Target.the("Selector ciudad")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]"));
    public static final Target TXT_FIRSTNAME_STUDENT = Target.the("Input nombre estudiante")
            .located(By.xpath("//input[@id='firstName']"));
    public static final Target TXT_LASTNAME_STUDENT = Target.the("Input apellido estudiante")
            .located(By.xpath("//input[@id='lastName']"));
    public static final Target BTN_SUBMIT = Target.the("Boton entregar")
            .located(By.id("submit"));





}
