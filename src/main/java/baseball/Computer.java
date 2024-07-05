package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
/*
 * 클래스 이름 Computer
 *
 * 버전 정보 V1
 *
 * 날짜 7월 4일
 *
 * 저작권 주의
 */
public class Computer {
    private static ComputerNumber baseBallNumber;

    public Computer() {
        baseBallNumber = new ComputerNumber(createBasBallNumber());
    }

    private List<Integer> createBasBallNumber() {
        List<Integer> basBallNumberList = new ArrayList<>();

        int tmp = Randoms.pickNumberInRange(1, 9);
        basBallNumberList.add(tmp);

        while (basBallNumberList.size() != 3) {
            tmp = Randoms.pickNumberInRange(1, 9);
            if (!basBallNumberList.contains(tmp)) {
                basBallNumberList.add(tmp);
            }
        }
        return basBallNumberList;
    }

    public boolean endChecking(PlayerNumber playNumbers) {
        StringBuilder stringBuilder = new StringBuilder();
        Score score = baseBallNumber.getScore(playNumbers);
        if (score.getBall() != 0) {
            stringBuilder.append(score.getBall());
            stringBuilder.append("볼 ");
        }
        if (score.getStrike() != 0) {
            stringBuilder.append(score.getStrike());
            stringBuilder.append("스트라이크");
        }
        if(stringBuilder.toString().equals("")) {
            stringBuilder.append("낫싱");
        }
        System.out.println(stringBuilder.toString());
        if (stringBuilder.toString().equals("3스트라이크")) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }
}
