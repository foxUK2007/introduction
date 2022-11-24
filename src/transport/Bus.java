package transport;

public class Bus extends transport{
    public Bus(String brand, String model, int year, String country) {
        super(brand, model, year, country,90, "бензин", 50);
    }

    public Bus(String brand, String model, int year, String color, String country, double maxSpeed) {
        super(brand, model, year, "белый", "Россия", 90, "дизель", 300);
    }

    public void reFuel(){
        System.out.println("для заправки необходим " + fuelType + ", в количестве " + amountFuel + " литров.");
    }
}
