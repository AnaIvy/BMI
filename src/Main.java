public class Main {
    public static void main(String[] args) {
        Bmiservice service = new Bmiservice();
        float index = service.calculate(58.5F, 1.74F);
        System.out.println("Индекс массы тела: " + index);
    }
}