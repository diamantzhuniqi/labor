package labor;

public class Report {
	private double distance;
	private String author;
	private String content;
	private Probe probe1;
	private Probe probe2;
	
	public Report(String author, String content) {
		this.author = author;
		this.content = content;
	}
	
	public double setDistance(double distance) {
		return distance;
	}

}
