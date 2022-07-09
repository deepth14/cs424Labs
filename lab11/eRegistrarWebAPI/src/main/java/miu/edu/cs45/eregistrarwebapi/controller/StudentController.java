package miu.edu.cs45.eregistrarwebapi.controller;


import miu.edu.cs45.eregistrarwebapi.domain.Student;
import miu.edu.cs45.eregistrarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping(value = "/eregistrar/api/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping(value = "/list")
    public List<Student> students(){
        return studentService.getAllStudents();
    }
    @PostMapping (value = "/register")
    public Student addStudent(@Valid @RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping(value = "get/{studentId}")
    public Student getById(@PathVariable  Integer studentId){
        return studentService.getById(studentId);
    }
    @PutMapping(value = "/update/{studentId}")
    public Student updateStudent(Student student,Integer studentId){
        return studentService.updateStudent(student,studentId);
    }
    @DeleteMapping(value = "/delete/{studentId}")
public void deletestudent(Integer studentId){
         studentService.deleteStudent(studentId);
}




}
