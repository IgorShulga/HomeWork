package hw_4;

public class Util {
    int distance = (int)(Math.random()*1000);

    public void startEngine(){
        System.out.println("wrumm... wrumm... I`m start the engine");
    }

    public void stopEngine(){
        System.out.println("... I`m stop the engine");
    }

    public Car sitInCar(Car car, Passanger passanger){

        boolean haveFreeSeat = false;
            for (Passanger randomPassanger : car.getPassangers()) {
                if (randomPassanger == null) {
                    haveFreeSeat = true;
                    break;
                }
            }

            if(haveFreeSeat == false){
                System.out.println(passanger.getName() + ", sorry, in this car don`t have free seats");
            } else {
                for(int numberSeat = 0; numberSeat < car.getPassangers().length; numberSeat++){
                    if(car.getPassangers()[numberSeat] == null){
                        car.getPassangers()[numberSeat] = passanger;
                        System.out.println(passanger.getName() + " sit in the " + car.getModel() + " on seat number " + numberSeat);
                        break;
                    }
                }
            }
            return car;
    }

    public Car getOutOfCar(Car car, Passanger passanger){
        boolean isPassInCar = false;
        for(Passanger pass : car.getPassangers()){
            if(pass == null){
                break;
            } else if(pass.equals(passanger)){
                isPassInCar = true;
                break;
            }
        }
        if(isPassInCar == false) {
            System.out.println("This passanger is not in car now.");
        } else {
            for(int numberSeat = 0; numberSeat < car.getPassangers().length; numberSeat++){
                if(passanger.equals(null)) {
                    break;
                } else if (passanger.equals(car.getPassangers()[numberSeat])){
                    car.getPassangers()[numberSeat] = null;
                    System.out.println(passanger.getName() + " exit from car. " + numberSeat + " seat is free");
                    break;
                    }
                }
            }
        return car;
    }

    public void haveEat(){
        System.out.println("Passangers eat.");
    }

    public void isRide(Car car){
        System.out.println(car.getModel() + " rides");
    }

    public Passanger getPassanger (Car car, Passanger passanger){
        Passanger getPass = null;
        for(Passanger pass : car.getPassangers()){
            if(passanger == pass){
                getPass = pass;
                break;
            }
        }
        return getPass;
    }

    public Passanger getPassanger (Car car, int number){
        Passanger getPass = null;
        for(int numerPass = 0; numerPass < car.getPassangers().length; numerPass++){
            if(numerPass == number){
                getPass = car.getPassangers()[numerPass];
                break;
            }
        }
        return getPass;
    }

    public boolean canDriveDistance (Car car) {
        boolean getThere;
        System.out.println("We need to drive " + distance + " km");
        //расход на 100 км = лошадиные силы / 1000 * скорость * 0,2
        double fuelСonsumption = ((double) car.getEngine().getHorsePower()/1000) * car.getEngine().getSpeed() * 0.2;
        //растояние которое проедет машина без дозаправки
        int myDistance = (int) (car.getAmountOfFuel() / (fuelСonsumption/100));

        if(myDistance >= distance){
            getThere = true;
            System.out.println("Fuel enough!");
        } else {
            getThere = false;
            System.out.println("Fuel not enough!");
        }
        return getThere;
    }

    public void stopCar(Car car){
        stopEngine();
        System.out.println("The car stoped");
    }

}
