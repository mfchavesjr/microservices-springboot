package br.com.mchaves.microservices.endpoint.controller;

import br.com.mchaves.microservices.core.model.Course;
import br.com.mchaves.microservices.endpoint.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("v1/admin/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Course>> list(Pageable pageable){
        return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
    }
}
