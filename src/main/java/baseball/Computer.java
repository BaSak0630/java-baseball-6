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
    private static BaseBallNumber baseBallNumber;

    public Computer() {
        baseBallNumber = new BaseBallNumber(createBasBallNumber());
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
}
