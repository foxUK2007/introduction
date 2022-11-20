package transport;

import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    double engineVolume;
    String validityInsurance;
    private final int year;
    private final String country;
    String transmission;
    private final String bodyType;
    String registrationNumber;
    private final int seatPlace;
    private boolean isWinterTires;



    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int seatPlace, boolean typeTires) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.validityInsurance = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.seatPlace = seatPlace;
        this.isWinterTires = isWinterTires;

    }
    public class Key{
        private final String remoteEngineStart;

        private final String keylessEntry;

        public Key(String remoteEngineStart, String keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public String getRemoteEngineStart() {

            return remoteEngineStart;
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return "запуск двигателя: " + getRemoteEngineStart() + " бесключевой доступ: " + getKeylessEntry();
        }
    }
    public class Insurance{

        private final String validityInsurance;
        private final double costInsurance;
        private final String numberInsurance;

        public Insurance(String validityInsurance, double costInsurance, String numberInsurance) {
            this.validityInsurance = validityInsurance;
            this.costInsurance = costInsurance;
            this.numberInsurance = numberInsurance;
        }

        public String getValidityInsurance() {
            if (Car.this.validityInsurance == null || !Car.this.validityInsurance.isEmpty() || !Car.this.validityInsurance.isBlank()) {
                Car.this.validityInsurance = validityInsurance;

            } else {
                Car.this.validityInsurance = "Срок действия страховки заканчивается";
            }

            return validityInsurance;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public boolean checkNumber (String numberInsurance){
            if (Pattern.matches("[а-я][0-9]{3}[а-я]{9}", numberInsurance)) {
                numberInsurance = numberInsurance;
            } else {
                System.out.println("000000000");
            }
            return false;
        }


        @Override
        public String toString() {
            return "срок действия страховки: " + getValidityInsurance() + ". стоимость страховки: " + getCostInsurance() + ". номер страховки: " + getNumberInsurance();
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            return 1.5;
        }
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            System.out.println("Информация не указана");
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public String getValidityInsurance() {

        return validityInsurance;
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

    public void setValidityInsurance(String validityInsurance) {
        if (validityInsurance == null || validityInsurance.isEmpty() || validityInsurance.isBlank()) {
            this.validityInsurance = validityInsurance;

        } else {
            this.validityInsurance = "белый";
        }
    }

    public void setWinterTires(boolean winterTires) {
        isWinterTires = winterTires;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public static void setRegistrationNumber(String registrationNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}", registrationNumber)) {
            registrationNumber = registrationNumber;
        } else {
            System.out.println("номер некорректный");
        }

    }

    public void switchTires() {
        setWinterTires(!this.isWinterTires);
    }

    public int getYear() {
        if (year <= 0) {
            return 2000;
        }
        return year;
    }

    public String getCountry() {
        if (country == null) {
            return "гаражная сборка";
        }
        return country;
    }


    @Override
    public String toString() {
        return "Марка автомобиля " + getBrand() + ". Модель: " + getModel() + ". Объем двигателя: " + getEngineVolume() + ". Цвет " + getValidityInsurance() + ". " + getCountry() + ". Коробка передач: " + getTransmission() + ". тип кузова: " + getBodyType() + ". регистрационный номер: " + getRegistrationNumber() + ". количество мест: " + getSeatPlace();
    }


}
