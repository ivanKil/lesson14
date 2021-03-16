import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Les14Test {

    static Stream<Arguments> dataForGetSubArrayAfterValTest() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 2, 3, 1}, 2, new int[]{3, 1}),
                Arguments.of(new int[]{2, 2, 0, 4, 9}, 9, new int[]{}),
                Arguments.of(new int[]{1, 3, 5}, 3, new int[]{5}),
                Arguments.of(new int[]{1, 3, 5, 7, 9, 3}, 5, new int[]{7, 9, 3})
        );
    }

    static Stream<Arguments> dataForIsHas4and1Test() {
        return Stream.of(
                Arguments.of((new int[]{2, 1, 2, 3, 1}), false),
                Arguments.of((new int[]{2, 2, 0, 4, 9}), false),
                Arguments.of((new int[]{}), false),
                Arguments.of((null), false),
                Arguments.of((new int[]{1, 3, 5, 4}), true),
                Arguments.of((new int[]{1, 1, 4, 4, 1, 1, 1, 4}), true)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForGetSubArrayAfterValTest")
    public void subArrayAfterValTest(int array[], int val, int result[]) {
        Assertions.assertArrayEquals(result, Les14.getSubArrayAfterVal(array, val));
    }

    @Test
    public void subArrayAfterValTestNoValue() {
        Assertions.assertThrows(RuntimeException.class, () -> Les14.getSubArrayAfterVal(new int[]{1, 2, 3, 4, 5}, 8));
    }

    @ParameterizedTest
    @MethodSource("dataForIsHas4and1Test")
    public void isHas4and1Test(int array[], boolean result) {
        Assertions.assertEquals(result, Les14.isHas4and1(array));
    }
}