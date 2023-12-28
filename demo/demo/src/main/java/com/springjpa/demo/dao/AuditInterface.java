package com.springjpa.demo.dao;

import com.springjpa.demo.model.Employee;
import org.springframework.data.repository.history.RevisionRepository;

public interface AuditInterface extends RevisionRepository<Employee,Integer,Integer> {

}
