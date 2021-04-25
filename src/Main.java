public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(75, 1.68); // введите вес в килограммах (например, 81)
        // и рост в метрах (например, если Ваш рост 181 см, то укажите 1.81)
        System.out.println("Ваш индекс массы тела:");
        System.out.printf("%.2f", bmi);
    }
}
