package Junit.mock.mockito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Junit.mock.mockito.service.StudentService;
import Junit.mock.model.StudentModel;


@RestController
public class StudentController {

	@Autowired
	StudentService stuService;

	@PostMapping("/insertStudentDtls")
	public StudentModel insertStudentDtls(@RequestBody StudentModel stu) {

		StudentModel stuDtls=stuService.saveStudentDetails(stu);
		if(null!=stuDtls)
			return stuDtls;
		else
			return null;
	}

}
