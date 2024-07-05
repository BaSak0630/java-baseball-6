package baseball;

/*
 * 클래스 이름 Score
 *
 * 버전 정보 V1
 *
 * 날짜 7월 4일
 *
 * 저작권 주의
 */
public class Score {
    private final int strike;
    private final int ball;

    public Score(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }
}
