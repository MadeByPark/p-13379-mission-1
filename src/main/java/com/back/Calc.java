package com.back;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    public static int addNumbers(String expression) {
        String[] expressionBits =  expression.split(" \\+ ");

        int num1 = Integer.parseInt(expressionBits[0]);
        int num2 = Integer.parseInt(expressionBits[1]);
        return num1 + num2;
    }

    public static int subtractNumbers(String expression) {
        String[] expressionBits =  expression.split(" \\- ");

        int num1 = Integer.parseInt(expressionBits[0]);
        int num2 = Integer.parseInt(expressionBits[1]);
        return num1 - num2;
    }

    public static int addThreeNumbers(String expression) {
        String[] expressionBits =  expression.split(" \\+ ");

        int num1 = Integer.parseInt(expressionBits[0]);
        int num2 = Integer.parseInt(expressionBits[1]);
        int num3 = Integer.parseInt(expressionBits[2]);
        return num1 + num2 + num3;
    }

    public static int calculateExpression(String expression) {
        String[] expressionBits = expression.split(" \\- | \\+ ");
        List<Integer> numbers = new ArrayList<>();
        for(String bit : expressionBits){
            numbers.add(Integer.parseInt(bit.trim()));
        }
        int sum = 0;
        for(int n : numbers){
            sum += n;
        }
        return sum;
    }
}
