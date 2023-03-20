package labor;

import java.util.ArrayList;
import java.util.Map;

public class Labor {
	private String adress;
	private ArrayList<Employees>employees;
	private Map<Integer, Report>archive;
	private ArrayList<Probe>samples;
	
	public Labor(String adress, ArrayList employees, Map archive, ArrayList samples) {
		this.adress = adress;
		this.employees = employees;
		this.archive = archive;
		this.samples = samples;
	}

	public String getAdress() {
		return adress;
	}

	public ArrayList addEmployees(Employees x) {
		return employees;
	}

	public Map archiveReport(Report x) {
		return archive;
	}

	public ArrayList addSample(Probe x) {
		return samples;
	}

	
	

	

}
