package br.com.mchaves.microservices.core.repository;

import br.com.mchaves.microservices.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
