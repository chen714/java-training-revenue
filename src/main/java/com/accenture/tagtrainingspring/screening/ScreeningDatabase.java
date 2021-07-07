package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ScreeningDatabase {
    public List<Screening> getAllScreenings(){
        Patient p1 = new Patient("Peter", 1, LocalDate.of(1998, 07, 14), Gender.MALE);
        Screening s1 = new Screening(1, p1, LocalDate.of(2021, 07,05), Boolean.FALSE);
        Patient p2 = new Patient("John", 2, LocalDate.of(1997, 06, 13), Gender.MALE);
        Screening s2 = new Screening(2, p2, LocalDate.of(2021, 07,04), Boolean.FALSE);
        Patient p3 = new Patient("Sandra", 3, LocalDate.of(1998, 8, 12), Gender.FEMALE);
        Screening s3 = new Screening(3, p3, LocalDate.of(2021, 07,9), Boolean.FALSE);
        Patient p4 = new Patient("Lauren", 4, LocalDate.of(1999, 07, 18), Gender.FEMALE);
        Screening s4 = new Screening(4, p4, LocalDate.of(2021, 07,20), Boolean.FALSE);

        List<Screening> screeningList = new ArrayList<Screening>();
        screeningList.add(s1);
        screeningList.add(s2);
        screeningList.add(s3);
        screeningList.add(s4);
        return screeningList;
    }
}
