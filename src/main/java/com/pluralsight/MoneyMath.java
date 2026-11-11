package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {
        float floatNum = 0;
        double doubleNum = 0;
        BigDecimal bigDecimalNum = BigDecimal.ZERO;

        for (int i=0; i < 10 ; i++) {
            floatNum += 0.10f;
            doubleNum += 0.10;
            bigDecimalNum = bigDecimalNum.add(new BigDecimal("0.10"));

            System.out.println(floatNum);
            System.out.println(doubleNum);
            System.out.println(bigDecimalNum);
        }

        floatNum = 0;
        doubleNum = 0;
        bigDecimalNum = BigDecimal.ZERO;

        for (int i=0; i < 1000 ; i++) {
            floatNum += 19.99f;
            doubleNum += 19.99;
            bigDecimalNum = bigDecimalNum.add(new BigDecimal("19.99"));
        }

        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(bigDecimalNum);
    }

}
