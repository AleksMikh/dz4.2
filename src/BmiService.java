public class BmiService {
    public int calculate(int weight, double height) {
        double myBmi = weight / (height * height);
        return (int) myBmi;
    }
}
