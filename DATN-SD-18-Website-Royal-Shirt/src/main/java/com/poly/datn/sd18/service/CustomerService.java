package com.poly.datn.sd18.service;

import com.poly.datn.sd18.entity.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

     List<Customer> searchEmployees(String searchText) ;
//     Customer getCustomerByAccount(Integer accountId);

}
