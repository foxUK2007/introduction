import transport.Bus;
import transport.Car;
import transport.Car.Key;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        int currentDate = 22;
        Human human1 = new Human(-1988, "Максим", "Минск", "бренд-менеджер");
        Human human2 = new Human(1993, "Анна", "Москва", "методист образовательных программ");
        Human human3 = new Human(1992, "Екатерина", "Калининград", "продакт-менеджер");
        Human human4 = new Human(1995, null, "Москва", "директор по развитию бизнеса");
        Human human5 = new Human(2001, "Владимир", "Казань", "безработный");
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human1.getName());
        human1.setTown(null);
        human4.setYearOfBirth(0);

        System.out.println();
        System.out.println(" Автомобили ");
        System.out.println();

        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", -2015, null, "с854вр178", "бензин", 50);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", -2020, null, "о148ам199", "бензин", 60);
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", -2021, "Сборка в Германии", "р877кк177", "бензин", 60);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", -2018, "Сборка в Южной Корее", "а888аа174", "бензин", 70);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", -2016, "Сборка в Южной Корее", "о111оо124", "бензин", 50);

        Train train1 = new Train("Ласточка", "B-901", 2011, "Россия", 3500, 60, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train train2 = new Train("Ленинград", "D-125", 2091, "Россия", 1700, 180, "Ленинграндский вокзал", "Ленинград-Пассажирский", 8);

        Bus bus1 = new Bus("ПАЗ", "ПАЗ-3237", 2014, "белый", "Россия", 90);
        Bus bus2 = new Bus("ЛиАЗ", "ЛиАЗ-6213", 2013, "белый", "Россия", 90);
        Bus bus3 = new Bus("КАвЗ", "КАвЗ-4270", 2019, "белый", "Россия", 100);

        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
        printInfo(car4);
        printInfo(car5);

        System.out.println();
        System.out.println(" Поезда ");
        System.out.println();

        printInfo(train1);
        printInfo(train2);

        System.out.println();
        System.out.println(" Автобусы ");
        System.out.println();

        printInfo(bus1);
        printInfo(bus2);
        printInfo(bus3);


    }


    public static void printInfo(Car car) {
        System.out.println(
                "Марка автомобиля: " + car.getBrand() +
                        ". Модель: " + car.getModel() +
                        ". Объем двигателя: " + car.getEngineVolume() +
                        ". Цвет " + car.getColor() +
                        ". Год выпуска: " + car.getYear() +
                        ". " + car.getCountry() +
                        ". Коробка передач: " + car.getTransmission() +
                        ". тип кузова: " + car.getBodyType() +
                        ". регистрационный номер: " + car.getRegistrationNumber() +
                        ". количество мест: " + car.getSeatPlace() +
                        ", " + (car.isWinterTires() ? "зимняя" : "летняя") +
                        ", " + (car.getKey().isRemoteEngineStart() ? "удаленный запуск двигателя" : " запуск с ключа") +
                        ", " + (car.getKey().isKeylessEntry() ? "бесключевой допуск" : " допуск с ключа") +
                        ", страховка действует до " + car.getInsurance().getValidityInsurance() +
                        ", стоимость страховки: " + car.getInsurance().getCostInsurance() +
                        ", номер страховки: " + car.getInsurance().getNumberInsurance()

        );
        car.reFuel();
    }

    public static void printInfo(Train train) {
        System.out.println("Марка поезда: " + train.getBrand() +
                ". Модель: " + train.getModel() +
                ". Год выпуска: " + train.getYear() +
                ". Страна производства: " + train.getCountry() +
                ". Стоимость поездки: " + train.getPriceTrip() +
                ". Время в пути: " + train.getTimeTrip() + " минут" +
                ". Станция отправления: " + train.getStartStation() +
                ". Станция прибытия: " + train.getEndStation() +
                ". Количество вагонов: " + train.getAmountWagons()+
                ". тип топлива: " + train.getFuelType() +
                ". количество топлива: " + train.getAmountFuel() + "литров."
        );
        train.reFuel();
    }

    public static void printInfo(Bus bus) {
        System.out.println(
                "Марка автомобиля: " + bus.getBrand() +
                        ". Модель: " + bus.getModel() +
                        ". Цвет " + bus.getColor() +
                        ". Год выпуска: " + bus.getYear() +
                        ". Страна производства " + bus.getCountry()+
                        ". Максимальная скорость " + bus.getMaxSpeed()+
                        ". тип топлива: " + bus.getFuelType() +
                        ". количество топлива: " + bus.getAmountFuel() + " литров."


        );
        bus.reFuel();

    }
}

