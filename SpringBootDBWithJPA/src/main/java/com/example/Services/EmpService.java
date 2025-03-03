package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Dao.EmpRepository;
import com.example.dto.Emp;

@Service
public class EmpService {

	@Autowired
    private EmpRepository empRepository;

	public EmpService(EmpRepository empRepository) {
		super();
		this.empRepository = empRepository;
	}

	//get all Emps
    public List<Emp> getAllEmp(){
    	
    	List<Emp> list=(List<Emp>)this.empRepository.findAll();
    	return list;
    }
    
    //get single Emp by id
    public Emp getEmpById(int id) {
    	Emp emp=null;
    	try {
    		emp=this.empRepository.findById(id);	
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	return emp;
    }
    
    //adding new emp
    public Emp addEmp(Emp e) {
    	Emp result=empRepository.save(e);
    	return e;
    }
    
    //delete emp
    public void deleteEmp(int eid) {
    	empRepository.deleteById(eid);
    }
    
    //update emp
    
    public void updateEmp(Emp emp,int empId) {
    	emp.setId(empId);
    	empRepository.save(emp);
    	
    }
}
