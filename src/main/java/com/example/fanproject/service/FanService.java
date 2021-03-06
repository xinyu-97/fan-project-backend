package com.example.fanproject.service;

import com.example.fanproject.model.Fan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FanService {

    List<Fan> getAllFans();

    List<Fan> getFansByManufacturerName(String name);

}
