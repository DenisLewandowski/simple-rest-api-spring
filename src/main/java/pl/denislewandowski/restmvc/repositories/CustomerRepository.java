package pl.denislewandowski.restmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.denislewandowski.restmvc.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
