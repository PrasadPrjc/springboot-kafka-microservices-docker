package pl.shuchi.payment.repository;

import org.springframework.data.repository.CrudRepository;
import pl.shuchi.payment.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
