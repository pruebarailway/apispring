/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.spring.hexagonal.Application.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.spring.hexagonal.Adapter.outpersistence.UsuarioRepositoryPersistence;
import prueba.spring.hexagonal.Adapter.outpersistence.Usuariopersistence;
import prueba.spring.hexagonal.Application.Port.in.UsuarioService;

/**
 *
 * @author l
 */
@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired 
    private UsuarioRepositoryPersistence rep;
    
    
    
    //normalmente la informacion que llega aqui se transporta hacia otras interfaces para una posterior implementacion, en estecaso, vamos a pasar directamente a añadirla a el repositorio
    //estas interfaces irian en el aplication port ou
    @Override
    public List<Usuariopersistence> traerusuario() {
        return rep.findAll();
    }
    
}
