package com.QuizParcial.QuizParcial.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String especie;
    private String raza;
    private Date fecha_Nacimiento;

    @ManyToOne(targetEntity = Propietario.class)
    private Propietario profesor;
}
