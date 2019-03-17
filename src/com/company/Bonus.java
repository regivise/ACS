package com.company;

import java.math.BigDecimal;

public class Bonus {
    public static void main(String[] args) {
        BigDecimal balance = new BigDecimal(30) ;
        System.out.println(addBonus(balance));


    }
    public static BigDecimal addBonus(BigDecimal b){

        BigDecimal plusBonus=b;
        BigDecimal bonus = new BigDecimal(30);
        return plusBonus.add(bonus) ;

    }
}
