package com.example.EmployeeDemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class EmpController {

    HashMap<Integer, Employee> data = new HashMap<>();

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody() Employee employee){
        data.put(employee.getId(), employee);
    }

    @DeleteMapping("/deleteEmployee")
    public void deleteEmployee(@RequestParam("id") int id){
        data.remove(id);
    }

    @GetMapping("/getAllEmployees")
    public ArrayList<Employee> getAllEmployees(){
        ArrayList<Employee> emp = new ArrayList<>();
        for(Employee e : data.values()){
            emp.add(e);
        }
        return emp;
    }
}
