public class PrimeNumberGeneratorV2 {
public static void main(String[] args) {
        for(int a=1; a < 1000; a++){
             boolean Prime = true;
                  for(int b=2; a > b ; b++){         
                	  if(a % b == 0){
                      Prime = false;
                      break;
                     }
                 }
                      if(Prime)
                      System.out.println(a);
                }
        }
}