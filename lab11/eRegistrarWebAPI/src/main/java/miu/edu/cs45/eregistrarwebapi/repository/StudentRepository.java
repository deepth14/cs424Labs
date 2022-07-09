package miu.edu.cs45.eregistrarwebapi.repository;

import miu.edu.cs45.eregistrarwebapi.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
