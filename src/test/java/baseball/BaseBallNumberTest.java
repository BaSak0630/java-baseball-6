package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BaseBallNumberTest {
    private BaseBallNumber baseBallNumber;

    private List<Integer> numbers = new ArrayList<>();

    @BeforeEach
    void setUp() {
        numbers.add(1);
        numbers.add(2);
    }

    @Test
    @DisplayName("사이즈 테스트")
    void validateSizeTest(){
        numbers.add(3);
        numbers.add(4);
        assertThrows(IllegalArgumentException.class,()->{
            baseBallNumber = new BaseBallNumber(numbers);
        });

    }

    @Test
    @DisplayName("중복 값 테스트")
    void validateDuplicateTest(){
        numbers.add(2);
        assertThrows(IllegalArgumentException.class,()->{
            baseBallNumber = new BaseBallNumber(numbers);
        });

    }
}