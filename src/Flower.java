public class Flower {
    String flowerTitle;
    private String flowerColor;
    public static String country;
    private double cost;
    public int lifeSpan;


    public Flower(String flowerTitle, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
        this.flowerTitle = flowerTitle;


    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            System.out.println("белый");
        } else {
            this.flowerColor = flowerColor;
        }

    }

    public static String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFlowerTitle() {
        return flowerTitle;
    }

    public void setFlowerTitle(String flowerTitle) {
        this.flowerTitle = flowerTitle;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "Название цветка: " + getFlowerTitle() + ". Цвет: " + getFlowerColor() + ". Страна: " + getCountry() + ". Стоимость " + getCost() + " рублей. Время стояния: " + getLifeSpan() + " дней.";
    }


    public static int calculateAmountFlowers() {
        int sumFlowers = 0;
        int amount[] = new int[4];
        amount[0] = 3;
        amount[1] = 5;
        amount[2] = 1;
        amount[3] = 3;
        for (int i = 0; i < amount.length; i++) {
            sumFlowers = sumFlowers * amount[i];
        }
        System.out.println(sumFlowers);
        return sumFlowers;
    }
}
