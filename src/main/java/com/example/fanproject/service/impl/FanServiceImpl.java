package com.example.fanproject.service.impl;

import com.example.fanproject.model.Fan;
import com.example.fanproject.repository.FanRepository;
import com.example.fanproject.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FanServiceImpl implements FanService {

    @Autowired
    private FanRepository fanRepository;

    @Override
    public List<Fan> getAllFans(){
        return fanRepository.findAll();
    }
}
