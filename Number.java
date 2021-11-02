package ru.kuls;


public class Number {

    private int a, b, result;
    private char operator;

    public Number(int a, int b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }


    public int getResult() {
        return result;
    }

    public int addition() {
        result = a + b;
        return result;
    }

    public int subtraction() {
        result = a - b;
        return result;
    }
    public int multiplication() {
        result = a * b;
        return result;
    }

    public int division() {
        try {

            result = a / b;

        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на 0");
        }
        return result;
    }

    public void mathOper() {

        switch (operator) {
            case '+':
                 addition();
                break;
            case '-':
                subtraction();
                break;
            case '*':
                multiplication();
                break;
            case '/':
                division();
                break;
            default:
                System.out.println("Не правильный ввод значений");
                System.exit(0);

        }
    }
}
