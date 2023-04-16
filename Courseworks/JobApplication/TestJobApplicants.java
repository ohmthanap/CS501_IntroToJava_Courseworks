/* Thanapoom Phatthanaphan
 * This is a main class for this project, setting fields of each new object and containing method to link other class for print out.
 */

public class TestJobApplicants {

	public static void main(String[] args) {
		JobApplicant p1 = new JobApplicant("Kevin", "201-123-4567", true, false, true, true);
		JobApplicant p2 = new JobApplicant("Tony", "201-456-7890", false, true, false, true);
		JobApplicant p3 = new JobApplicant("Rose", "201-987-6543", true, true, true, false);
		p1.printApplicantDetails();
		p2.printApplicantDetails();
		p3.printApplicantDetails();
	}
}
