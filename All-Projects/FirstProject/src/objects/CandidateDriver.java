package objects;

public class CandidateDriver {

	public static void main(String[] args) {
		Candidate c1 = new Candidate("some name", 1234567890L, true);
//		Candidate c1 = new Candidate();
//		System.out.println(c1.name);
//		System.out.println(c1.mobileNumber);
//		System.out.println(c1.gender);
//		c1.name = "some name";
//		c1.mobileNumber = 1234567890L;
//		c1.gender = true;
		System.out.println(c1.name);
		System.out.println(c1.mobileNumber);
		System.out.println(c1.gender);
	}

}
