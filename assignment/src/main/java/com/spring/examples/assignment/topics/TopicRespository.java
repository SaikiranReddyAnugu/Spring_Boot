package com.spring.examples.assignment.topics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
@Repository
public interface TopicRespository extends JpaRepository<Topic,String> {
}
