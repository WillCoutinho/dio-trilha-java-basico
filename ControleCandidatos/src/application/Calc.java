package application;

import entities.InvalidParamsException;

public class Calc {

    static boolean isFirstParamGreaterThanSecond(int firstParam, int secondParam) {
        return firstParam > secondParam;
    }

    static void calc(int firstParam, int secondParam) throws InvalidParamsException {
        if (isFirstParamGreaterThanSecond(firstParam, secondParam)) {
            throw new InvalidParamsException("Second parameter must be greater than first parameter");
        }
        int counter = secondParam - firstParam;
        for (int i = 0; i < counter; i++) {
            System.out.println("Displaying the number " + (i + 1));
        }
    }
}
