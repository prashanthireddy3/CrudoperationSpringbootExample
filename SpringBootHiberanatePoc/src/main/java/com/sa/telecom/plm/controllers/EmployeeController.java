package com.sa.telecom.plm.controllers;


import com.sa.telecom.plm.models.EmployeeDetails;
import com.sa.telecom.plm.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/save")
    public String saveEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) throws Exception {
       return employeeService.saveDetails(employeeDetails);
    }
    @GetMapping("/getDetails/{id}")
    public EmployeeDetails getEmployeeDetails(@PathVariable int id){
      return  employeeService.getDetails(id);
    }
    @PostMapping("/update")
    public void updateEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) throws Exception {
         employeeService.updateDetails(employeeDetails);
    }
    @DeleteMapping("/delete")
    public void deleteEmployeeDetails(@PathVariable int id) throws Exception {
        employeeService.deleteDetails(id);
    }
}
