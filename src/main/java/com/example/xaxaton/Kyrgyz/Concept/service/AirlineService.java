package com.example.xaxaton.Kyrgyz.Concept.service;

import com.example.xaxaton.Kyrgyz.Concept.entity.AirlineEntity;
import com.example.xaxaton.Kyrgyz.Concept.repository.AirlineRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AirlineService {
    AirlineRepository repo;


    public Long create(AirlineEntity entity){
        return  repo.save(entity).getId();
    }

    public AirlineEntity findById(Long id){
        return  repo.findById(id).get();
    }

    public List<AirlineEntity> findAll(){
        return repo.findAll();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }

    public AirlineEntity update(AirlineEntity updateAirline){
        AirlineEntity existsAirlineEntity = findById(updateAirline.getId());

        existsAirlineEntity.setName(updateAirline.getName());
        existsAirlineEntity.setCode(updateAirline.getCode());

        return repo.save(existsAirlineEntity);
    }
}
