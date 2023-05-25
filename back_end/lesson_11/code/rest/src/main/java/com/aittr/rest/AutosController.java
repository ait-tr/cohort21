package com.aittr.rest;

import org.springframework.context.annotation.Conditional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/autos")
public class AutosController {

    static final List<Auto> autos=new ArrayList<>(
            List.of(
                 new Auto(1,"Mercedes","BA1324",2018),
                 new Auto(2,"Audi","CA8824",2020),
                 new Auto(3,"Audi","CA99",2019),
                 new Auto(4,"Ford","BA1736",2016),
                 new Auto(5,"Mercedes","AA1211",2017)
            )
    );

    @GetMapping("")  // "/autos"
    public List<Auto> listAuto (@RequestParam(name = "brand", required = false,defaultValue = "all") String brand ){
        if (brand.equals("all")){
            return autos;
        } else {
            return autos.stream().filter(a->a.getBrand().equals(brand)).toList();
        }


    }

    @GetMapping("/{id}")  // "/autos"
    public Auto getAuto (@PathVariable int id){
        Auto res = autos.stream().filter(a->a.getId()==id).findAny().get();
        return res;
    }
    @PostMapping("")
    @ResponseStatus(code= HttpStatus.CREATED)
    public Auto createAuto(@RequestBody Auto auto){
        autos.add(auto);
        return auto;
    }

    @DeleteMapping("/{id}")
    public Auto deleteAuto(@PathVariable int id){
        Auto auto = autos.stream().filter(a->a.getId()==id).findAny().get();
        autos.remove(auto);
        return auto;
    }

    @PostMapping("/{id}")
    public Auto updateAuto(@PathVariable int id, @RequestBody Auto auto ){
        // TODO update car
        return auto;
    }





}
