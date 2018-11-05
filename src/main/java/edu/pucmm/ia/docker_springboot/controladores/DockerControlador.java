package edu.pucmm.ia.docker_springboot.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class DockerControlador {

    @GetMapping("/")
    public String holaMundo(Model model, HttpSession session){
        return "holamundo";
    }

    @GetMapping("/otros")
    @ResponseBody
    public String otrosDatos(){
        return "Otros Datos";
    }
}
