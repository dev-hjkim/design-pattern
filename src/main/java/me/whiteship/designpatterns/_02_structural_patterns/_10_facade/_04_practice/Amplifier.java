package me.whiteship.designpatterns._02_structural_patterns._10_facade._04_practice;

public class Amplifier {

    public void on() {
        System.out.println("앰프가 켜졌습니다.");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("앰프를 스트리밍 플레이어와 연결합니다.");
    }

    public void setSrroundSound() {
        System.out.println("앰프를 서라운드 모드로 설정합니다.(5.1채널)");
    }

    public void setVolume(int volume) {
        System.out.println("앰프 볼륨을 " + volume + "(으)로 설정합니다.");
    }

    public void off() {
        System.out.println("앰프가 꺼졌습니다.");
    }
}
