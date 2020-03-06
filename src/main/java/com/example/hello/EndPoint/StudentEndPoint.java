package com.example.hello.EndPoint;


import com.example.hello.Model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;


@RestController
@ResponseBody
@RequestMapping("student")
public class StudentEndPoint {

    @RequestMapping(method = RequestMethod.GET,path = "/list")
    public List<Student> ListAll(){
        return asList(new Student("Deku"), new Student("Todoroki"));
    }
}
