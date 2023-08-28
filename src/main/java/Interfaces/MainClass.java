package Interfaces;

public class MainClass {

    public static void main(String args[])
    {
//        Calc<Integer> calcu = new CalculatorInteger();
//        int a=10, b=20;
//        System.out.println(calcu.addition(a,b));
//        System.out.println(calcu.subtraction(a,b));
//        System.out.println(calcu.multiplication(a,b));
//        System.out.println(calcu.division(a,b));
//
//        Calc<Double> doubleCalc = new CalculatorDouble();
//        double x=10, y=20;
//        System.out.println(doubleCalc.addition(x,y));
//        System.out.println(doubleCalc.subtraction(x,y));
//        System.out.println(doubleCalc.multiplication(x,y));
//        System.out.println(doubleCalc.division(x,y));

   //     List list = new ArralistPractice<Integer>();
        exceptionHandler();
    }


    public static void exceptionHandler() {
        try {
            Calc<Double> doubleCalc = new CalculatorDouble();
            doubleCalc.division(10.0,0.0);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("illegalArgumentException");
        } catch (Exception exception) {
            System.out.println("exception");
        }
    }
}
