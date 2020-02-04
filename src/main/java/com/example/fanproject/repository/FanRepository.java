package com.example.fanproject.repository;

import com.example.fanproject.model.Fan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FanRepository extends JpaRepository<Fan, Integer> {

}
