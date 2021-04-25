public class BmiService {
    public double calculate(double mass, double height) {
        double result = mass / (height * height);
        return result;
    }
}
