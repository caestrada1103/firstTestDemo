package co.com.choucair.certification.utestautomation.questions;

import static co.com.choucair.certification.utestautomation.userinterface.RegisteruTestForm.LABEL_CONFIRMATION;

import co.com.choucair.certification.utestautomation.model.uTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;


public class AnswerConfirm implements Question<Boolean> {
    private final List<uTestData> utestData;

    public AnswerConfirm(List<uTestData> utestData) {
        this.utestData = utestData;
    }

    public static AnswerConfirm toThe(List<uTestData> utestData) {
        return new AnswerConfirm(utestData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelConfirm = Text.of(LABEL_CONFIRMATION).viewedBy(actor).asString();
        return utestData.get(0).getStrLabelFinal().equals(labelConfirm);
    }
}
