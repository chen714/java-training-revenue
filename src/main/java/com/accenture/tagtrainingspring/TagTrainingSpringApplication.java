package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;
import com.accenture.tagtrainingspring.screening.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();
		day1task2();
		day2Task1();
		//day2Task2();
		//day2Task3();

	}

	static ScreeningService service = new ScreeningService();


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
		Patient p = new Patient("Peter", 1, LocalDate.of(1998, 7, 14), Gender.MALE);
		Screening s = new Screening(1, p, LocalDate.of(2021, 7,5), Boolean.FALSE);
		System.out.println("Patient: " + s.getPatient().getName() + " has a malignant diagnosis of " +s.getMalignantResult());
	}


	private static void day2Task1(){
		System.out.println("==========================================day2Task1==========================================");
		ScreeningService screeningService = new ScreeningService();
		Patient p1 = new Patient("Peter", 1, LocalDate.of(1998, 7, 14), Gender.MALE);
		Screening s1 = new Screening(1, p1, LocalDate.of(2021, 7,5), Boolean.FALSE);
		boolean result = screeningService.isScreeningForPatient(p1,s1);
		System.out.println("Screening: "+ s1.getScreeningId() +" has a match of "+ result +" with patient: "+ s1.getPatient().getName());
	}

	private static void day2Task2(){
		System.out.println("==========================================day2Task2==========================================");


		List<Screening> screeningList = service.getAllScreenings();
		for(Screening s : screeningList){
			System.out.println("Screening for patient "+ s.getPatient().getName() +", returned a malignant result of "+ s.getMalignantResult());
		}
	}

	private static void day2Task3(){
		System.out.println("==========================================day2Task3==========================================");
		ScreeningService service = new ScreeningService();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to search for a patient (Y to confirm)");
		boolean found = scanner.nextLine().equalsIgnoreCase("Y") ? false : true;
		do {
			if(!found) {
				System.out.println("Enter patient name for search");
				String name = scanner.nextLine();
				Screening s = service.getScreeningByName(name);
				if (s != null) {
					System.out.println("Screening for patient " + s.getPatient().getName() + ", returned a malignant result of " + s.getMalignantResult());
					found = true;
				} else {
					System.out.println("Patient " + name + " not found, enter new name");
				}
			}
		}while(found != true);

	}
}
