package com.example.restservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController
{
	private CustomerRepository repository;

	public CustomerController()
	{
		repository = CustomerRepository.Instance;
	}

	@GetMapping("/Customer/{email}")
	public Customer getByEmail(@PathVariable String email) throws  Exception
	{
		return repository.getByEmail(email);
	}

	@GetMapping("/Customers")
	public List<Customer> getAll() throws Exception
	{
		return repository.getAll();
	}

	@PostMapping("/Customer")
	public void create(@RequestBody Customer customer) throws Exception
	{
		repository.create(customer.getName(), customer.getSurname(), customer.getEmail());
	}

	@PutMapping("/Customer")
	public void update(@RequestBody Customer customer) throws Exception
	{
		repository.update(customer.getName(),customer.getSurname(),customer.getEmail());
	}

	@DeleteMapping("/Customer/{email}")
	public void delete(@PathVariable String email) throws Exception
	{
		repository.deleteByEmail(email);
	}
}