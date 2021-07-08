public class euler6 {

    public static void main(String[] args) {

        int sumOfSquares = 0;
        int squareOfSum = 0;


        for (int i = 1; i <= 100; i++) {

            sumOfSquares = sumOfSquares + i * i;
            squareOfSum = squareOfSum + i;


        }
        System.out.println(sumOfSquares);
        System.out.println(squareOfSum * squareOfSum);
        System.out.println(squareOfSum * squareOfSum - sumOfSquares);

    }
}