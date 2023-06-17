package com.example.demo1;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    Integer findMax(Integer i1, Integer i2){
        if(i1==null||i2==null) {
            throw new IllegalArgumentException("Should be not null");
        }

        return (i1<i2)?i2:i1;
    }


    boolean isPalindrome(String str){
        if(str==null) return true;
        return new StringBuilder(str).reverse().toString().equals(str);
    }


    Integer findMax(List<Integer> list){
        return list.stream()
                .mapToInt(i->i.intValue())
                .max()
                .getAsInt();
    }

}
