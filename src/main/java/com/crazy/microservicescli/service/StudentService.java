package com.crazy.microservicescli.service;

import com.crazy.microservicescli.entity.Student;
import com.crazy.microservicescli.openfeignApi.StudentFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author ASUS
 * @Date 2024/6/6 20:45
 * @Version 1.0
 */
@AllArgsConstructor
@Service
public class StudentService {

private StudentFeignClient studentFeignClient;

public Student getStudentById(Long id){
    Deque<Integer> dq = new LinkedList<>();

    return studentFeignClient.getStudentById(id);
}

}
