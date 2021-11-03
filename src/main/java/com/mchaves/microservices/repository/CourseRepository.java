package com.mchaves.microservices.repository;

import com.mchaves.microservices.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
