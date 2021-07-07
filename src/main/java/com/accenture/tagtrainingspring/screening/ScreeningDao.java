package com.accenture.tagtrainingspring.screening;

import java.util.List;

public interface ScreeningDao {
    public Screening getScreeningById(int patientId);

    public List<Screening> getAllScreenings();

    public void addScreening(Screening screening);

}
