package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;

public class ScreeningService {
    public ScreeningService (){}

    public boolean isScreeningForPatient(Patient p , Screening s ){
        if(p.getId().equals(s.getPatient().getId())){
            return true;
        }
        return false;
    }

}
