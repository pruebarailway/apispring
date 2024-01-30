/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prueba.spring.hexagonal.Adapter.outpersistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author l
 */
@Repository
public interface UsuarioRepositoryPersistence extends JpaRepository<Usuariopersistence, Long>{
    
}
