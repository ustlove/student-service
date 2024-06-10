package com.crazy.microservicescli.openfeignApi;

import com.crazy.microservicescli.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName StudentFeignClient
 * @Description TODO
 * @Author ASUS
 * @Date 2024/6/6 20:44
 * @Version 1.0
 */
@FeignClient(name = "student-service")
public interface StudentFeignClient {

    @GetMapping("/students/{id}")
    Student getStudentById(@PathVariable("id") Long id);
}
