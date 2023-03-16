package com.example.xaxaton.Kyrgyz.Concept.service;

import com.example.xaxaton.Kyrgyz.Concept.entity.AirlineEntity;
import com.example.xaxaton.Kyrgyz.Concept.entity.CityEntity;
import com.example.xaxaton.Kyrgyz.Concept.repository.AirlineRepository;
import com.example.xaxaton.Kyrgyz.Concept.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityService {
    CityRepository repo;


    public Long create(CityEntity entity){
        return  repo.save(entity).getId();
    }

    public CityEntity findById(Long id){
        return  repo.findById(id).get();
    }

    public List<CityEntity> findAll(){
        return repo.findAll();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }

    public CityEntity update(CityEntity updateCity){
        CityEntity existsCityEntity = findById(updateCity.getId());

        existsCityEntity.setName(updateCity.getName());
        existsCityEntity.setCode(updateCity.getCode());

        return repo.save(existsCityEntity);
    }
}

