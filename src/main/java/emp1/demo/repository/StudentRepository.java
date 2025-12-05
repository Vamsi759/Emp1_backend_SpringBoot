package emp1.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;



import emp1.demo.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {}


