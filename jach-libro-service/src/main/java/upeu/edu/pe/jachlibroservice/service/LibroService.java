package upeu.edu.pe.jachlibroservice.service;

import upeu.edu.pe.jachlibroservice.entity.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroService {
    List<Libro> Listar();
    Optional<Libro> Buscar(Long id);
    Libro Guardar(Libro curso);
    Libro Modificar(Long id, Libro curso);
    void Eliminar(Long id);
}
