package me.whiteship.designpatterns._03_behavioral_patterns._22_template._02_after;

public class Client {

    public static void main(String[] args) {

        // Template Method
        TemplateMethodFileProcessor templateMethodFileProcessor = new TemplateMethodPlus("number.txt");
        int resultPlus = templateMethodFileProcessor.process();
        System.out.println(resultPlus);

        // Template Callback
        TemplateCallbackFileProcessor templateCallbackFileProcessor = new Multiply("number.txt");
        int result = templateCallbackFileProcessor.process((sum, number) -> sum += number);
        System.out.println(result);
    }
}
