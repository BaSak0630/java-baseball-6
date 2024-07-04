package baseball;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> numbers;

    public Player() {
        numbers = new ArrayList<>();
    }

    public List<Integer> readNumber(String s) {
        numbers.clear();
        try {
            Integer.parseInt(s);
        }catch (Exception e){
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
        if (s.length() != 3) {
            throw new IllegalArgumentException("3자리 숫자만 입력해주세요.");
        }
        List<Integer> playNumbers = new ArrayList<>();
        playNumbers.add((int) s.charAt(0) -'0');
        playNumbers.add((int) s.charAt(1) -'0');
        playNumbers.add((int) s.charAt(2) -'0');

        validateDuplicate(playNumbers);
        return numbers;
    }

    private void validateDuplicate(List<Integer> playNumbers) {
        int hundreds = playNumbers.get(0);
        int tens = playNumbers.get(1);
        int units = playNumbers.get(2);
        numbers.add(hundreds);
        if (numbers.contains(tens)) {
            throw new IllegalArgumentException("서로 다른 수를 입력해주세요");
        }
        numbers.add(tens);
        if (numbers.contains(units)) {
            throw new IllegalArgumentException("서로 다른 수를 입력해주세요");
        }
        numbers.add(units);
    }
}
