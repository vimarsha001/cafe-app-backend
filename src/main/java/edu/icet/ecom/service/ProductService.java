package edu.icet.ecom.service;

import edu.icet.ecom.dto.Customer;

import java.util.List;

public interface ItemService {
    List<Item> getAll();
    void createCustomer(Customer customer);
    void deleteCustomerById(String id);
    void updateCustomer(Customer customer);
    void searchCustomerById(String id);
    void searchCustomerByName(String name);
}
