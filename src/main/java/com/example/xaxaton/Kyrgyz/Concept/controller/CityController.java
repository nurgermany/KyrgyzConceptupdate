package com.example.xaxaton.Kyrgyz.Concept.controller;

import com.example.xaxaton.Kyrgyz.Concept.entity.CityEntity;
import com.example.xaxaton.Kyrgyz.Concept.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/city")
public class CityController {
    @Autowired
    CityService service;


    @GetMapping("/{id}")
    public CityEntity getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<CityEntity> findAll() {
        return service.findAll();
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping
    public Long create(@RequestBody CityEntity entity) {
        return service.create(entity);
    }

    @PutMapping()
    public CityEntity update(@RequestBody CityEntity updateEntity) {
        return service.update(updateEntity);
    }

}
