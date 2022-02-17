public class TypeCastingDetails
{
	public static void main(String[] args) 
	{

        int noOfPiratedMovies = 1383;
        int hoursOfPrisonTimePerMovie = 900;

        double totalHours = hoursOfPrisonTimePerMovie * noOfPiratedMovies;
		
		// First 3 lines are faulty, can you fix them?
		int hours = (int) (totalHours % 24);
		int days = int (totalHours) / 24;
		int years = days / 365.0;
		days = days % 365;
    
    }

        
}