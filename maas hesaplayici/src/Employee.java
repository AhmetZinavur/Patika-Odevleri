import java.time.*;

public class Employee {
	String name;
	double grossSalary;
	int workHours;
	int hireYear;

	double tax(double grossSalary) {

		if (grossSalary >= 1000) {
			double salaryTax = grossSalary * 0.03;
			return salaryTax;
		} else {
			return 0;
		}
	}

	double bonus(int workHours) {
		double addToSalary = 0;
		if (workHours > 40) {
			for (int i = 40; i < workHours; i++) {
				addToSalary += 30;
			}
			return addToSalary;
		} else {
			return 0;
		}
	}

	double raiseSalary(int hireYear) {

		int year = LocalDate.now().getYear();
		if (year - hireYear < 10) {
			double salaryIncrease = grossSalary * 0.05;
			return salaryIncrease;
		} else if (year - hireYear >= 10 && year - hireYear < 20) {
			double salaryIncrease = grossSalary * 0.10;
			return salaryIncrease;
		} else {
			double salaryIncrease = grossSalary * 0.15;
			return salaryIncrease;
		}

	}
	
	double calculateNetSalary() {
		return this.grossSalary + tax(grossSalary) + bonus(workHours) + raiseSalary(hireYear);
	}

	Employee(String name, double grossSalary, int workHours, int hireYear) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		tax(grossSalary);
		bonus(workHours);
		raiseSalary(hireYear);
	}

	@Override
	public String toString() {
		return "Employee [İsim = " + name + ", Brüt Maaş = " + grossSalary + ", Çalışma Saati = " + workHours + ", Şirkete Giriş Tarihi = "
				+ hireYear + ", Vergi= " + tax(grossSalary) + ", Ek Kazanç = " + bonus(workHours) + ", Maaş Artışı = "
				+ raiseSalary(hireYear) + ", Net Maaş = " + calculateNetSalary() + "]";
	}

}