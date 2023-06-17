package com.example.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class RepositoryService {
    private DBDriver dbDriver;

    public List<String> findAll(){
        return new ArrayList<>(dbDriver);
    }

    public  String findById(int id){
        return dbDriver.get(id);
    }


    public int save(String str){
        dbDriver.add(str);
        return dbDriver.size();
    }

}
