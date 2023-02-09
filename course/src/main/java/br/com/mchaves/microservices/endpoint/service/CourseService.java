package br.com.mchaves.microservices.endpoint.service;

import br.com.mchaves.microservices.core.model.Course;
import br.com.mchaves.microservices.core.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Iterable<Course> list(Pageable pageable){
        log.info("Listing all courses");
        return courseRepository.findAll(pageable);
    }
}
