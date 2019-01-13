package pl.denislewandowski.restmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.denislewandowski.restmvc.domain.Customer;
import pl.denislewandowski.restmvc.repositories.CustomerRepository;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public DatabaseInitializer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Database initializing...");

        Customer c1 = new Customer();
        c1.setName("John");
        c1.setLastname("Doe");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setName("Ben");
        c2.setLastname("Black");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setName("George");
        c3.setLastname("Hilton");
        customerRepository.save(c3);

        System.out.println("Database initialized!");
    }
}
