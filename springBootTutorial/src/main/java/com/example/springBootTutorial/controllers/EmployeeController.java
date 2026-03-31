package com.example.springBootTutorial.controllers;

import com.example.springBootTutorial.dto.EmoployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretKey")
//    public String getSecretMessage(){
//        return "Secret Msg is : asdfghjkkl";
//    }

    @GetMapping("/{employeeId}")
    public EmoployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id){
      return new EmoployeeDTO(id,"sudha","sudha.com",25, LocalDate.of(2026,03,31),true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false, name = "Age") Integer age,
                                  @RequestParam(required = false) String sortBy){
        return "Hi age is : "+age+" "+sortBy;

    }

    @PostMapping
    public EmoployeeDTO createEmployee(@RequestBody EmoployeeDTO inputEmployee){
        inputEmployee.setId(100L);
        return inputEmployee;
    }

    @PutMapping
    public String updateEmployeeID(){
        return "Hello from PUT";
    }
}
