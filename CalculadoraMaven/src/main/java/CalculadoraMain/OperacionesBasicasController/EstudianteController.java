/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraMain.OperacionesBasicasController;

import CalculadoraMain.model.Estudiante;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodrigo
 */
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    
    
    @GetMapping("/Rodrigo")
    public Estudiante estudiante()
    {
        Estudiante student = new Estudiante();
        student.setCarne(16877);
        student.setNombre("Rodrigo");
        student.setApellido("Garcia");
        student.setCorreo("lgarcias7@miumg.edu.gt");
        student.setFecha_nacimiento(new Date());
        
        
        return student;
    }
    
}
