package com.QuizParcial.QuizParcial.Controller;

import com.QuizParcial.QuizParcial.InterfazService.IMascotaService;
import com.QuizParcial.QuizParcial.Model.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api/mascota")
public class PropietarioController {

    @Autowired
    private IMascotaService service;

    @GetMapping("/listarpropeietarios")
    public String listarMascotas(Model model){
        model.addAttribute("titulo","Spring DB - Mascotas");
        model.addAttribute("cuerpo","LISTA DE MASCOTAS");
        model.addAttribute("datos", service.listar());
        model.addAttribute("tipo", "mascota");
        model.addAttribute("nuevoUrl", "/api/mascota/nuevamascota");
        model.addAttribute("editarUrl", "/api/mascota/editar/{id}");
        model.addAttribute("eliminarUrl", "/api/mascota/eliminar/{id}");
        return "index";
    }


    @GetMapping("/nuevamascota")
    public String formAgregarMascotas(Model model){
        model.addAttribute("titulo", "Nueva Mascota");
        model.addAttribute("cuerpo", "Agregar una nueva mascota");
        model.addAttribute("entity", new Mascota());
        model.addAttribute("guardarUrl", "/api/mascota/guardar");
        model.addAttribute("listarUrl", "/api/mascota/listarmascotas");
        return "nuevo";
    }


    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute Mascota mascota){
        service.guardar(mascota);
        return "redirect:/api/mascota/listarmascotas";
    }

    @GetMapping("/editar/{id}")
    public String editarMascota(@PathVariable("id") int id, Model model){
        Optional<Mascota> mascota =  service.editar(id);
        model.addAttribute("entity", mascota.get());
        model.addAttribute("guardarUrl", "/api/mascota/guardar");
        return "nuevo";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarMascota(@PathVariable("id") int id){
        service.eliminar(id);
        return "redirect:/api/mascota/listarmascotas";
    }

}
