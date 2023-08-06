package ru.tkozlova.making_file_uniquenames;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        //System.out.println(List.of(solution.getFolderNames(new String[]{"kaido", "kaido(1)", "kaido", "kaido(1)"})));

        //System.out.println(List.of(solution.getFolderNames(new String[]{"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"})));

        solution.getFolderNames(new String[]{"j", "u(3)", "u(2)", "x", "t", "t(4)", "u(3)", "x", "y", "n(1)(2)", "w", "j", "l", "j", "f", "g(3)(3)", "d(3)", "l", "v", "e", "k", "f(1)", "f(2)", "v(4)", "k", "n", "b", "g(1)(4)", "h", "t", "d(3)", "m(1)", "p", "p", "k", "s(1)", "f(1)", "k", "o", "o", "z(2)(4)", "r", "c", "p(1)", "j", "c", "s", "f", "g(4)(3)", "u(2)(4)", "r(3)(3)", "v", "a(1)",
                "h", "q(3)", "k(4)", "d(3)(2)", "y(1)(1)", "q(1)(2)", "t", "i", "t", "q", "z", "r(3)(3)", "x", "k", "n(2)(2)", "h", "t(2)", "q", "j", "u", "r(3)", "h", "u", "e", "y", "u", "t", "q", "u(3)", "b(3)", "k",
                "m(1)", "a(1)(2)", "p", "i", "q", "e", "q", "k", "c", "h", "l", "p", "i", "b(3)", "q", "f",
                "i", "c", "c(3)", "l(2)(2)", "g", "d(1)", "y(4)", "r", "r(4)(3)", "u", "s", "g", "l", "j(1)(4)",
                "w(1)", "q", "s", "g", "v", "a", "z", "x", "i", "i", "j", "e", "g(2)(2)", "r(2)(2)", "g", "u", "e",
                "r(4)(1)", "e", "u", "u(4)(4)", "e", "h", "p", "j", "b(1)(3)", "g", "v", "b", "j(4)(3)", "w", "w", "c"
        });
    }
}
