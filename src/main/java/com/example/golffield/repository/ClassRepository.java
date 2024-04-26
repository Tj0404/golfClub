package com.example.golffield.repository;

import com.example.golffield.entity.ClassE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<ClassE,Long> {
}
