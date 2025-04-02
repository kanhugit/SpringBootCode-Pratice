package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AccountRepository accountRepo = context.getBean(AccountRepository.class);

		
		/*  AccountPK pk=new AccountPK(); pk.setAccId(2); pk.setAccType("Current");
		  pk.setAccNum(32458908l);
		  
		  Account acc=new Account(); acc.setHolderName("Raju");
		  acc.setBranch("Ammerpet"); acc.setAccountPK(pk);
		  
		  accountRepo.save(acc); */
		  
		AccountPK pk=new AccountPK();
		pk.setAccId(2);
		pk.setAccType("Current");
		pk.setAccNum(32458908l);
		
		Optional<Account> findbyId = accountRepo.findById(pk);
		 System.out.println(findbyId.get());
		 
	}

}
