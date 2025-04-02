package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.Repository;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);
//		System.out.println(studentRepository.getClass().getName());

//		Student s=new Student();
//		s.setId(103);
//		s.setName("Rajakumar");
//		s.setRank(22000);
//		s.setGender("male");
//		studentRepository.save(s);
//       System.out.println("Record inserted..");

//		Optional<Student> optional=studentRepository.findById(104);	
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//		}else {
//			System.out.println("Record is not present");
//		}
//		System.out.println("Record fetched..");

//		Iterable<Student> findAll=studentRepository.findAll();
//		findAll.forEach(System.out::println);
//		findAll.forEach(s->System.out.println(s));
//	System.out.println("All Record fetched sucessfully");	

//	studentRepository.deleteById(104);
//	System.out.println("Record Deleted ...");

//		if(studentRepository.existsById(105)) {
//			studentRepository.deleteById(105);
//			System.out.println("Record deleted");
//		}else {
//			System.out.println("Record is not present");
//		}

//		long count=studentRepository.count();
//		System.out.println("Records Counted ::"+count);

//		Student s1=new Student(104,"Balia",100l,"Male");
//		Student s2=new Student(105,"Jitu",1111l,"Male");
//		Student s3=new Student(106,"Puja",100l,"FeMale");
//		Student s4=new Student(107,"Guma",100l,"Male");
//		Student s5=new Student(108,"Mataji",100l,"FeMale");		
//		List<Student> students=Arrays.asList(s1,s2,s3,s4,s5);	
//		studentRepository.saveAll(students);

//	List<Student>	maleStudents=studentRepository.findByGender("Male");
//	maleStudents.forEach(System.out::println);

	//select * from student_dtls where student_rank >= :rank
//		List<Student> students= studentRepository.findByRankGreaterThanEqual(1000);
//		students.forEach(System.out::println);

		// select * from student_dtls where student_gender=? and student_rank >= :rank;
//		List<Student> student = studentRepository.findByGenderAndRankGreaterThanEqual("Male", 100l);
//		student.forEach(System.out::println);
	
	
		
		
		
		
		
		// Fetch all students using Native SQL Query(custom queries)
//        System.out.println("Fetching all students using Native SQL Query...");
//        List<Student> allStudents = studentRepository.getAllStudents();
//        allStudents.forEach(System.out::println);

        // Fetch all students using HQL Query
        System.out.println("Fetching all students using HQL Query...");
        List<Student> studentsHQL = studentRepository.getStudents();
        studentsHQL.forEach(System.out::println);
	
	}

}
