package br.com.victorgabrielfs.utils;

import br.com.victorgabrielfs.exceptions.UnsupportedMathOperationException;

public class NumberUtils {
    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double convertToDouble(String number) throws Exception {

        if (!isNumeric(number)){
            throw new UnsupportedMathOperationException();
        }else{
            return Double.parseDouble(number);
        }

    }

    public static Double sum(String numberOne, String numberTwo) throws Exception {
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    public static Double subtract(String numberOne, String numberTwo) throws Exception {
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    public static Double multiply(String numberOne, String numberTwo) throws Exception {
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    public static Double divide(String numberOne, String numberTwo) throws Exception {
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    public static Double average(String numberOne, String numberTwo) throws Exception {
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    public static Double sqrt(String numberOne) throws Exception {
        return Math.sqrt(convertToDouble(numberOne));
    }
}
