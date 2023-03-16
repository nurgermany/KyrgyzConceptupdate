package com.example.xaxaton.Kyrgyz.Concept.repository;

import com.example.xaxaton.Kyrgyz.Concept.entity.AirlineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends JpaRepository<AirlineEntity, Long> {
}
