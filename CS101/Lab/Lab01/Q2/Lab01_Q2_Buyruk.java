
public class Lab01_Q2_Buyruk {

    public static void main(String[] args) {

        int timeInSeconds = 12486;

        //Find hours for the format timeInSeconds = HOUR:MINUTE:SECOND
        int hours = timeInSeconds / 3600;
        //Then substract (hours) worth of seconds from timeInSeconds to find remaining time for (minutes) + (seconds).
        int remainingTime = timeInSeconds % 3600;

        //Repeat the process for minutes
        int minutes = remainingTime / 60;
        //Substracting minutes and finding remaining time for (seconds).
        int seconds = remainingTime % 60;

        System.out.println( timeInSeconds + "seconds represents " + hours + " hours " + minutes + " minutes " + seconds + " seconds." );


    }

}