package labor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employees {
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private ArrayList reports;
	
	public Employees(String firstName, String lastName, LocalDate birthDate, ArrayList reports) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.reports = reports;
	}

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public ArrayList addReports(Report x) {
		return reports;
	}


	

}
