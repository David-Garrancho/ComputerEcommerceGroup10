package za.ac.cput.repository;

/*
    Author: David Henriques Garrancho (221475982)
    Interface for the Customer Repository
    Date: 20 March 2023
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Customer;

import java.util.Set;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}