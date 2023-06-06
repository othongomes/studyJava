package util;

public class Converter {

    public static final double IOF = 0.06;
    public static double beBought;

    public static double CurrencyConverter(double price) {
        return beBought * price * (1 + IOF)
    }
}
