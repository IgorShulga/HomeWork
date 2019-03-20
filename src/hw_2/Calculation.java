package hw_2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Calculation {

    public BigInteger getFactorialByRecursion(int num) {
        BigInteger factorial_1 = BigInteger.ONE;
        BigInteger factorial_x = BigInteger.valueOf(num);
        if ((num == 0) || (num == 1)) {
            return factorial_1;
        } else return factorial_x.multiply(getFactorialByRecursion(num - 1));
    }

    public void calculationQuadraticEquation(double first, double second, double third) {

        double discriminant = Math.pow(second, 2) - (4 * first * third);
        if (discriminant > 0) {
            double x1 = ((-1) * second + Math.sqrt(discriminant)) / (2 * first);
            double x2 = ((-1) * second - Math.sqrt(discriminant)) / (2 * first);
            System.out.println(
                    "Solving a quadratic equation: \n" + first + "x^2 + " + second + "x + " + third + " = 0 " +
                            "\n x1 = " + x1 + " x2 = " + x2);
        } else if (discriminant == 0) {
            double x = ((-1) * second) / (2 * first);
            System.out.println(
                    "Solving a quadratic equation: \n" + first + "x^2 + " + second + "x + " + third + " = 0 " +
                            "\n x1 = x2 = " + x);
        }
        System.out.println(
                "In this the equation: \n" + first + "x^2 + " + second + "x + " + third + " = 0 " +
                        "\nis not roots");
    }

    //    public void calculationQuadraticEquationByVieta (int p, int q) {
//        int x1, x2;
//
//        if((x1 + x2 == (-1) * p) && (x1 * x2 == q)) {
//            System.out.println(
//                    "Solving a quadratic equation: \n" + "x^2 + " + p+ "x + " + q + " = 0 " +
//                            "\nx1 = " + x1 + " x2 = " + x2);
//        }
//    }
    public void printFibonachiNumbers(int amountOfNumbers) {
        int[] fib = new int[amountOfNumbers];
        fib[0] = 0;
        fib[1] = 1;
        for (int n = 2; n < amountOfNumbers; n++) {
            fib[n] = fib[n - 1] + fib[n - 2];
        }
        System.out.print("Fibonachi numbers: " + Arrays.toString(fib));
    }

    public void printMultiplicationTable() {
        for (int firstNumber = 1; firstNumber <= 10; firstNumber++) {
            System.out.println();
            for (int secondNumber = 1; secondNumber <= 10; secondNumber++) {
                System.out.print(String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber) +
                        " = " + firstNumber * secondNumber + "; ");
            }
        }
    }

    public void printChristmasTree() {
        for (int horizont = 0; horizont <= 10; horizont++) {
            for (int vertical = horizont; vertical > 0; vertical--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printChristmasTreeTurnOver() {
        for (int horizont = 10; horizont >= 1; horizont--) {
            for (int vertical = horizont; vertical > 0; vertical--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void getGreeting(int hours, int minuts) {
        if (hours >= 22 || hours <= 3) {
            System.out.println("Now is " + hours + ":" + minuts + " Goodnight!");
        } else if (hours >= 4 && hours <= 11) {
            System.out.println("Now is " + hours + ":" + minuts + " Good morning!");
        } else if (hours >= 12 && hours <= 18) {
            System.out.println("Now is " + hours + ":" + minuts + " Good day!");
        } else if (hours >= 19 && hours <= 21) {
            System.out.println("Now is " + hours + ":" + minuts + " Good evening!");
        }
    }


    public boolean getCheckNumber(int enteredNumber, int randomNumber) {
        return enteredNumber == randomNumber;
    }

    public void getOddNumbers(int firstNumber, int secondNumber) {
        if(firstNumber < secondNumber){
            System.out.print("Odd integer between " + firstNumber + " and " + secondNumber + ": ");
            for(; firstNumber <= secondNumber; firstNumber++){
                if(firstNumber % 2 != 0) {
                    System.out.print(firstNumber + "; ");
                }
            }
        } else {
            System.out.print("Odd integer between " + secondNumber + " and " + firstNumber + ": ");
            for(; secondNumber <= firstNumber; secondNumber++) {
                if(secondNumber % 2 != 0) {
                    System.out.print(secondNumber + "; ");
                }
            }
        }
    }

    public void getEvenNumber(int firstNumber, int secondNumber) {
        if(firstNumber < secondNumber){
            System.out.print("Even integer between " + firstNumber + " and " + secondNumber + ": ");
            for(; firstNumber <= secondNumber; firstNumber++){
                if(firstNumber % 2 == 0) {
                    System.out.print(firstNumber + "; ");
                }
            }
        } else {
            System.out.print("Even integer between " + secondNumber + " and " + firstNumber + ": ");
            for(; secondNumber <= firstNumber; secondNumber++) {
                if(secondNumber % 2 == 0) {
                    System.out.print(secondNumber + "; ");
                }
            }
        }
    }
}

