package pl.denislewandowski.restmvc.services;

import pl.denislewandowski.restmvc.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer updateCustomer(Long id, Customer customer);
}
