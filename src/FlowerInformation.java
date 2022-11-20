public class FlowerInformation {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[]{
                new Flower("Роза обыкновенная", "розовая", "Голландия", 35.59, 6),
        new Flower("Хризантема", "красная", "Польша", 15.00, 5),
        new Flower("Пион", "желтый", "Великобритания", 69.99, 1),
        new Flower("Гипсофила", "черная", "Турция", 19.50, 10),

        };
        getFlowerInformation(flowers);


    }
    private static double calculateSumCostFlowers(Flower[] flowers) {
        double sum = 0;
        for (Flower flower: flowers) {
            sum += flower.getCost();
        }
        int tax = 10;
        sum = sum + (sum*tax/100);

        return sum;
    }

    private static int findMinLifeSpan (Flower[] flowers){
       int min = flowers[0].getLifeSpan();
        for (Flower flower: flowers) {
            if(flower.getLifeSpan() < min) {
                min = flower.getLifeSpan();
            }
        }
        return min;
    }

    public static void getFlowerInformation(Flower[] flowers){
        for (Flower flower: flowers) {
            System.out.println(flower);
        }
        System.out.println(calculateSumCostFlowers(flowers));
        System.out.println(findMinLifeSpan(flowers));

    }

}
