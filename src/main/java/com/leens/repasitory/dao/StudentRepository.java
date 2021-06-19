package com.leens.repasitory.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leens.repasitory.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
