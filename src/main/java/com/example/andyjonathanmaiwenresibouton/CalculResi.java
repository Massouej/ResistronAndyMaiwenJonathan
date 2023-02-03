package com.example.andyjonathanmaiwenresibouton;

import java.math.BigDecimal;

/**
 * CalculResi is a class designed to create calculResult and convertResult so my code in the class Resicontroller is clearer
 *
 * @date 02/02/2023
 * @author Andy / Jonathan / Maiwen
 * @see ResiController
 */
public class CalculResi {
    /**
    *calculResult is a method doing (label1 * 10 + label2) * label3 (using BigDecimal)
     * @param label1 it is the value of the first ring
     * @param label2 it is the value of the second ring
     * @param label3 it is the value of the third ring
     * @return the result of (label1 * 10 + label2) * label3 (it is called bd)


     */
    public static double calculResult(int label1, int label2, double label3) {
        BigDecimal bd = BigDecimal.valueOf(label1).multiply(BigDecimal.valueOf(10)).add(BigDecimal.valueOf(label2)).multiply(BigDecimal.valueOf(label3));

        return bd.doubleValue(); // (label1 * 10 + label2) * label3;
    }
    /**
     *  converResult is a method converting the variable resistance from Ohms to KOhms, MOhms, GOhms if needed
     * @param resistance his value will be returned in the result variable in the ResiController class
     * @return the corresponding result needed (the converted values in K M or G if needed)
     *  */
    public static String convertResult(double resistance) {
        if (resistance < 1000) {
            return String.valueOf(resistance) + "Ω";
        } else if (resistance < 1000000) {
            return (String.valueOf(resistance / 1000)) + "KΩ";
        } else if (resistance < 1000000000) {
            return (String.valueOf(resistance / 1000000)) + "MΩ";
        } else {
            return (String.valueOf(resistance / 1000000000)) + "GΩ";
        }
    }
}