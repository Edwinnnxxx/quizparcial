package com.QuizParcial.QuizParcial.Service;

import com.QuizParcial.QuizParcial.InterfazService.IMascotaService;
import com.QuizParcial.QuizParcial.Model.Mascota;
import com.QuizParcial.QuizParcial.Repository.RMascota;
import com.QuizParcial.QuizParcial.Repository.RPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class MascotaService implements IMascotaService {
    @Autowired
    private RMascota repositorio;

    @Autowired
    private RPropietario repository;

    @Override
    public List<Mascota> listar() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Mascota mascota) {
        repositorio.save(mascota);
    }

    @Override
    public Optional<Mascota> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
