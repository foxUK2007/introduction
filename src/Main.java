import transport.Car;
import transport.Car.Key;

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

        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", -2015, null, "МКПП", "седан", "н357ро174", 5, true);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", -3.0, "черный", -2020, null, "АКПП", "хэтчбэк", "к555кк177", 4, false);
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", -2021, "Сборка в Германии", "АКПП", "родстер", "а777аа177", 2, false);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", -2.4, "красный", -2018, "Сборка в Южной Корее", "МКПП", "кроссовер", "р324ео199", 5, true);
        Car car5 = new Car("Hyundai", "Avante", -1.6, "оранжевый", -2016, "Сборка в Южной Корее", "АКПП", "седан", "х555св177", 5, true);
        Car.Key car1Key = car1.new Key("запуск двигателя с ключа", "доступ с ключа");
        Car.Key car2Key = car2.new Key("удаленный запуск двигателя", "бесключевой доступ");
        Car.Key car3Key = car3.new Key("удаленный запуск двигателя", "бесключевой доступ");
        Car.Key car4Key = car4.new Key("запуск двигателя с ключа", "доступ с ключа");
        Car.Key car5Key = car5.new Key("запуск двигателя с ключа", "доступ с ключа");
        Car.Insurance car1Insurance = car1.new Insurance("Действует до 12.23", 2500, "789542348");
        Car.Insurance car2Insurance = car2.new Insurance("Действует до 01.23", 5000, "788823487");
        Car.Insurance car3Insurance = car3.new Insurance("Действует до 12.22", 3200, "257896124");
        Car.Insurance car4Insurance = car4.new Insurance("Действует до 06.23", 7000, "548796123");
        Car.Insurance car5Insurance = car5.new Insurance("Действует до 09.23", 9000, "987214691");

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        car1.setEngineVolume(0);
        Car.setRegistrationNumber("1рк5л60ам");
        System.out.println(car1Key.getKeylessEntry());

    }


}

