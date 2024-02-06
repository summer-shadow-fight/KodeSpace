package com.kodespace.kodejagah.repository;

import com.kodespace.kodejagah.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
}