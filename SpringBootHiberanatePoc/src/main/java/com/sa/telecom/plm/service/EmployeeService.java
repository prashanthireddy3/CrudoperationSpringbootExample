package com.sa.telecom.plm.service;


import com.sa.telecom.plm.excpetionhandling.exceptions.EmployeeNotFoundExcpetion;
import com.sa.telecom.plm.infrastructure.persistance.repository.EmployeeRepository;
import com.sa.telecom.plm.models.EmployeeDetails;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public String saveDetails(EmployeeDetails employeeDetails) throws Exception {
        try {
            employeeRepository.save(employeeDetails);
            return "employee details saved";
        }
        catch(Exception e){
            throw new Exception(e.getMessage());
        }

    }
    public EmployeeDetails getDetails(int id){
      return employeeRepository.findById(id).orElseThrow(()->new EmployeeNotFoundExcpetion("employee not found"));
    }
    public void updateDetails(EmployeeDetails details) throws Exception {
        try{
        employeeRepository.save(details);
    }
        catch(Exception e){
        throw new Exception(e.getMessage());
    }
    }
    public String deleteDetails(int id) throws Exception {
        try{
        employeeRepository.deleteById(id);
        return "Employee details deleted";
    }
        catch(NullPointerException e){
            throw new EmployeeNotFoundExcpetion(e.getMessage());
        }
        catch(Exception e){
        throw new Exception(e.getMessage());
    }
    }
}

