package me.whiteship.designpatterns._03_behavioral_patterns._22_template._04_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    public void addCondiments() {
        System.out.println("우유와 설탕을 추가하는 중");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO 오류");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
