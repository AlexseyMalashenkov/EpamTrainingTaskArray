package by.malashenkov.first.util;

public class RoundDouble {
    public static double round(double number) {
        double scale = Math.pow(10, 3);
        double result = Math.ceil(number * scale) / scale;

        return result;
    }
}