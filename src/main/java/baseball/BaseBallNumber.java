package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class BaseBallNumber {
    private static final int BASE_BALL_NUMBER_SIZE = 3;

    private final List<Integer> baseBallNumbers;

    public BaseBallNumber(List<Integer> baseBallNumbers) {
        validateSize(baseBallNumbers);
        validateDuplicate(baseBallNumbers);
        this.baseBallNumbers = baseBallNumbers;
        System.out.println(">>"+baseBallNumbers);
    }

    private void validateSize(List<Integer> baseBallNumbers) {
        if (baseBallNumbers.size() != BASE_BALL_NUMBER_SIZE) {
            throw new IllegalArgumentException("3자리 수만 가능합니다.");
        }
    }

    private void validateDuplicate(List<Integer> baseBallNumbers) {
        Set<Integer> duplicateSet = new HashSet<>(baseBallNumbers);
        if (duplicateSet.size() != BASE_BALL_NUMBER_SIZE) {
            throw new IllegalArgumentException("서로 다른 수로 이루어진 3자리수만 가능합니다.");
        }
    }
}
