package com.QuizParcial.QuizParcial.InterfazService;

import com.QuizParcial.QuizParcial.Model.Mascota;

import java.util.List;
import java.util.Optional;

//Cambio, Prueba

public interface IMascotaService {
    List<Mascota> listar();

    void guardar(Mascota mascota);

    Optional<Mascota> editar(int id);

    void eliminar(int id);
}
