public class App {
    public static void main(String[] args) {
        Scanner input;
        double radius;
        double area;
        double circumference;

        //Create Scanner object
        input = new Scanner( System.in );

        //Read data
        System.out.print("Enter radius:");
        radius = input.nextDouble();
                 input.close();

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        System.out.printf("Area is %d and the circumference is %d", area, circumference);

    }
}
