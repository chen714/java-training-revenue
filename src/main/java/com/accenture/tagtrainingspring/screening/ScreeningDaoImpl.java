package com.accenture.tagtrainingspring.screening;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ScreeningDaoImpl implements ScreeningDao{
   @Autowired
    JdbcTemplate template;

   private static final String SQL_GET_ALL_SCREENINGS = "SELECT * FROM SCREENING_RESULTS";
   private static final String SQL_GET_SCREENINGS_BY_ID = "SELECT * FROM SCREENING_RESULTS WHERE ID = ?";
   private static final String SQL_ADD_SCREENING = "INSERT INTO SCREENING_RESULTS (ID, DIAGNOSIS, SYMMETRY_MEAN, GROUP_ID) VALUES (?, ?, ?, ?)";

    @Override
    public Screening getScreeningById(int patientId) {
        log.info("Getting patient by id " +patientId);
        try {
            return template.queryForObject(SQL_GET_SCREENINGS_BY_ID, new Object[]{patientId}, new ScreeningRowMapper());
        }catch(Exception e){
            System.out.println("Exception occurred: " +e);
            log.error("Patient with id "+ patientId +" was not found.");
        }
        return null;
    }

    @Override
    public List<Screening> getAllScreenings() {
        log.info("Get all screenings...");
        return template.query(SQL_GET_ALL_SCREENINGS, new ScreeningRowMapper());

    }

    @Override
    public void addScreening(Screening screening) {
        log.info("Add screening: "+ screening.toString());
        template.update(SQL_ADD_SCREENING, screening.getId(), screening.getDiagnosis(), screening.getSymmetryMean(), screening.getGroupId());
    }
}
