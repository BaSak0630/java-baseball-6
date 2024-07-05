package baseball;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private PlayerNumber playerNumber;
    public Player() {
    }

    public List<Integer> readNumberList(String s) {
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

        playerNumber = new PlayerNumber(playNumbers);
        return playNumbers;
    }
}
