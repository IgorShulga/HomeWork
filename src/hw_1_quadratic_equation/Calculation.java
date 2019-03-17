package hw_1_quadratic_equation;

public class Calculation {

    public void calculationQuadraticEquation (double first, double second, double third) {

        double discriminant = Math.sqrt(Math.pow(second, 2) - (4 * first * third));
        double x1 = ((-1) * second + discriminant) / (2 * first);
        double x2 = ((-1) * second - discriminant) / (2 * first);

        System.out.println(
                "Solving a quadratic equation: 3x^2 + 4x + 1 = 0 " +
                "x1 = " + x1 + " x2 = " + x2);
    }

    public double getXOneByVient (double p, double q) {
        double d = Math.sqrt(Math.pow(p, 2) - (4 * 1 * q));
        double x1 = (-p - d) / 2;
        return x1;
    }

    public double getXTwoByVient (double p, double q) {
        double d = Math.sqrt(Math.pow(p, 2) - (4 * 1 * q));
        double x2 = (-p + d) / 2;
        return x2;
    }

    public double calculationAreaOfCircle (double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double calculationCircleLength (double radius) {
        double length = 2 * Math.PI * radius;
        return length;
    }

    public double calculationHypotenuseLength (double kat1, double kat2) {
        return  Math.hypot(kat1, kat2);
    }
}
