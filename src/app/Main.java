package app;

public class Main {

    private  static final double CONV_K = 1.60934;

    public static void main(String[] args){
        System.out.println("App to convert miles to kilometers.");
        double mil = 7;
        double km = 10;
        double kilometers = convMilesToKilometers(mil);
        double miles = convKilometersToMiles(km);
        System.out.println("Result is " + kilometers + " km "+ miles + " mil.");
    }

    private static double convMilesToKilometers(double mil){
        return mil * CONV_K;
    }

    private static double convKilometersToMiles(double km){
        return km / CONV_K;
    }
}
