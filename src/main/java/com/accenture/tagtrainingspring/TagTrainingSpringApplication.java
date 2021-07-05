package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();
		day1task2();
		day2Task1();
		day2Task2();


	}

	private static void printWelcomeMessage() {
		System.out.println("\n" +
				"  _______       _____   _______        _       _             \n" +
				" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
				"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
				"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
				"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
				"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
				"                                                        __/ |\n" +
				"                                                       |___/ \n");
	}

	private static void day1task2() {
		System.out.println("==========================================day1task2==========================================");
		Patient p = new Patient("Peter", 1, LocalDate.of(1998, 07, 14), Gender.MALE);
		Screening s = new Screening(1, p, LocalDate.of(2021, 07,05), Boolean.FALSE);
		System.out.println("Patient: " + s.getPatient().getName() + " has a malignant diagnosis of " +s.getMalignantResult());
	}


	private static void day2Task1(){
		System.out.println("==========================================day2Task1==========================================");
		ScreeningService screeningService = new ScreeningService();
		Patient p1 = new Patient("Peter", 1, LocalDate.of(1998, 07, 14), Gender.MALE);
		Screening s1 = new Screening(1, p1, LocalDate.of(2021, 07,05), Boolean.FALSE);
		boolean result = screeningService.isScreeningForPatient(p1,s1);
		System.out.println("Screening: "+ s1.getScreeningId() +" has a match of "+ result +" with patient: "+ s1.getPatient().getName());
	}

	private static void day2Task2(){
		System.out.println("==========================================day2Task2==========================================");
		ScreeningService screeningService = new ScreeningService();
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

		for(Screening s : screeningList){
			System.out.println("Screening for patient "+ s.getPatient().getName() +", returned a malignant result of "+ s.getMalignantResult());
		}
	}
}
