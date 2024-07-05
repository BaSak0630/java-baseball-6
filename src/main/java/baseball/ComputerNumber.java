package baseball;

import java.util.List;

public class ComputerNumber extends Number {

    public ComputerNumber(List<Integer> baseBallNumbers) {
        super(baseBallNumbers);
    }

    public Score getScore(List<Integer> playNumbers) {
        int strike = 0;
        int ball = 0;

        for(int i = 0; i < BASE_BALL_NUMBER_SIZE; i++) {
            Integer num = baseBallNumbers.get(i);
            for(int j = 0; j < BASE_BALL_NUMBER_SIZE; j++) {
               if(num == playNumbers.get(j)) {
                   if (i == j) {
                       strike++;
                   }
                   if (i != j) {
                       ball++;
                   }
                   break;
               }
            }
        }
        return new Score(strike, ball);
    }
}
