package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface DistilleryRepository extends JpaRepository<Distillery, Long>,DistilleryRepositoryCustom{
    List<Distillery> findDistilleryById(Long id );
    List<Distillery> findDistilleryByRegion(String region);
}
