package com.example.fanproject.service.impl;

import com.example.fanproject.model.Fan;
import com.example.fanproject.repository.FanDescriptionRepository;
import com.example.fanproject.repository.FanRepository;
import com.example.fanproject.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FanServiceImpl implements FanService {

    @Autowired
    private FanRepository fanRepository;

    @Autowired
    private FanDescriptionRepository fanDescriptionRepository;

    @Override
    public List<Fan> getAllFans(){
        return fanRepository.findAll();
    }

    @Override
    public List<Fan> getFansByManufacturerName(String name){
        return fanRepository.findByFanDescription_Manufacturer(name);
    }
}
