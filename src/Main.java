public class Main {
    public static void main(String[] args) {
      BmiService service = new BmiService();
      double heightInMeters = 1.58;
      double weightInKg = 50.2;
      int bmi = service.calculate(heightInMeters, weightInKg);

        System.out.println("Индекс массы вашего тела " + bmi);
    }
}
