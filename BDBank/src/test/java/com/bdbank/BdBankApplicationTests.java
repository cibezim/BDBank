package com.bdbank;

import com.bdbank.entities.Account;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BdBankApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(BdBankApplication.class, args);

		Account account = new Account("John Doe", "password", "1234567890");
		System.out.println(account.getName());
	}

	@Test
	void contextLoads() {
	}

}
