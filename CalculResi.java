package com.example.andyjonathanmaiwenresibouton;

import java.math.BigDecimal;

public class CalculResi {
    public static double calculResult(int label1, int label2, double label3) {
        BigDecimal bd = BigDecimal.valueOf(label1).multiply(BigDecimal.valueOf(10)).add(BigDecimal.valueOf(label2)).multiply(BigDecimal.valueOf(label3));

        return bd.doubleValue(); // (label1 * 10 + label2) * label3;
    }

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