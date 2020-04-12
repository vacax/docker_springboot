package edu.pucmm.ia.docker_springboot.controladores;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@RequestMapping("/")
public class DockerControlador {

    @Value("${server.port}")
    private int puerto;
    private String hostname;

    @GetMapping("/")
    public String holaMundo(Model model, HttpSession session){
        hostname = "SIN-HOST";
        try {
            hostname = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        model.addAttribute("puerto", puerto);
        model.addAttribute("hostname", hostname);
        return "holamundo";
    }

    @GetMapping("/otros")
    @ResponseBody
    public String otrosDatos(){
        return "Otros Datos";
    }
}
