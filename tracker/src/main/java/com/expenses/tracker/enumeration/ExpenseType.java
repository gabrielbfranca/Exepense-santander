package com.expenses.tracker.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum ExpenseType {
    GROCERY("g"),
    PRODUCTS("p"),
    STREAM("s"),
    RESTAURANT("r"),
    LEIRURE("l");

    private final String code;

    public static ExpenseType valueOfCode(String code) {
        return Arrays.stream(values())
                .filter(e -> e.code.equals(code))
                .findFirst()
                .orElse(null);
    }
}
