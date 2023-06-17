package com.example.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static java.util.Comparator.comparing;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    private DBDriver dbDriver;
    private RepositoryService repository;



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


    public String getLongestString(){
        List<String> all = repository.findAll();
        return all.stream()
                .max(comparing(String::length))
                .orElse(null);
    }

    public void saveString(String str){
        repository.save("st3r");


    }

    public List<String>  getAllString(){
        return  repository.findAll();
    }



}
