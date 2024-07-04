package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> numbers;

    public Player() {
        numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void readNumber(String s) {
        numbers.clear();
        try {
            Integer.parseInt(s);
        }catch (Exception e){
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
        if (s.length() != 3) {
            throw new IllegalArgumentException("3자리 숫자만 입력해주세요.");
        }
        Integer hundreds = (int) s.charAt(0) -'0';
        Integer tens = (int) s.charAt(1) -'0';
        Integer units = (int) s.charAt(2) -'0';

        validateDuplicate(hundreds, tens, units);
    }

    private void validateDuplicate(Integer hundreds, Integer tens, Integer units) {
        numbers.add(hundreds);
        if (numbers.contains(tens)) {
            throw new IllegalArgumentException("서로 다른 수를 입력해주세요");
        }
        numbers.add(tens);
        if (numbers.contains(units)) {
            throw new IllegalArgumentException("서로 다른 수를 입력해주세요");
        }
        numbers.add(units);
        System.out.println(">>"+numbers);
    }
}
