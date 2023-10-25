package com.example.mapAPI.controller;

import com.example.mapAPI.entity.Position;
import com.example.mapAPI.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/positions")
public class PositionController {
    @Autowired
    private PositionRepository positionRepository;

    @PostMapping
    public void save(@RequestBody Position position){
        positionRepository.save(position);
    }

    @GetMapping
    public List<Position> getAll(){
        return positionRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Position> getById(@PathVariable int id){
        Position position = positionRepository.findById(id);
        if(position != null)
            return ResponseEntity.ok().body(position);
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping("delete/{id}")
    public void delete(@PathVariable int id){
            Position position = positionRepository.findById(id);
            positionRepository.delete(position);
    }
}
