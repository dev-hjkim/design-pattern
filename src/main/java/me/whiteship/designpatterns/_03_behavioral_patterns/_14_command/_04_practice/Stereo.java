package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_practice;

public class Stereo {
    String location;

    public Stereo(String location) {
        if (location.equals("Living Room")) {
            this.location = "거실";
        } else {
            this.location = "";
        }
    }

    public void on() {
        System.out.println(this.location + " 오디오가 켜졌습니다.");
    }

    public void setCD() {
        System.out.println(this.location + " 오디오에서 CD가 재생됩니다.");
    }

    public void setVolume(int volume) {
        System.out.println(this.location + " 오디오의 볼륨이 " + volume + "(으)로 설정되었습니다.");
    }

    public void off() {
        System.out.println(this.location + " 오디오가 꺼졌습니다.");
    }
}
