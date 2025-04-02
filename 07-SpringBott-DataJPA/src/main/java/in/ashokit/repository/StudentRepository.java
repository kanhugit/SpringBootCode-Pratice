package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import in.ashokit.entity.Student;

//@Repository
public interface   StudentRepository extends CrudRepository<Student,Integer>{
	
	//FindByxxx() methods
	
	//select * from student_dtls where student_gender=male;
	public List<Student> findByGender(String gender);
	
	//select * from student_dtls where student_gender is null;
	public List<Student> findByGenderIsNull();
	
	//select * from student_dtls where student_rank>=1000;
	public List<Student> findByRankGreaterThanEqual(long rank);
	
	//select * from student_dtls where student_rank<=;
	public List<Student> findByRankLessThanEqual(long l);
	
	//male students who are having rank >=100;
	//select * from student_dtls where student_gender=? and student_rank >= :rank;
	public List<Student> findByGenderAndRankGreaterThanEqual(String gender,long rank);
	
	
	//Custom Queries
	@Query(value="select * from student_dtls",nativeQuery=true)
	public List<Student> getAllStudents();
	
	
//	HQL Queries
	@Query("from Student")
	public List<Student> getStudents();
	
}
