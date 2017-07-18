package com.niezbednik.testy.tdd;

class StringSum {
    String sum(String argument1, String argument2) {
        int numericArgument1;

        try {
            numericArgument1 = Integer.parseInt(argument1);
        } catch (NumberFormatException exception) {
            numericArgument1 = 0;
        }

        int numericArgument2;

        try {
            numericArgument2 = Integer.parseInt(argument2);
        } catch (NumberFormatException exception) {
            numericArgument2 = 0;
        }
        
        int sum = numericArgument1 + numericArgument2;

        return String.valueOf(sum);
    }
}
