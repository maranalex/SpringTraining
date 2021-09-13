package ro.msg.learning.shop.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shop.entities.ProductCategoryEntity;

public interface ProductCategoryRepository extends CrudRepository<ProductCategoryEntity, Integer> {
}
