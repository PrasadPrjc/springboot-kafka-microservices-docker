package pl.shuchi.stock.repository;

import org.springframework.data.repository.CrudRepository;
import pl.shuchi.stock.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
