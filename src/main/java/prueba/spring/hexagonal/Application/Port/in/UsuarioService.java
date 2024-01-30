/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prueba.spring.hexagonal.Application.Port.in;

import java.util.List;
import prueba.spring.hexagonal.Adapter.outpersistence.Usuariopersistence;


/**
 *
 * @author l
 */
public interface UsuarioService {
    List<Usuariopersistence> traerusuario();
}
