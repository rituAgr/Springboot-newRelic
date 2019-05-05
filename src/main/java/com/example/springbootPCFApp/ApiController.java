package com.example.springbootPCFApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/prof/{id}")
    public String getProf(@PathVariable String id){
        apiService.add();
        return "Get APi received Successfully for Professor "+id;
    }

    @PostMapping("/prof")
    public String saveProf(@RequestBody String professorName){
        return  "Post APi received Successfully" +professorName;
    }
}
