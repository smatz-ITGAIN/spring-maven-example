package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UserRepository<U> extends CrudRepository<User, Long> {
	List<User> findByName(String name);
}
