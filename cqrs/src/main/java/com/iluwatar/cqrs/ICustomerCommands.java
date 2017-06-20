package com.iluwatar.cqrs;

public interface ICustomerCommands {

  public abstract void updateCustomer(Customer customer);

  public abstract void createcustomer(Customer customer);

  public abstract void deleteCustomer(long id);
}
