public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double weight = 88; //Вес в кг
        double height = 1.88; //Рост в метрах
        int bmiIndex = bmiService.calculate(weight, height);
        System.out.println("Ваш индекс массы тела: " + bmiIndex + " кг/м²");
    }
}