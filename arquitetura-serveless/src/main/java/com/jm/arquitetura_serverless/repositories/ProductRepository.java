package com.jm.arquitetura_serverless.repositories;

import com.jm.arquitetura_serverless.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends MongoRepository<Product, String> {
}
