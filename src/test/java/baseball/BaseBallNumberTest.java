package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BaseBallNumberTest {
    private ComputerNumber baseBallNumber;
    @Test
    @DisplayName("사이즈 테스트")
    void validateSizeTest(){
        //given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        //when
        numbers.add(4);
        //then
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            baseBallNumber = new ComputerNumber(numbers);
        });
        assertEquals(e.getMessage(),"3자리 수만 가능합니다.");
    }

    @Test
    @DisplayName("중복 값 테스트")
    void validateDuplicateTest(){
        //given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        //when
        numbers.add(2);
        //then
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            baseBallNumber = new ComputerNumber(numbers);
        });
        assertEquals(e.getMessage(),"서로 다른 수로 이루어진 3자리수만 가능합니다.");
    }
}