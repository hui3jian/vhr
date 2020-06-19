package org.javaboy.vhr.controller;

import org.javaboy.vhr.model.Hr;
import org.javaboy.vhr.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    HrService hrService;

    @GetMapping("/index")
    public String Index() {
        return "Index";
    }

    @GetMapping("/getHrs")
    public List<Hr> getHrs() {
        List<Hr> jsonData = hrService.getAllHrData();
        return jsonData;
    }
}
