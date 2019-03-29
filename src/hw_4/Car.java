package hw_4;

import java.util.Arrays;
import java.util.Objects;

public class Car extends Agregat {

    private String mark;
    private String model;
    private Engine engine;
    private int amountOfFuel;
    private Passanger[] passangers;
    private int capacity;

    public Car(int wight, String type, String countryOfCreate, String mark, String model, Engine engine, int amountOfFuel, Passanger[] passangers, int capacity) {
        super(wight, type, countryOfCreate);
        this.mark = mark;
        this.model = model;
        this.engine = engine;
        this.amountOfFuel = amountOfFuel;
        this.passangers = passangers;
        this.capacity = capacity;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public Passanger[] getPassangers() {
        return passangers;
    }

    public void setPassangers(Passanger[] passangers) {
        this.passangers = passangers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return amountOfFuel == car.amountOfFuel &&
                capacity == car.capacity &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Arrays.equals(passangers, car.passangers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mark, model, engine, amountOfFuel, capacity);
        result = 31 * result + Arrays.hashCode(passangers);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", amountOfFuel=" + amountOfFuel +
                ", passangers=" + Arrays.toString(passangers) +
                ", capacity=" + capacity +
                '}';
    }
}

