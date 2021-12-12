package src;

public class Employee {
	private int employeeNumber;
	private String firstName;
	private String lastName;
	private String emailId;
	
	public Employee(int eNumber, String firstName, String lastName, String email) {
		this.setEmployeeNumber(eNumber);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmailId(email);
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
