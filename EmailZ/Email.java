//Email

package emailapp;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int password defaultPasswordLength = 10;
	private String department;
	private int capacityMailbox = 500;
	private String altEmail;
	private String companySuffix = "yourcompany.com";  //Change this variable accordingly

	//Constructor that receives the first and last name
	public Email(String firstName, String Lastname) {
		this.firstName = firstName;
		this.lastName = lastName;
		//"this" refers to class level variable
		System.out.println("EMAIL CREATED: " + this.firstName + " " this.lastName);

		//Call method asking for department - return the dept.
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		//Call method returning a random password
		this.password = randomPassword(8);
		System.out.println("Your password is: " + this.password);

		//Combine elements to generate email:
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);

	}

	//Ask for department
	private String setDepartment() {
		System.out.println("New worker: " + firstName + "Dept. codes: \n1 for Sales \n2 for Development   \n3 for Accounting \n0 for none \n Enter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales"; }
		else if (depChoice == 2) {return "Development"}
			else if (depChoice == 3) {return "Accounting"}
			else if (depChoice == 0) {return "None"}
			else {return ""};
	}



	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ012345679!@#$%^&*()";
		char[] password = new char[length];
		for (int i = 0; i < length; i++); {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);


	}



	//Set capacity of mailbox
	public void setCapacityMailbox(int capacity);{
		this.capacityMailbox = capacity;
	}


	//Set alt email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}



	//Change password
public void changePassword(String password) {
		this.password = password;

}

public int getCapacityMailbox {return capacityMailbox; }
public String getAltEmail() {return altEmail; }
	public String getPassword() {return password; }
//^^Public methods that access the property, instead of interacting with the properties directly
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "COMPANY EMAIL: " + email + "MAILBOX CAPACITY: " + capacityMailbox + "mb");

	}

}