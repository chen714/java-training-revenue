package com.accenture.tagtrainingspring.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScreeningController {
    @Autowired
    ScreeningService service;

    @GetMapping("/screenings")
    public List<Screening> getScreenings(){
        return service.getAllScreenings();
    }

}
