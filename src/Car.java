public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        if (engineVolume<=0){
            return 1.5;
        }
        return engineVolume;
    }

    public String getColor() {
        if (color == null){
            return "белый";
        }
        return color;
    }

    public int getYear() {
        if (year <= 0){
            return 2000;
        }
        return year;
    }

    public String getCountry() {
        if (country == null){
            return "гаражная сборка";
        }
        return country;
    }

    @Override
    public String toString() {
        return "Марка автомобиля " + getBrand() + ". Модель: " + getModel() + ". Объем двигателя: " + getEngineVolume() + ". Цвет " + getColor() + ". " + getCountry();
    }
}
