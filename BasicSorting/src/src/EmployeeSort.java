package src;

public class EmployeeSort {
	
	public static void sortEmployees(Employee[] list) {
		for(int i = 0; i<list.length; i++) {
			Employee current = list[i];
			int j = i - 1;
			while(j >= 0 && list[j].getEmployeeNumber() > current.getEmployeeNumber()) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = current;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee a = new Employee(94759, "Paco", "Robles", "email@t.com");
		Employee b = new Employee(1, "Paco", "Robles", "email@t.com");
		Employee c = new Employee(84894048, "Paco", "Robles", "email@t.com");
		Employee d = new Employee(94760, "Paco", "Robles", "email@t.com");
		Employee e = new Employee(110, "Paco", "Robles", "email@t.com");
		Employee f = new Employee(947909, "Paco", "Robles", "email@t.com");
		
		Employee[] employesList = {a, b, c, d, e, f};
		sortEmployees(employesList);
		for(int i = 0; i < employesList.length; i++) {
			System.out.print(employesList[i].getEmployeeNumber() + " ");
		}
	}

}
