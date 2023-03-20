package labor;

import java.time.LocalDate;

public class DnaSample implements Probe {
	private String dnaSeq;
	private String discoveryPlace;
	private LocalDate discoveryDate;
	
	public DnaSample(String dnaSeq, String discoveryPlace, LocalDate discoveryDate) {
		this.dnaSeq = dnaSeq;
		this.discoveryPlace = discoveryPlace;
		this.discoveryDate = discoveryDate;
	}
	
	public String getDnaSeq() {
		//1. Sie darf nur aus den Zeichen A,T,G und C bestehen.
		if(!dnaSeq.matches("[ATGC]+")) {
			throw new IllegalArgumentException("DNA-Sequenz enthält unzulässige Buchstaben.");
		}
		//3. Die DNA Sequenz muss mit dem 3-er Block ATG beginnen
		if (!dnaSeq.startsWith("ATG")) {
			throw new IllegalArgumentException("DNA Sequenz muss mit dem ATG-Codon beginnen");
		}
		//4. Die DNA Sequenz muss mit einer der folgenden Stop 3-er Blöcke beendet werden: TAA, TAG oder TGA
		if (!dnaSeq.endsWith("TAA") && dnaSeq.endsWith("TAG") && dnaSeq.endsWith("TGA")) {
			throw new IllegalArgumentException("DNA Sequenz muss mit den TAA,TAG oder TGA-Codon enden");
		}
		//2. Die Länge der Sequenz muss durch drei teilbar sein.
		if (dnaSeq.length() % 3 != 0) {
			throw new IllegalArgumentException("Die Länge der Sequenz muss durch drei teilbar sein");
		}
		//5. Die in Punkt 4 beschriebenen 3-er Blöcke dürfen sonst nirgends in der Sequenz vorkommen.
		return dnaSeq;
	}
	
	public String getDiscoveryPlace() {
		return discoveryPlace;
	}
	
	public LocalDate getDiscoveryDate() {
		return discoveryDate;
	}

	@Override
	public boolean validateProbe(String DnaSeq) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calculateDistance(Probe x) {
		// TODO Auto-generated method stub
		return 0;
	}
		
}
