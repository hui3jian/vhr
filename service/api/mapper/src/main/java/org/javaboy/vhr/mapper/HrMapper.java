package org.javaboy.vhr.mapper;

import org.javaboy.vhr.model.Hr;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HrMapper {
    List<Hr> getAllHrData();
}
