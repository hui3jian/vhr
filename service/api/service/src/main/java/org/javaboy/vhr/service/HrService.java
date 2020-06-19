package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.HrMapper;
import org.javaboy.vhr.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrService {

    @Autowired
    HrMapper hrMapper;

    public List<Hr> getAllHrData() {
        return hrMapper.getAllHrData();
    };
}
