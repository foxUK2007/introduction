package transport;

public class Train extends transport {
    private double priceTrip;
    private int timeTrip;
    private String startStation;
    private String endStation;

    private int amountWagons;

    public Train(String brand, String model, int year, String country, double priceTrip, int timeTrip, String startStation, String endStation, int amountWagons) {
        super(brand, model, year, country, 0, "дизель", 1000);
        if (priceTrip == 0) {
            this.priceTrip = 2000;
        } else {
            this.priceTrip = priceTrip;
        }
        if (timeTrip == 0) {
            this.timeTrip = 1;
        } else {
            this.timeTrip = timeTrip;
        }
        if (startStation == null) {
            this.startStation = "Гундаревка";
        } else {
            this.startStation = startStation;
        }
        if (endStation == null) {
            this.endStation = "Верхние Васюки";
        } else {
            this.endStation = endStation;
        }
        if (amountWagons == 0) {
            this.amountWagons = 10;
        } else {
            this.amountWagons = amountWagons;
        }
    }


    public Train(String brand, String model, int year, String color, String country, double maxSpeed, double priceTrip, int timeTrip, String startStation, String endStation, int amountWagons) {
        super(brand, model, year, color, country, maxSpeed, null, 0);
        this.priceTrip = 2000;
        this.timeTrip = 1;
        this.startStation = "Белорусский вокзал";
        this.endStation = "Минск-Пассажирский";
        this.amountWagons = amountWagons;
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        this.priceTrip = priceTrip;
    }

    public int getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(int timeTrip) {
        this.timeTrip = timeTrip;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = amountWagons;
    }
    public void reFuel(){
        System.out.println("для заправки необходим " + fuelType + ", в количестве " + amountFuel + " литров.");
    }
}
