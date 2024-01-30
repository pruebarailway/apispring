/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.spring.hexagonal.Adapter.inweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prueba.spring.hexagonal.Adapter.outpersistence.Usuariopersistence;
import prueba.spring.hexagonal.Application.Port.in.UsuarioService;

/**
 *
 * @author l
 */


@RestController
@RequestMapping(path="/apirest/")
public class UsuarioController {
    
    
    @Autowired
    private UsuarioService serv;

    @GetMapping("/all")
    public List<Usuariopersistence> traertodo(){
        return serv.traerusuario();
    }
    
    
    
}
