package com.kalanaGunaweera.ecommerce.dao;

import com.kalanaGunaweera.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@EnableJpaRepositories
@CrossOrigin("http://localhost:4200")

public interface ProductRepository  extends JpaRepository<Product,Long> {
}
