package hw_1_quadratic_equation;

public class Main {

    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        System.out.println("Solving a quadratic equation by the Vieta's theorem. x1 = " +
                calculation.getXOneByVient(8, 15) + " x2 = " +
                calculation.getXTwoByVient(8, 15));

        System.out.println("Calculation of the area of a circle (radius = 100): Area S = " +
                calculation.calculationAreaOfCircle(100));

        System.out.println("Calculate circle length (radius = 68): Length L = " +
                calculation.calculationCircleLength(68));

        calculation.calculationHypotenuseLength(3, 4);
        System.out.println("Calculating length of the hypotenuse. " +
                "Cathetus one = 3, Cathetus two = 4, Length of the hypotenuse = "  +
                calculation.calculationHypotenuseLength(3,4));
    }
}
