package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;

public class Screening {
    private Integer screeningId;
    private Patient patient;
    private LocalDate dateOfScreening;
    private Boolean malignantResult;

    public Screening(Integer screeningId, Patient patient, LocalDate dateOfScreening, Boolean malignantResult) {
        this.screeningId = screeningId;
        this.patient = patient;
        this.dateOfScreening = dateOfScreening;
        this.malignantResult = malignantResult;
    }

    @Override
    public String toString() {
        return "Screening{" +
                "screeningId=" + screeningId +
                ", patient =" + patient +
                ", dateOfScreening=" + dateOfScreening +
                ", malignantResult=" + malignantResult +
                '}';
    }

    public Integer getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(Integer screeningId) {
        this.screeningId = screeningId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDateOfScreening() {
        return dateOfScreening;
    }

    public void setDateOfScreening(LocalDate dateOfScreening) {
        this.dateOfScreening = dateOfScreening;
    }

    public Boolean getMalignantResult() {
        return malignantResult;
    }

    public void setMalignantResult(Boolean malignantResult) {
        this.malignantResult = malignantResult;
    }
}
