package com.example.springbootPCFApp;


import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {


    @GetMapping("/prof/{id}")
    public String getProf(@PathVariable String id){
        return "Get APi received Successfully for "+id;
    }

    @PostMapping("/prof")
    public String saveProf(@RequestBody String professor){
       return  "Post APi received Successfully" +professor;
    }
}
