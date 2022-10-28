package me.whiteship.designpatterns._03_behavioral_patterns._20_state._04_practice;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            this.state = noQuarterState;
        } else {
            this.state = soldOutState;
        }
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (this.count > 0) {
            this.count -= 1;
        }
    }

    public String toString() {
        String commonText = "\n주식회사 왕뽑기\n"
                + "자바로 돌아가는 최신형 뽑기 기계\n"
                + "남은 개수: " + this.count + "개\n";

        if (this.count == 0) {
            commonText += "매진\n";
        } else {
            commonText += "동전 투입 대기중\n";
        }

        return commonText;
    }

    public State getSoldOutState() {
        return this.soldOutState;
    }

    public State getNoQuarterState() {
        return this.noQuarterState;
    }

    public State getHasQuarterState() {
        return this.hasQuarterState;
    }

    public State getSoldState() {
        return this.soldState;
    }

    public int getCount() {
        return this.count;
    }
}
