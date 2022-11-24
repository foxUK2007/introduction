package transport;

public abstract class transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    protected double maxSpeed;

    protected String fuelType;

    protected double amountFuel;


    public transport(String brand, String model, int year, String country, double maxSpeed,String fuelType, double amountFuel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.fuelType = fuelType;
        this.amountFuel = amountFuel;
    }

    public transport(String brand, String model, int year, String color, String country, double maxSpeed, String fuelType, double amountFuel) {
        if (brand == null) {
            this.brand = "Информация не указана";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "Информация не указана";
        } else {
            this.model = model;
        }
        if (year == 0) {
            this.year = 2015;
        } else {
            this.year = year;
        }
        this.country = country;
        if (color == null) {
            this.color = "металлик";
        } else {
            this.color = color;
        }
        if (maxSpeed == 0) {
            this.maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
            this.fuelType = fuelType;
            this.amountFuel = amountFuel;
        }

    }

    public String getFuelType() {
        return fuelType;
    }

    public double getAmountFuel() {
        return amountFuel;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setAmountFuel(double amountFuel) {
        this.amountFuel = amountFuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed == 0) {
            this.maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public void reFuel(){
        System.out.println("для заправки необходим " + fuelType + ", в количестве " + amountFuel + " литров.");
    }

}

