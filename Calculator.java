package ru.kuls;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String s;
        char operator;
        int x, y;

        NumerRome numRome;


        System.out.println("Введите числа:");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        String str [] = s.split(" ");

        if (str.length != 3) {
            System.out.println("Не правильный ввод значений");
            System.exit(0);
        }

        operator = str[1].charAt(0);

        try {

            x = Integer.parseInt(str[0]);
            y = Integer.parseInt(str[2]);


            Number num = new Number(x, y, operator);
            num.mathOper();
            System.out.println(num.getResult());

        } catch (NumberFormatException e) {

            numRome = NumerRome.valueOf(str[0]);
            x = numRome.getNumRome();

            numRome = NumerRome.valueOf(str[2]);
            y = numRome.getNumRome();

            Number num = new Number(x, y, operator);
            num.mathOper();

            System.out.println(numRome.getRomeNum(num.getResult()));
        }
    }
}
