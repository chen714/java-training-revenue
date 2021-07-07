package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ScreeningService {




    public boolean isScreeningForPatient(Patient p , Screening s ){
        if(p.getId().equals(s.getId())){
            return true;
        }
        return false;
    }
/*
    public List<Screening> getAllScreenings(){
       //return data.getAllScreenings();
        return null;
    }
/*
    public Screening getScreeningByName(String name){
        for(Screening s : getAllScreenings()){
            if(s.getName().equalsIgnoreCase(name)){
                return s;
            }
        }
        return null;
    }
*/
}
