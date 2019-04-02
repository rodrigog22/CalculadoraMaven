/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraMain.Memoria;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodrigo
 */
@RestController
@RequestMapping("/memoria")
public class MemoriaController {
    
    private int m1,m2;
    
    //servicion para crear memoria 1
    @PostMapping("m1/create")
    public void crear(@RequestParam int m1)
    {
        this.m1=m1;
    }
    
    @PutMapping("/updatem1")
    public void actualizar(@RequestParam int m1)
    {
        this.m1=m1;
    }
    
    @DeleteMapping("/deletem1")
    public String eliminar()
    {
        this.m1=m1;
        
        return "Se elimino la memoria con exito.";
    }
    
    @GetMapping("/selectm1")
    public int obtener()
    {
        return this.m1;
    }
    
}
