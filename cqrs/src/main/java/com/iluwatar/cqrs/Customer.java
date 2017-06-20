package com.iluwatar.cqrs;

public class Customer {
  private long id;
  private String name;
  private String username;
  private String city;

  public Customer(long id, String name, String username, String city) {
    super();
    this.id = id;
    this.name = name;
    this.username = username;
    this.city = city;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

}
