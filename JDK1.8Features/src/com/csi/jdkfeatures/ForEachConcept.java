package com.csi.jdkfeatures;

import java.util.ArrayList;
import java.util.List;

class Emp {
	private int empId;

	private String empName;

	private double empSalary;

	public Emp(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}

public class ForEachConcept {
	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(121, "BINU", 3454546.78));
		empList.add(new Emp(122, "SWARA", 34655676.78));
		empList.add(new Emp(124, "VENKATA", 65757.78));
		empList.add(new Emp(128, "RISHI", 766767.78));
		empList.add(new Emp(129, "MANI", 6768788.78));

		// System.out.println(empList);
		// empList.forEach(emp->System.out.println(emp));
		// empList.forEach(System.out::println);
		for (Emp e : empList) {
			if (e.getEmpName().equalsIgnoreCase("swarA")) {
				System.out.println(e);
			}
		}

	}
}
