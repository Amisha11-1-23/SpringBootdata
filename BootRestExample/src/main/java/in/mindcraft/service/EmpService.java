package in.mindcraft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import in.mindcraft.entity.Emp;

@Component
public class EmpService {
	
	public static List<Emp> list=new ArrayList<>();
	
	static {
		list.add(new Emp(10, "vayu", "Research"));
		list.add(new Emp(20, "rohan", "IT"));
	}

	//get all emp service
	public List<Emp> getAllEmp(){
		return list;
	}
	
	//get emp by id
	public Emp getEmpById(int id) {
		
		Emp emp=null;
		emp=list.stream().filter(e->e.getId()==id).findFirst().get();
		return emp;
	}
	
	//add new emp
	public void addEmp(Emp e) {
		list.add(e);
	}
	
	
	//delete emp
	public void deleteEmp(int eid) {
		list=list.stream().filter(emp->emp.getId()!=eid).collect(Collectors.toList());
	}
	
	//update emp
	public void updateEmp(Emp emp,int eId) {
		list=list.stream().map(e->{
			if(e.getId()==eId) {
				e.setEmpName(emp.getEmpName());
				e.setDeptName(emp.getDeptName());
			}
			return e;
		}).collect(Collectors.toList());
	}
	
	
}
