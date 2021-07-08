import java.math.BigInteger;
import java.util.ArrayList;

public class euler10 {

    public static void main(String[] args) {

        int n = 2000000;
        ArrayList<BigInteger> primes = new ArrayList<BigInteger>();
        int k = 1;


        for (BigInteger i = new BigInteger("2"); i.compareTo(BigInteger.valueOf(n)) < 0; i = i.add(BigInteger.valueOf(1))) {

            Boolean czyLiczbaJestPierwsza = true;

            for (BigInteger prime : primes) {

                if (i.mod(prime) == BigInteger.ZERO) {
                    czyLiczbaJestPierwsza = false;
                    break;
                }

            }

            if (czyLiczbaJestPierwsza) {

                primes.add(i);



                BigInteger sum = new BigInteger("0");


                for( BigInteger num : primes) {
                    sum = num.add(sum);
                }
                System.out.println("Sum of array elements is:"+sum);






            }

        }

    }
}