package com.crazy.microservicescli.dao;

import com.crazy.microservicescli.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName StudentRepository
 * @Description TODO
 * @Author ASUS
 * @Date 2024/6/6 17:59
 * @Version 1.0
 */

public interface StudentRepository extends JpaRepository<Student,Long> {
}
