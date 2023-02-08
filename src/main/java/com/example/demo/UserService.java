package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	@Autowired
	UserRepository<User> userRepository;

	@Transactional
	public List<User> getAll() {
		return (List<User>) userRepository.findAll();
	}

	@Transactional
	public List<User> findByName(String name) {
		return userRepository.findByName(name);
	}

	@Transactional
	public Optional<User> getById(Long id) {
		return userRepository.findById(id);
	}

	@Transactional
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

	@Transactional
	public boolean addUser(User user) {
		return userRepository.save(user) != null;
	}

	@Transactional
	public boolean updateUser(User user) {
		return userRepository.save(user) != null;
	}
}
