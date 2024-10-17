package lk.ijse.service;

import lk.ijse.customObj.CustomerResponse;
import lk.ijse.dto.impl.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String customerId);
    CustomerResponse getSelectedCustomer(String customerId);
    List<CustomerDTO> getAllCustomers();
}
