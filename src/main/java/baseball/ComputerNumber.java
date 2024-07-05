package baseball;

import java.util.List;

public class ComputerNumber extends Number {

    public ComputerNumber(List<Integer> baseBallNumbers) {
        super(baseBallNumbers);
    }

    public Score getScore(PlayerNumber playNumbers) {
        int[] baseBallComputerNumberArr = getBaseBallNumberArr();
        int[] baseBallPlayNumberArr = playNumbers.getBaseBallNumberArr();
        int strike = 0;
        int ball = 0;

        for(int i = 0; i < BASE_BALL_NUMBER_SIZE; i++) {
            Integer num =baseBallComputerNumberArr[i];
            for(int j = 0; j < BASE_BALL_NUMBER_SIZE; j++) {
               if(num == baseBallPlayNumberArr[j]) {
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
