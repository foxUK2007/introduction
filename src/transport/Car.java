package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car extends transport {
    private String color;
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatPlace;
    private boolean isWinterTires;

    private Key key;

    private Insurance insurance;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int seatPlace, boolean typeTires, Key key, Insurance insurance) {
        super(brand, model, 0, country, color, 0, null, 0);
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        this.seatPlace = seatPlace;
        this.isWinterTires = true;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
            this.fuelType = null;
            this.amountFuel = 0;
        }

    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String registrationNumber, String fuelType, double amountFuel) {
        super(brand, model, 0, null, 0, "бензин", 50);
        this.engineVolume = 2.0;
        this.color = "белый";
        this.transmission = "МКПП";
        this.bodyType = "седан";
        this.registrationNumber = registrationNumber;
        this.seatPlace = 5;
        new Key();
        new Insurance();
        this.fuelType = "бензин";
        this.amountFuel = 50;


    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            return 1.5;
        }
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeatPlace() {
        return seatPlace;
    }

    public boolean isWinterTires() {
        return isWinterTires;
    }

    public void setWinterTires(boolean winterTires) {
        isWinterTires = winterTires;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}", registrationNumber)) {
            registrationNumber = registrationNumber;
        } else {
            System.out.println("номер некорректный");
        }

    }

    public void changeTires() {
        isWinterTires = !isWinterTires;
    }


    public Key getKey() {
        return new Key();
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return new Insurance();
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public class Key {
        private final boolean remoteEngineStart;

        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public Key() {
            this(true, true);
        }

        public boolean isRemoteEngineStart() {
            return true;
        }

        public boolean isKeylessEntry() {
            return true;
        }

    }


    public class Insurance {

        private final LocalDate validityInsurance;
        private final double costInsurance;
        private final String numberInsurance;

        public Insurance(LocalDate validityInsurance, double costInsurance, String numberInsurance) {
            if (validityInsurance == null) {
                this.validityInsurance = LocalDate.now();
            } else {
                this.validityInsurance = validityInsurance;
            }
            this.costInsurance = costInsurance;
            if (numberInsurance == null) {
                this.numberInsurance = "000000000";
            } else {
                this.numberInsurance = numberInsurance;
            }
        }

        public Insurance() {
            this(LocalDate.now(), 2500, "985632471");
        }

        public LocalDate getValidityInsurance() {
            return validityInsurance;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public boolean checkNumber(String numberInsurance) {
            if (Pattern.matches("[а-я][0-9]{3}[а-я]{9}", numberInsurance)) {
                numberInsurance = numberInsurance;
            } else {
                System.out.println("000000000");
            }
            return false;
        }

        public void checkNumberInsurance(String numberInsurance) {
            if (validityInsurance.isBefore(LocalDate.now()) || validityInsurance.isEqual(LocalDate.now())) {
                System.out.println("Вам необходимо оформить новую страховку");
            }


        }


    }
    public void reFuel(){
        System.out.println("для заправки необходим " + fuelType + ", в количестве " + amountFuel + " литров.");
    }

}