package com.six.service;


import com.six.entity.Customer;
import com.six.entity.CustomerShare;
import java.util.List;

/**
 *
 * @author kharileigh
 * <----- LIST OF CUSTOMER DETAILS USING CUSTOMER ID
 */


public interface CustomerDetailService {
   
    
    // INPUT : customerId
    // OUTPUT : customerId, shareName, quantity, unitPrice, totalValuation, shareType
    public List<CustomerShare> getCustomerShareByCustomerId(int customerId);
}
