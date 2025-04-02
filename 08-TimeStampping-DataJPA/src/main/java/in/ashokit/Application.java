package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Product;
import in.ashokit.entity.Student;
import in.ashokit.repository.ProductRepository;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
//		StudentRepository studentRepo=context.getBean(StudentRepository.class);	
//		Student s=new Student(1,"Raja",111,"Male");
//		studentRepo.save(s);
//		System.out.println("Record Saved....");
		
		
		ProductRepository productRepo = context.getBean(ProductRepository.class);
		
		Product p=new Product();
		p.setProductName("KeyBoard");
		p.setProductPrice(200.20);
		productRepo.save(p);
		System.out.println("Product inserted...");
	}

}
