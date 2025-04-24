package upeu.edu.pe.jachlibroservice.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.jachlibroservice.entity.Libro;
import upeu.edu.pe.jachlibroservice.repository.LibroRepository;
import upeu.edu.pe.jachlibroservice.service.LibroService;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroRepository kr;

    @Override
    public List<Libro> Listar() {
        return kr.findAll();
    }

    @Override
    public Optional<Libro> Buscar(Long id) {
        return kr.findById(id);
    }

    @Override
    public Libro Guardar(Libro libro) {
        return kr.save(libro);
    }

    @Override
    public Libro Modificar(Long id, Libro libro) {
        libro.setId(id);
        return kr.save(libro);
    }

    @Override
    public void Eliminar(Long id) {
        kr.deleteById(id);
    }

}