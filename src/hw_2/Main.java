package hw_2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        Scanner scanner = new Scanner(System.in);

        System.out.println("For calculation quadratic equation recommend  p=4, q=-5  or p=-1, q=-6(checked value)");
        System.out.println("For quadratic equation x^2 + px + q = 0 Enter a value - p: ");
        int p = scanner.nextInt();
        System.out.println("For quadratic equation x^2 + px + q = 0 Enter a value - q: ");
        int q = scanner.nextInt();
        calculation.calculationQuadraticEquationByVieta(p,q);

//        0. нахождение факториала числа через рекурсию
        System.out.print("Enter a number more than 0, please: ");
        int numberMoreZero = scanner.nextInt();
        System.out.println(numberMoreZero + "! = " + calculation.getFactorialByRecursion(numberMoreZero));

//        1. модифицировать метод поиска корней через дискриминант, в мейне через сканер вы будете
//        вводить три числа а метод будет считать дискриминант и корни .
        System.out.print("Enter the value of variable A of quadratic equations AX^2 + BX + C = 0: A = ");
        int numberA = scanner.nextInt();
        System.out.print("Enter the value of variable B of quadratic equations AX^2 + BX + C = 0: B = ");
        int numberB = scanner.nextInt();
        System.out.print("Enter the value of variable C of quadratic equations AX^2 + BX + C = 0: 1C = ");
        int numberC = scanner.nextInt();
        calculation.calculationQuadraticEquation(numberA, numberB, numberC);

//        3) Вывести ряд чисел фибоначи.
        System.out.print("Enter amount of Fibonacci numbers: ");
        int amount = scanner.nextInt();
        calculation.printFibonachiNumbers(amount);

//        4) написать метод который выводи всю таблицу умножения.
        calculation.printMultiplicationTable();

//        5) написать метод который бы рисовал елочку из звезочек
        calculation.printChristmasTree();

//        6)  написать метод который бы рисовал обратную елочку
        calculation.printChristmasTreeTurnOver();

//        7) написать метод который выводит в консоль время суток и приветствие:
//        -Доброй Ночи (интервал времени включает цифры 22-3)
//        -Доброе утро(интервал времени включает цифры 4-11)
//        -Доброго дня (интервал времени включает цифры 12-18)
//        -Доброго вечера(интервал времени включает цифры 19-21)
//        если человек ввел неправильное число то выводить сообщение что такого времени суток нет.
        System.out.print("what time is it now? Enter hours, please: ");
        int hours = scanner.nextInt();
        if ((hours < 0) || (hours >= 24)) {
            System.out.println("You are mistake. Repeat enter, please: ");
            hours = scanner.nextInt();
        }
        System.out.print("Enter minutes, please: ");
        int minutes = scanner.nextInt();
        if ((minutes < 0) || (minutes > 60)) {
            System.out.println("You are mistake. Repeat enter, please: ");
            minutes = scanner.nextInt();
        }
        calculation.getGreeting(hours, minutes);

//        8) Написать метод который проверяет число в лотерейном билете:
//        Число с которым мы будем сравнивать автоматически генерируется один раз от 1 до 20 (Math.random почитать за него)
//        Пользователь вводит число если оно совпадает говорит что пользхователь выиграл и программа заканчивается
//        если нет то мы играем до тех пор пока не угадаем число.
        Random rnd = new Random(System.currentTimeMillis());
        int numberRandom = (int) (0 + (Math.random() * 20));
        System.out.print("Enter number from 0 to 20, please: ");
        int enteredNumber = scanner.nextInt();
        while (!(calculation.getCheckNumber(enteredNumber, numberRandom))) {
            System.out.print("Try again! Enter number from 0 to 20, please: ");
            enteredNumber = scanner.nextInt();
        }
        System.out.println("Congratulations! You guessed!");

//        9) вывести все нечетные числа в промежутке от того что укажит человек ;
//        10) вывести все четные числа в в промежутке от того что укажит человек;
        System.out.println("Enter first any integer: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second any integer: ");
        int secondNumber = scanner.nextInt();
        calculation.getOddNumbers(firstNumber, secondNumber);
        System.out.println();
        calculation.getEvenNumber(firstNumber, secondNumber);
        
    }
}
