package com.bnta.capstone_backend.services;
import com.bnta.capstone_backend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    // customer service

    @Autowired
    CustomerRepository customerRepository;

}
