package in.mindcraft.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.mindcraft.entity.Emp;
import in.mindcraft.service.EmpService;

@RestController
public class EmpController {

//	@GetMapping("/emp")
//	public String getEmp() {
//		return "Emp details";
//	}
	
	
//	@GetMapping("/getemp")
//	public Emp getEmp() {
//		Emp emp=new Emp();
//		emp.setId(1234);
//		emp.setEmpName("Amisha");
//		emp.setDeptName("IT");
//		return emp;
//	}
	@Autowired
	private EmpService empService;
	
	
	@GetMapping("/emp")
	public ResponseEntity<List<Emp>> getEmp(){
		//return this.empService.getAllEmp();
		
		List<Emp> list=empService.getAllEmp();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<Emp> getEmp(@PathVariable("id") int id) {
		//return empService.getEmpById(id);
		Emp emp=empService.getEmpById(id);
		if(emp==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(emp));
	}
	
	
	@PostMapping("/emp")
	public Emp addEmp(@RequestBody Emp emp) {
		this.empService.addEmp(emp);
		return emp;

	}

	@DeleteMapping("/emp/{empId}")
	public void deleteEmp(@PathVariable("empId") int empId) {
		this.empService.deleteEmp(empId);
	}
	
	@PutMapping("/emp/{empId}")
	public Emp upddateEmp(@RequestBody Emp emp,@PathVariable("empId") int empid) {
		this.empService.updateEmp(emp, empid);
		return emp;
	}

}
