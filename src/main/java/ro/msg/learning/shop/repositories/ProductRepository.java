package ro.msg.learning.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.msg.learning.shop.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
