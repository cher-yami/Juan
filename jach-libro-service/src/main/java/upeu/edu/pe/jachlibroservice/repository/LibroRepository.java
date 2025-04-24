package upeu.edu.pe.jachlibroservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.jachlibroservice.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}