package sw2.ejemplogestionfechas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sw2.ejemplogestionfechas.entity.Evento;
import sw2.ejemplogestionfechas.repository.EventoRepository;

import java.time.LocalDateTime;

@Controller
public class EventoController {

    @Autowired
    EventoRepository repo;

    @GetMapping("/listar")
    public String listarEvento(Model model){
        model.addAttribute("listaEvento", repo.findAll());
        return "lista";
    }

    @GetMapping("/nuevo")
    public String nuevoEvento(){
        return "formNuevo";
    }

    @PostMapping("guardar")
    public String guardarEvento(Evento evento){
        evento.setFechaHoraCreacionEvento(LocalDateTime.now());
        repo.save(evento);
        return "redirect:/listar";
    }

}
