package objects;

public class Candidate {
	
	String name;
	long mobileNumber;
	boolean gender;
	
	public static void study() {
		System.out.println("Studying");
	}
	
//	public Candidate() {
//		super();
//	} //by default	

	public Candidate(String name, long mobileNumber, boolean gender) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}

	
}
