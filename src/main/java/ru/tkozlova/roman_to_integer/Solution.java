package ru.tkozlova.roman_to_integer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    private static final Map<Roman, Set<Roman>> RULE = Map.of(
            Roman.I, Set.of(Roman.V, Roman.X),
            Roman.X, Set.of(Roman.L, Roman.C),
            Roman.C, Set.of(Roman.D, Roman.M)
    );

    public int romanToInt(String s) {

        List<Roman> romanList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            romanList.add(Roman.valueOf(String.valueOf(s.charAt(i))));
        }

        var totalSum = 0;
        for (int i = 0; i < romanList.size(); i++) {

            Roman symbol = romanList.get(i);
            Roman nextSymbol = i < s.length() - 1 ? romanList.get(i + 1) : null;

            if (RULE.containsKey(symbol) &&
                    nextSymbol != null && RULE.get(symbol).contains(nextSymbol)) {
                totalSum += nextSymbol.getNumber() - symbol.getNumber();
                i++;
            } else {
                totalSum += symbol.getNumber();
            }
        }
        return totalSum;
    }

    enum Roman {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);
        int number;

        Roman(int value) {
            number = value;
        }

        public int getNumber() {
            return number;
        }
    }
}