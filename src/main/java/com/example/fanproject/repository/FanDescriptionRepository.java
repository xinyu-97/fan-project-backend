package com.example.fanproject.repository;

import com.example.fanproject.model.Fan;
import com.example.fanproject.model.FanDescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FanDescriptionRepository extends JpaRepository<FanDescription, Integer> {

}
