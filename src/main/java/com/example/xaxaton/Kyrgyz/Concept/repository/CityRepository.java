package com.example.xaxaton.Kyrgyz.Concept.repository;

import com.example.xaxaton.Kyrgyz.Concept.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.jaas.JaasPasswordCallbackHandler;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {
}
