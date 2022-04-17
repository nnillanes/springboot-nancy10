package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    public static CustomerRepository Instance = new CustomerRepository();

    private List<Customer> customers = new ArrayList<Customer>();

    CustomerRepository()
    {
        customers.add(new Customer("Nancy","Illanes","nillanes@gmail.com"));
        customers.add(new Customer("Maria","Magnadalena","mmagdalena@gmail.com"));
    }

    public void create(String name, String surname, String email) throws Exception
    {
        if (getByEmail(email) != null)
            throw new Exception();

        customers.add(new Customer(name, surname, email));
    }

    public void update(String name, String surname, String email) throws Exception
    {
        Customer customer = getByEmail(email);
        if (customer == null)
            throw new Exception();

        customer.setName(name);
        customer.setSurname(surname);
    }

    public void deleteByEmail(String email) throws Exception
    {
        Customer customer = getByEmail(email);
        if (customer == null)
            throw new Exception();

        customers.remove(customer);
    }

    public Customer getByEmail(String email) {
        for(Customer c:customers)
        {
            if (c.getEmail().equalsIgnoreCase(email))
                return c;
        }
        return null;
    }

    public List<Customer> getAll()
    {
        return customers;
    }
}