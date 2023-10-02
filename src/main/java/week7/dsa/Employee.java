package week7.dsa;

public class Employee {

	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] employees = new Employee[3];
		employees[0] = new Employee("Arun", 32);
		employees[1] = new Employee("Bharu", 28);
		employees[2] = new Employee("Rithvin", 02);

		for (Employee employee : employees) {

			// System.out.println(employee.getName() );
			System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge());

		}

	}

}
