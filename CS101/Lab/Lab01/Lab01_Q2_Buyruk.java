public class Lab01_Q2_Buyruk {

    public static void main(String[] args) {

        long timeInSeconds = 1248600;

        //Find weeks for the format timeInSeconds = WEEK:DAY:HOUR:MINUTE:SECOND
        long weeks = timeInSeconds / (3600*24*7);
        //Then substract (weeks) worth of seconds from timeInSeconds to find remaining time for (days) + (hours) + (minutes) + (seconds).
        long remainingTime = timeInSeconds % (3600*24*7);

        //Repeat the process for days
        long days = remainingTime / (3600*24);
        //Substracting minutcleares and finding remaining time for (seconds).
        remainingTime = remainingTime % (3600*24);

        long hours = remainingTime / 3600;
        remainingTime = remainingTime % 3600;
        
        long minutes = remainingTime / 60;
        long seconds = remainingTime % 60;

        System.out.println( timeInSeconds + " seconds represents " + weeks + " weeks " + days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds." );

    }

}