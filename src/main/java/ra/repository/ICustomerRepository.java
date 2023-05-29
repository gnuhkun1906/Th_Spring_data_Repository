package ra.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import ra.model.Customer;
import ra.model.Province;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    //        Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
