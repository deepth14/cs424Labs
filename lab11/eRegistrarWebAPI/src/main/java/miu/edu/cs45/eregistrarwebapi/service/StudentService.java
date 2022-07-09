package miu.edu.cs45.eregistrarwebapi.service;

import miu.edu.cs45.eregistrarwebapi.domain.Student;

import java.util.List;

public interface StudentService {
public List<Student> getAllStudents();
public Student addStudent(Student student);
public Student getById(Integer studId);
public Student updateStudent(Student student,Integer studId);
public void deleteStudent(Integer studId);

}
