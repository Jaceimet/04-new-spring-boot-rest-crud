package com.luv2code.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    // add code for the /hello endpoint

    @GetMapping("/hello")
    public String sayHello(){

        return "Hello World!";

    }

//    @RestController
//    @RequestMapping("/api")
//    public class StudentRestController{
//
//        // define endpoint for "/students" - return list of students
//
//        @GetMapping("/students")
//        public List<Student> getStudents(){
//
//            List<Student> theStudents = new ArrayList<>();
//
//            theStudents.add(new Student("Poornima", "Patel"));
//
//            return theStudents;
//
//        }
//
//
//
//
//    }


}
