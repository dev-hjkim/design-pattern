package me.whiteship.designpatterns._03_behavioral_patterns._20_state._04_practice;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려 주세요.");
    }

    public void dispense() {
        this.gumballMachine.releaseBall();
        if (this.gumballMachine.getCount() == 0) {
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        } else {
            this.gumballMachine.releaseBall();
            System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.");
            if (this.gumballMachine.getCount() > 0) {
                this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
            } else {
                System.out.println("더 이상 알맹이가 없습니다.");
                this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
            }
        }
    }
}
