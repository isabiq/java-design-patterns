package com.isabiq.crud;

import java.util.List;

public interface IDao {

  public abstract void updateCustomer(Customer customer);

  public abstract void createCustomer(Customer customer);

  public abstract void deleteCustomer(Customer Customer);

  public abstract Customer getCustomerByUsername(String username);

  public abstract List<Customer> getAllCustomers();
  
  public abstract void updateProduct(Product product);

  public abstract void createProduct(Product product);

  public abstract void deleteProduct(Product product);
  
  public abstract List<Product> getAllProducts();

}
