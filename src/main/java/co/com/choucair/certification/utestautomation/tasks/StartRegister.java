package co.com.choucair.certification.utestautomation.tasks;

import static co.com.choucair.certification.utestautomation.userinterface.RegisteruTestForm.*;

import co.com.choucair.certification.utestautomation.model.uTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class StartRegister implements Task {
    private final List<uTestData> utestData;

    public StartRegister(List<uTestData> utestData) {
        this.utestData = utestData;
    }

    public static StartRegister onuTestPage(List<uTestData> utestData) {
        return Tasks.instrumented(StartRegister.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(START_REGISTER),
                Click.on(FIRST_NAME_FIELD), Enter.theValue(utestData.get(0).getStrFirstName()).into(FIRST_NAME_FIELD),
                Click.on(LAST_NAME_FIELD), Enter.theValue(utestData.get(0).getStrLastName()).into(LAST_NAME_FIELD),
                Click.on(EMAIL_FIELD), Enter.theValue(utestData.get(0).getStrEmail()).into(EMAIL_FIELD),
                Click.on(MONTH_DATE_BIRTH), Click.on(MONTH_BIRTH),
                Click.on(DAY_DATE_BIRTH), Click.on(DAY_BIRTH),
                Click.on(YEAR_DATE_BIRTH), Click.on(YEAR_BIRTH),
                Click.on(NEXT_LOCATION), Click.on(NEXT_DEVICE),
                Click.on(NEXT_LAST_STEP),
                Click.on(PASSWORD_FIELD), Enter.theValue(utestData.get(0).getStrPassword()).into(PASSWORD_FIELD),
                Click.on(PASSWORD_CONFIRMATION_FIELD), Enter.theValue(utestData.get(0).getStrPasswordConfirm()).into(PASSWORD_CONFIRMATION_FIELD),
                Click.on(CHECKBOX_TERMS), Click.on(CHECKBOX_PRIVACY));
    }
}
