package hw_1_quadratic_equation;

public class Main {

    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        calculation.calculationQuadraticEquation(3, 4, 1);

        System.out.println("Расчет квадратного уравнения через теорему Виета. x1 = " +
                calculation.QuadraticEquationTheoremViet_x1(8, 15) + " x2 = " +
                calculation.QuadraticEquationTheoremViet_x2(8, 15));

        System.out.println("Расчет площади круга (радиус = 100): Площадь S = " +
                calculation.calculationAreaOfCircle(100));

        System.out.println("Расчет длинны окружности (радиус = 68): Длина L = " +
                calculation.CircleLength(68));

        calculation.HypotenuseLength(3, 4);
        System.out.println("Расчет длинны гипотенузы. Катет 1 = 3, Катет 2 = 4, Длина гипотенузы = "  +
                calculation.HypotenuseLength(3,4));
    }
}
