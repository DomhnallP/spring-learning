package com.domhnall.springwebapp.repo;

import com.domhnall.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
