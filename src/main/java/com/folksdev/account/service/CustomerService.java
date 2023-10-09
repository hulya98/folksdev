package com.folksdev.account.service;

import com.folksdev.account.dto.CustomerDto;
import com.folksdev.account.exception.CustomerNotFoundException;
import com.folksdev.account.model.Customer;
import com.folksdev.account.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id) {
        CustomerDto customerDto = new CustomerDto("","","", new HashSet<>());
        CustomerDto customerDto1 = new CustomerDto("salam", customerDto.getName(), customerDto.getSurname(), customerDto.getAccounts());
        return customerRepository.findById(id).
                orElseThrow(() -> new CustomerNotFoundException("Customer could not find by id: " + id));
    }
}
