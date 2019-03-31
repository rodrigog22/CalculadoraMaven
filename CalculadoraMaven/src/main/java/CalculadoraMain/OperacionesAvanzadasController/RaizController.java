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
public class RaizController {
    
    @GetMapping("/raiz")
    public int raiz(@RequestParam int a)
            {
                int b = 0;
                b = (int) Math.sqrt(a);
                
                return b;
            }
            
}
