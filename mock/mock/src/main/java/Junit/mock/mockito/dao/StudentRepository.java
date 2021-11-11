package Junit.mock.mockito.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Junit.mock.model.StudentModel;

@Repository
public interface StudentRepository extends MongoRepository<StudentModel, Integer> {

}
