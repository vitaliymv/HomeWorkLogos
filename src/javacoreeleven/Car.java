package javacoreeleven;

public class Car {
    private int numberHorsePower;
    private int yearOfProduction;

    public Car(int numberHorsePower, int yearOfProduction) {
        this.numberHorsePower = numberHorsePower;
        this.yearOfProduction = yearOfProduction;
    }

    public int getNumberHorsePower() {
        return numberHorsePower;
    }


    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberHorsePower=" + numberHorsePower +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}