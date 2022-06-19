package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

/**
 * 이른 초기화(eager initialization) 사용
 */
public class Settings2_1 {
    private static final Settings2_1 INSTANCE = new Settings2_1();

    private Settings2_1() { }

    public static Settings2_1 getInstance() {
        return INSTANCE;
    }
}
