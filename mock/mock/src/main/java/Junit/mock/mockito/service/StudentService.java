package Junit.mock.mockito.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Junit.mock.mockito.dao.StudentRepository;
import Junit.mock.model.StudentModel;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	// save student details in databse
	public StudentModel saveStudentDetails(StudentModel stu) {
		
		stu.setFees(stu.getFees().add(new BigDecimal(10)));
		stu.setId("BTBTH"+stu.getId());
		stu.setCourse(stu.getCourse()+ "-101");
		studentRepository.save(stu);		
		return stu;
	}

}
