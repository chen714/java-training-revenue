package com.accenture.tagtrainingspring.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScreeningController {
    @Autowired
    ScreeningDao dao;

    @GetMapping("/screenings")
    public List<Screening> getScreenings(){
        return dao.getAllScreenings();
    }

    @GetMapping("/screenings/{id}")
    public Screening getScreeningById(@PathVariable int id){
        return dao.getScreeningById(id);
    }

    @PostMapping("screenings")
    public void getScreeningById(@RequestBody Screening screening){
         dao.addScreening(screening);
    }


}
