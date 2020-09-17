package xuandanh.spring.service;

import java.util.List;
import java.util.Optional;

import xuandanh.spring.entity.Student;

public interface StudentService {
	List<Student>  findAll();
	Optional<Student> findById(long id);
}
