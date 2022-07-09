package miu.edu.cs45.eregistrarwebapi.service.Imp;

import miu.edu.cs45.eregistrarwebapi.domain.Student;
import miu.edu.cs45.eregistrarwebapi.repository.StudentRepository;
import miu.edu.cs45.eregistrarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getById(Integer studId) {
        return studentRepository.getById(studId);
    }

    @Override
    public Student updateStudent(Student student, Integer studId) {
       Student newStudent= studentRepository.getById(studId);
       newStudent.setStudentNo(student.getStudentNo());
        newStudent.setFname(student.getFname());
        //newStudent.setEnrolment(student.getEnrolment());
        newStudent.setIsInternational(student.getIsInternational());

        return studentRepository.save(newStudent);
    }

    @Override
    public void deleteStudent(Integer studId) {
        studentRepository.deleteById(studId);

    }
}
