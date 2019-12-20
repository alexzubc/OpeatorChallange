package academy.programming;

public class Main {

    public static void main(String[] args) {
        // my solution
        System.out.println("My solution");
        double myFirstDoubleVar = 20.00d;
        double mySecondDoubleVar = 80.00d;
        double result = (myFirstDoubleVar + mySecondDoubleVar) * 100d;
        System.out.println("result = " + result);
        int remainder = (int)(result % 40.00d);
        //remainder = 5;
        System.out.println("remainder = " + remainder);
        boolean isZeroRem = (remainder == 0) ? true : false;
        System.out.println("isZeroRem is " + isZeroRem);

        if (!isZeroRem) {
            System.out.println("Got some remainder");
        }

        // Tim solution
        System.out.println("\nTim's solution");
        double myFistValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFistValue + mySecondValue) * 100.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0d) ? true : false;
        System.out.println("isNoRemainder is " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
