package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    @DisplayName("숫자 입력 테스트")
    void readNonNumberTest() {
        //given
        Player player = new Player();
        String str1 = "aaa";
        String str2 = "12";
        String str3 = "1234";
        String str4 = "122";

        //expected
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> {
            player.readNumber(str1);
        });
        assertEquals(exception1.getMessage(),"숫자만 입력해주세요.");

        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> {
            player.readNumber(str2);
        });
        assertEquals(exception2.getMessage(),"3자리 숫자만 입력해주세요.");

        IllegalArgumentException exception3= assertThrows(IllegalArgumentException.class, () -> {
            player.readNumber(str3);
        });
        assertEquals(exception3.getMessage(),"3자리 숫자만 입력해주세요.");

        IllegalArgumentException exception4= assertThrows(IllegalArgumentException.class, () -> {
            player.readNumber(str4);
        });
        assertEquals(exception4.getMessage(),"서로 다른 수를 입력해주세요");
    }
}