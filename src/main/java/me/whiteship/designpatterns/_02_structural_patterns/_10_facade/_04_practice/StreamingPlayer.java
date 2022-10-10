package me.whiteship.designpatterns._02_structural_patterns._10_facade._04_practice;

public class StreamingPlayer {
    private String movieName;

    public void on() {
        System.out.println("스트리밍 플레이어가 켜졌습니다.");
    }

    public void play(String movieName) {
        this.movieName = '"' + movieName + '"';
        System.out.println("스트리밍 플레이어에서 " + this.movieName + "를 재생합니다.");
    }

    public void stop() {
        System.out.println("스트리밍 플레이어에서 " + this.movieName + " 재생을 종료합니다.");
    }

    public void off() {
        System.out.println("스트리밍 플레이어가 꺼졌습니다.");
    }
}
