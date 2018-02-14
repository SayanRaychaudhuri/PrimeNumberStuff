import java.util.*;
public class PrimeNumberGeneratorV3
{
    public static void main (String[] args)
    {
    	double limit = 1E9;
        List<Integer> PrimeArray = new ArrayList<Integer>();
        for (int a = 2; a<limit; a++)
        {
            boolean Prime = true;
            for (int b = 2; a>b; b++) 
                if (a%b == 0) 
                	Prime = false; 
            if (Prime)
            {
                System.out.println(a); 
                PrimeArray.add(a); 
            }
        }
    }
}