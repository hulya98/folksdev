package com.folksdev.account.dto;

import com.folksdev.account.model.Customer;

public class CustomerDtoConverter {
    public AccountCustomerDto convertToAccountCustomer(Customer from){
        if(from == null){
            return new AccountCustomerDto("","","");
        }
        return new AccountCustomerDto(from.getId(),
                                      from.getName(),
                                      from.getSurname());
    }
}
