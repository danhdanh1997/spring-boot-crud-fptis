package xuandanh.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import xuandanh.spring.entity.Student;
import xuandanh.spring.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentrepository;
	@Override
	public List<Student> findAll() {
		return (List<Student>) studentrepository.findAll();
	}
	@Override
	public Optional<Student> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
