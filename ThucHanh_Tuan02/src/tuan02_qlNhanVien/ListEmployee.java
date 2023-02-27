package tuan02_qlNhanVien;

import java.util.ArrayList;

public class ListEmployee {
	private ArrayList<Employee> ds;

	public ListEmployee() {
		this.ds = new ArrayList<Employee>();
	}

	private boolean isExists(String id) {
		int vitri = ds.indexOf(new Employee(id));
		if(vitri < 0)
			return false;
		else
			return true;
	}

	public boolean addEmployee(Employee nv) {
		if(isExists(nv.getid())) {
			return false;
		}else {
			ds.add(nv);
			return true;
		}
	}

	public boolean removeEmployee(Employee nv) {
		if(isExists(nv.getid())) {
			ds.remove(nv);
			return true;
		}else
			return false;
	}

	public int search(String id) {
		int virtri = ds.indexOf(new Employee(id));
		if(virtri < 0)
			return -1;
		return virtri;
	}
	
	public boolean update(String id, String firstName, String lastName, String gender, double salary, int age) {
		Employee newEmpl;
		if(search(id) >= 0) {
			return false;
		}else {
			newEmpl = ds.get(search(id));
			newEmpl.setfirstName(firstName);
			newEmpl.setlastName(lastName);
			newEmpl.setgender(gender);
			newEmpl.setsalary(salary);
			newEmpl.setage(age);
			return true;
		}
		
	}
}
