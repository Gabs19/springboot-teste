package com.example.hello.EndPoint;


import com.example.hello.Erro.CustomErrorType;
import com.example.hello.Model.Student;
import com.example.hello.Util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;


@RestController
@ResponseBody
@RequestMapping("student")
public class StudentEndPoint {

    @Autowired
    private DateUtil dateUtil;

    @GetMapping
    public ResponseEntity<?> ListAll(){
        System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") int id){

        Student  student = new Student();
        student.setId(id);
        int index = Student.studentList.indexOf(student);

        if(index == -1){
            return new ResponseEntity<>(new CustomErrorType("Student not found"),HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(Student.studentList.get(index),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student){
        Student.studentList.add(student);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Student student){
        Student.studentList.remove(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Student student){
        Student.studentList.remove(student);
        Student.studentList.add(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
