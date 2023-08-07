package ru.tkozlova.making_file_uniquenames;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        Assertions.assertArrayEquals(new String[]{"kaido", "kaido(1)", "kaido(2)", "kaido(1)(1)"},
                solution.getFolderNames(new String[]{"kaido", "kaido(1)", "kaido", "kaido(1)"}));

        Assertions.assertArrayEquals(new String[]{"onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece(4)"}
                ,solution.getFolderNames(new String[]{"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"}));

        Assertions.assertArrayEquals(new String[]{"wano", "wano(1)", "wano(2)", "wano(3)"},
                solution.getFolderNames(new String[]{"wano", "wano", "wano", "wano"}));

    }
}
