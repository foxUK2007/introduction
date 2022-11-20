public class Human {

    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    public int getYearOfBirth() {
        if (yearOfBirth <= 0) {
            return 0;
        }
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth == 0) {
            System.out.println("информация не указана");
        } else {
            this.town = town;
        }

        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        if (name == null) {
            return "Информация отсутствует";
        }
        return name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            System.out.println("информация не указана");
        } else {
            this.town = town;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Год рождения: " + getYearOfBirth() + ". Моя профессия: " + getJobTitle() + ". Будем знакомы!";
    }
}
