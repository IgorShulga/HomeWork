package hw_4;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(2000,"Auto", "Japan", "Toyota", "Camry",
                new Engine(130, 600), 70, new Passanger[4], 4);

        Util util = new Util();

        Passanger passangerAndy = new Passanger("Andy", 20);
        Passanger passangerOlga = new Passanger("Olga", 21);
        Passanger passangerMary = new Passanger("Mary", 19);
        Passanger passangerVasya = new Passanger("Vasya", 7);
        Passanger passangerJhon = new Passanger("Jhon", 25);
        Passanger passangerKelly = new Passanger("Kelly", 15);

        if(util.canDriveDistance(car1)){
            util.sitInCar(car1, passangerAndy);
            util.sitInCar(car1, passangerOlga);
            util.sitInCar(car1, passangerMary);
            util.sitInCar(car1, passangerVasya);
            util.sitInCar(car1, passangerJhon);
            util.sitInCar(car1, passangerKelly);
            util.startEngine(car1);
            int numberKmForStop = (int)(Math.random()* util.distance);
            System.out.println("We drove up to " + numberKmForStop + " km. We need stop.");
        util.stopCar(car1);
        util.getOutOfCar(car1, passangerAndy);
        util.getOutOfCar(car1, 2);
            util.haveEat(passangerAndy);
            util.sitInCar(car1, passangerAndy);
            util.sitInCar(car1, passangerMary);
            util.startEngine(car1);
            util.isRide(car1);
            System.out.println("We are at destination");
            util.getOutOfCar(car1, 0);
            util.getOutOfCar(car1, 1);
            util.getOutOfCar(car1, 2);
            util.getOutOfCar(car1, 3);
            util.stopEngine(car1);
        } else {
            System.out.println("We can't get there. We need an airplane! :)");
        }
    }
}
