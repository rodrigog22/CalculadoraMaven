/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraMain.OperacionesAvanzadasController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodrigo
 */
@RestController
public class FactorialController {
    
    @GetMapping("/avanzadas/factorial")
    public int factorial(@RequestParam int a)
            {
              int acum=1;
      
                while(a>0)
                {
                  acum=acum*a;
                  a--;
                 }
                 a=acum;
             return a;  
            }
    
    
}
