public class Lab01_Q3_Buyruk {

    public static void main(String[] args)
    {
        /*
        Write a Java program (Lab01_Q3_yourLastName.java) that outputs the value of y, according to 
    the given function. Assume x is -5.
        y = (x3 + 3|x| + 9) / x2
                
    Sample Run:
    The result of the expression: -4 */

        double x = -10;

        double y = ( Math.pow(x, 2) - 2*x + 9 ) / ( Math.pow(x, 3));

        System.out.println("The result of the expression in integer format: " + (int) (y) );
        System.out.println("The result of the experssion in double format: " + y);

    }
    
}