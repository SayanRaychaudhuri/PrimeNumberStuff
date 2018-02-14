public class NumberOfPrimeFactors{

   public static void main(String[] args) {
	   int a = 127;
	   int i = 1;
	   
	   for(int b=1;b<=a;b++){
		   if (a%b==0){
			   System.out.println(i++);
		   }
	   }
   }
} 
