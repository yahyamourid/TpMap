package com.example.mapAPI.repository;

import com.example.mapAPI.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Integer> {

    Position findById(int id);
}
