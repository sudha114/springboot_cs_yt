package com.example.springBootTutorial.controllers;

import com.example.springBootTutorial.dto.EmoployeeDTO;
import com.example.springBootTutorial.entities.EmployeeEntity;
import com.example.springBootTutorial.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {


    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(path = "/getSecretKey")
    public String getSecretMessage(){
        return "Secret Msg is : asdfghjkkl";
    }

    @GetMapping("/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeId") Long id){
      return employeeRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false, name = "Age") Integer age,
                                                @RequestParam(required = false) String sortBy){
        return employeeRepository.findAll();

    }

    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity inputEmployee){

        return employeeRepository.save(inputEmployee);
    }

    @PutMapping
    public String updateEmployeeID(){
        return "Hello from PUT";
    }
}
