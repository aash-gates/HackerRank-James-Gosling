import java.math.*;

public class BigIntegerDemo {

   public static void main(String[] args) {

      // create 2 BigInteger objects
      BigInteger n1,n2;

      // create 3 Boolean objects
      Boolean b1, b2, b3;

      // assign values to n1, n2
      n1 = new BigInteger("7");
      n2 = new BigInteger("9");

      // perform isProbablePrime on n1, n2
      b1 = n1.isProbablePrime(1);
      b2 = n2.isProbablePrime(1);
      b3 = n2.isProbablePrime(-1);

      // check if n1 is prime or not if certainity =1
      if(b1)
      System.out.println(n1 + " is prime with certainity 1" );
      else
      System.out.println(n1 + " is not prime with certainity 1" );
      
      // check if n2 is prime or not if certainity =1
      if(b2)
      System.out.println(n2 + " is prime with certainity 1" );
      else
      System.out.println(n2 + " is not prime with certainity 1" );
      
      // check if n2 is prime or not if certainity =-1
      if(b3)
      System.out.println(n2 + " is prime with certainity -1");
      else
      System.out.println(n2 + " is not prime with certainity -1" );
   }
}