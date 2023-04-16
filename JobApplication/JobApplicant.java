/* Thanapoom Phatthanaphan
 * This is a class that contains a constructor of the program to get every fields of each object and also provides a method to print out all fields of each object.
 */

class JobApplicant {

	private String name;
	private String phoneNumber;
	private Boolean wordProcessingSkill;
	private Boolean spreadsheetsSkill;
	private Boolean databasesSkill;
	private Boolean graphicsSkill;
	
	JobApplicant(String name, String phoneNumber, Boolean wordProcessingSkill, Boolean spreadsheetsSkill, Boolean databasesSkill, Boolean graphicsSkill) {
		getName(name);
		getPhoneNumber(phoneNumber);
		getWordProcessingSkill(wordProcessingSkill);
		getSpreadsheetsSkill(spreadsheetsSkill);
		getDatabasesSkill(databasesSkill);
		getGraphicsSkill(graphicsSkill);
		
	}
	public String getName(String name) {
		this.name = name;
		return name;
	}
	public String getPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return phoneNumber;
	}
	public Boolean getWordProcessingSkill(Boolean wordProcessing) {
		this.wordProcessingSkill = wordProcessing;
		return wordProcessing;
	}
	public Boolean getSpreadsheetsSkill(Boolean spreadsheets) {
		this.spreadsheetsSkill = spreadsheets;
		return spreadsheets;
	}
	public Boolean getDatabasesSkill (Boolean databases) {
		this.databasesSkill = databases;
		return databases;
	}
	public Boolean getGraphicsSkill(Boolean graphics) {
		this.graphicsSkill = graphics;
		return graphics;
	}
	public void printApplicantDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Phone Number: " + this.phoneNumber);
		System.out.println("Word Processing Skill: " + this.wordProcessingSkill);
		System.out.println("Spreadsheets Skill: " + this.spreadsheetsSkill);
		System.out.println("Databases Skill: " + this.databasesSkill);
		System.out.println("Graphics Skill: " + this.graphicsSkill);
		int i = 0;
		if (this.wordProcessingSkill == true) {
			i += 1;
		}
		if (this.spreadsheetsSkill == true) {
			i += 1;
		}
		if (this.databasesSkill == true) {
			i += 1;
		}
		if (this.graphicsSkill == true) {
			i += 1;
		}
		if (i >= 3) {
			System.out.println(this.name + " is qualified for an interview");
		} else {
			System.out.println(this.name + " is not qualified for an interview");
		}
		System.out.println();
	}
}

