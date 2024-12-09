package compare;

public class Emp implements Comparable<Emp> {

	private String name;
	private Integer phone;
	private Integer empId;
	
	
//	comparable
	@Override
	public int compareTo(Emp o) {
		return this.name.compareTo(o.name);
	}
	
	public Emp(String name,int phone,int empId) {		
		this.name = name;
		this.phone=phone;
		this.empId=empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		return "Emp{" +
				"name='" + name + '\'' + ", phone ='" +phone + '\'' + ", empId=" + empId + '}';
	}

	
	
}
