package com.hospital.rab3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hospital.rab3.pojos.CustomerService;
import com.hospital.rab3.pojos.Hospital;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("customer-context.xml");
		Hospital hos = (Hospital) ctx.getBean("hos1");
		System.out.println(hos.toString());

		for (CustomerService cs : hos.getCustomernames()) {
			System.out.println("Patient Name: " + cs.getName() + "\nPatient Address: " + cs.getAddress()
					+ "\nPatient telno: " + cs.getPhoneNo() + "\nPatient SSn: " + cs.getSSN()
					+ "\nPatient Diseases Type: " + cs.getDiseasesType());
			System.out.println();
		}

	}

}
