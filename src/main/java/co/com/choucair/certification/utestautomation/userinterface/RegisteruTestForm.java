package co.com.choucair.certification.utestautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisteruTestForm {
    public static final Target START_REGISTER = Target.the("start register form")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRST_NAME_FIELD = Target.the("where do we write first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME_FIELD = Target.the("where do we write last name")
            .located(By.id("lastName"));
    public static final Target EMAIL_FIELD = Target.the("where do we write email")
            .located(By.id("email"));
    public static final Target MONTH_DATE_BIRTH = Target.the("where do we select month of date birth")
            .located(By.id("birthMonth"));
    public static final Target MONTH_BIRTH = Target.the("select month of date birth")
            .located(By.xpath("//option[@label='February']"));
    public static final Target DAY_DATE_BIRTH = Target.the("where do we select day of date birth")
            .located(By.id("birthDay"));
    public static final Target DAY_BIRTH = Target.the("select day of date birth")
            .located(By.xpath("//option[@label='17']"));
    public static final Target YEAR_DATE_BIRTH = Target.the("where do we select year of date birth")
            .located(By.id("birthYear"));
    public static final Target YEAR_BIRTH = Target.the("select year of date birth")
            .located(By.xpath("//option[@label='1985']"));
    public static final Target NEXT_LOCATION = Target.the("start next step location")
            .located(By.xpath("//a[@aria-label='Next step - define your location']//span[text()='Next: Location']"));
    public static final Target NEXT_DEVICE = Target.the("start next step device")
            .located(By.xpath("//a[@aria-label='Next step - select your devices']//span[text()='Next: Devices']"));
    public static final Target NEXT_LAST_STEP = Target.the("start next step last step")
            .located(By.xpath("//a[@aria-label='Next - final step']//span[text()='Next: Last Step']"));
    public static final Target PASSWORD_FIELD = Target.the("where do we write password")
            .located(By.id("password"));
    public static final Target PASSWORD_CONFIRMATION_FIELD = Target.the("where do we write confirm password")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS = Target.the("where do we accept terms")
            .located(By.id("termOfUse"));
    public static final Target CHECKBOX_PRIVACY = Target.the("where do we accept privacy")
            .located(By.id("privacySetting"));
    public static final Target LABEL_CONFIRMATION = Target.the("confirm last step")
            .located(By.xpath("//h1[@class='step-title']//span[text()='The last step']"));
//    public static final Target COMPLETE_REGISTER = Target.the("finish the registration")
//            .located(By.id("laddaBtn"));

}
