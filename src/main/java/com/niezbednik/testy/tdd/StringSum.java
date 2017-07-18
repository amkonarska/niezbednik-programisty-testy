package com.niezbednik.testy.tdd;

class StringSum {
    String sum(String argument1, String argument2) {
        int numericArgument1 = getIntValueOf(argument1);
        int numericArgument2 = getIntValueOf(argument2);

        int sum = numericArgument1 + numericArgument2;

        return String.valueOf(sum);
    }

    private int getIntValueOf(String argument) {
        try {
            return Integer.parseInt(argument);
        } catch (NumberFormatException exception) {
            return 0;
        }
    }
}
