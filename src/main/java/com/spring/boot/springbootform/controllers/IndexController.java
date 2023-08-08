package com.spring.boot.springbootform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.boot.springbootform.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({ "/index", "/", "", "/home" })
    public String index(Model model) {
        model.addAttribute("titulo", "Hola  Spring Framework");
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {

        Usuario usuario = new Usuario();
        usuario.setNombre("Rodrigo");
        usuario.setApellido("Troconis");

        model.addAttribute("usuario", usuario.getNombre());

        model.addAttribute("apellido", usuario.getApellido());

        return "perfil";

    }

}
