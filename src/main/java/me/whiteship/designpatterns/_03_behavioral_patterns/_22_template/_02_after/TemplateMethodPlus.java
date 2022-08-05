package me.whiteship.designpatterns._03_behavioral_patterns._22_template._02_after;

public class TemplateMethodPlus extends TemplateMethodFileProcessor {

    public TemplateMethodPlus(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        return result += number;
    }
}
