public class Employee{
	private int experience;
	private int salary;

	public int getExperience(){
		return experience;
	}
	public void setExperience(int experience){
		this.experience = experience;
	}
	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}

	public void printInfo(){
		System.out.printf("Experience = %d, Salary = %d\n", experience, salary);
	}
}