package com.cerveja.SuperBeer;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class ControllerBeer {

    Set<Beer> list = new LinkedHashSet<>();  
    Integer id = 1;
    @GetMapping
    public Set<Beer> listaCerveja(){
        return list;
    }

    @PostMapping
    public void postBeer(@RequestBody RecordBeer beer){
        var bb = new Beer(id,beer.marca(), beer.valor(), beer.volume());
        list.add(bb);
        id++;    
    }

    @PutMapping
    public void updateBeer(@RequestBody RecordBeer beer){
        for(Beer b: list){
            if (b.getMarca().equals(beer.marca())) {
                b.setMarca(beer.marca());
                b.setValor(beer.valor());
                b.setVolume(beer.volume());
                
            }
        }

    }
    @DeleteMapping("/{id}")
    public void deleteBeer(@PathVariable Integer id){
        for(Beer b: list){
            if (b.getId() == id) {
                list.remove(b);
            }
        }
    }
}
