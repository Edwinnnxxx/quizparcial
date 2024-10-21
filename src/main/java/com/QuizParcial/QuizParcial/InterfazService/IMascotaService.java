package com.QuizParcial.QuizParcial.InterfazService;

import com.QuizParcial.QuizParcial.Model.Mascota;

import java.util.List;
import java.util.Optional;

public interface IMascotaService {
    List<Mascota> listar();

    void guardar(Mascota mascota);

    Optional<Mascota> editar(int id);

    void eliminar(int id);
}
