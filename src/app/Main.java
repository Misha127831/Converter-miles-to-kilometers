package app;

public class Main {

    private  static final double CONV_K = 1.60934;

    public static void main(String[] args){
        System.out.println("App to convert miles to kilometers.");
        double mil = 7;
        double kilometers = convMilesToKilometers(mil);
        System.out.println("Result is " + kilometers + " km.");
    }

    private static double convMilesToKilometers(double mil){
        return mil * CONV_K;
    }
}
