public class SharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo ){

        int firstDigitNumberOne =0;
        int firstDigitNumberTwo =0;
        int remainingNumberOne = numberOne;
        int remainingNumberTwo = numberTwo;


        if(  numberOne < 10 ||  numberOne > 99 || numberTwo < 10 || numberTwo >99  ){

            return false;

        }else{

            while (remainingNumberOne > 0) {

                firstDigitNumberOne = remainingNumberOne % 10;
                System.out.println(firstDigitNumberOne);

                remainingNumberOne = remainingNumberOne / 10;



            }

            while (remainingNumberTwo > 0) {

                firstDigitNumberTwo = remainingNumberTwo % 10;
                System.out.println(firstDigitNumberTwo);


                remainingNumberTwo = remainingNumberTwo / 10;
            }


        }

        if ( numberOne / 10 == numberTwo /10 || numberOne /10 == numberTwo % 10 || numberOne % 10 == numberTwo/10 || numberOne %10 == numberTwo % 10 ) {
            return true;
        }else{
            return false;
        }
    }
}
