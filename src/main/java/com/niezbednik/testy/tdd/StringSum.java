package com.niezbednik.testy.tdd;

class StringSum {
    String sum(String argument1, String argument2) {
        int numericArgument1 = Integer.parseInt(argument1);
        int numericArgument2 = Integer.parseInt(argument2);

        int sum = numericArgument1 + numericArgument2;

        return String.valueOf(sum);
    }
}