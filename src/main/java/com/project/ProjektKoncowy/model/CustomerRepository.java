package com.project.ProjektKoncowy.model;

import java.util.List;

import com.project.ProjektKoncowy.model.Entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}