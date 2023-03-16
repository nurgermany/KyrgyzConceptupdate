package com.example.xaxaton.Kyrgyz.Concept.controller;

import com.example.xaxaton.Kyrgyz.Concept.entity.AirlineEntity;
import com.example.xaxaton.Kyrgyz.Concept.service.AirlineService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/airline")
public class AirController {
    @Autowired
    AirlineService service;

    @GetMapping("/{id}")
    public AirlineEntity getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<AirlineEntity> findAll() {
        return service.findAll();
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping
    public Long create(@RequestBody AirlineEntity entity) {
        return service.create(entity);
    }

    @PutMapping()
    public AirlineEntity update(@RequestBody AirlineEntity updateEntity) {
        return service.update(updateEntity);
    }

}
