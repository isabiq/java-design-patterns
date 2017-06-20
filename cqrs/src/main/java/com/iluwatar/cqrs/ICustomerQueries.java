package com.iluwatar.cqrs;

import java.util.List;

public interface ICustomerQueries {

  public abstract Customer getCustomerByUsername(String username);

  public abstract List<Customer> getAllCustomers();

  public abstract List<Customer> getCustomerByCity(String city);

}
