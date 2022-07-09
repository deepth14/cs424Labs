package miu.edu.cs45.eregistrarwebapi.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
@NoArgsConstructor
@Data

public class Student {
    @Id
    @GeneratedValue
    private Integer studentId;
    private String studentNo;
    private String fname;
    private String mname;
    private String lname;;
    private double cgpa;
   // private LocalDate enrolment;
    private String isInternational;

    public Student(String studentNo, String fname, String mname, String lname, double cgpa, String isInternational) {
        this.studentNo = studentNo;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.cgpa = cgpa;
        //this.enrolment = enrolment;
        this.isInternational = isInternational;
    }
}
