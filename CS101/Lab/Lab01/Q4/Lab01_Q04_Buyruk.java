public class Lab01_Q04_Buyruk {

    public static void main(String[] args) {

        final double goldenRatio = ( 1 + Math.sqrt(5) ) / 2;
        int n = 101;

        double fibonacci = ( Math.pow(goldenRatio, n) - Math.pow(-1/goldenRatio, n) ) / Math.sqrt(5);

        System.out.println("Fibonacci(" + n + ") is " + (long) (fibonacci) );

    }
    
}
