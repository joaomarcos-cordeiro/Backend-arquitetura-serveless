package com.jm.arquitetura_serverless.repositories;

import com.jm.arquitetura_serverless.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
