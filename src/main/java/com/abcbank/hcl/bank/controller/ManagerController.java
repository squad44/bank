package com.abcbank.hcl.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.service.CustomerServiceImpl.CustomerServiceImpl;
import com.abcbank.hcl.bank.service.ManagerService;

public class ManagerController {

	
			@Autowired
			CustomerServiceImpl customerService;
			
			
			@Autowired
			ManagerService managerService;
			
	//creatating a coustmer
	//charan
		public String registerCoustmer(CustomerRegistrationRequest cusotmerRegistrationRequest) {
				
					//validation goes here
					// user exist throw error from service layer 
			
				String customerName = CustomerRegistrationRequest.getCustomerName();
				
				
				 if(customerExist(customerName)) {
					 return "Customer already exist";
				 }else
					{
					 
					managerService.registratingCoustmer(coustmerRegistrationRequest)) {
						
						//return ResponseEntity<T>("User Created Sucessfully",Https.ok);
							return "user created sucessfully";
					}
			
					//end of method register Customer
		}
		
		
		



		//creating method to seach by account name
		//charan
		public Customer searchCustomerByAccountName(String customerName) {
			
					return managerService.getcustomerByName(customerName);
			//end of method searchCustomerByAccountName
		}
		
		
		

		//creating method to seach by account name
		//charan
		public Customer searchCustomerByAccountNumber(Long accountNumber) {
			
				return managerService.getCustomerByAccountNumber(accountNumber);
			//end of method SerachCustomerByAccountNumner
		}
		
}
