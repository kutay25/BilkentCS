public class Lab01_Q4_Buyruk {

    public static void main(String[] args) {

        final double goldenRatio = ( 1 + Math.sqrt(5) ) / 2;
        int n = 0;

        double fibonacci = ( Math.pow(goldenRatio, n) - Math.pow(-1/goldenRatio, n) ) / Math.sqrt(5);

        System.out.println("Fibonacci(" + n + ") is " + (long) (fibonacci) );

    }
    
}