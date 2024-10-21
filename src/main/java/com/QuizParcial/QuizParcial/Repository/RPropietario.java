package com.QuizParcial.QuizParcial.Repository;

import com.QuizParcial.QuizParcial.Model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface RMascota extends  JpaRepository<Mascota, Integer>{
}