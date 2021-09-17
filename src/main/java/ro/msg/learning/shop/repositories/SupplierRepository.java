package ro.msg.learning.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.msg.learning.shop.entities.SupplierEntity;

public interface SupplierRepository extends JpaRepository<SupplierEntity, Integer> {
}
