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
public class PotenciaNController {
    
    
    @GetMapping("/potenciaN")
    public int pontencia(@RequestParam int a,@RequestParam int b)
            {
                int c = 0;
                c = (int) Math.pow(a, b);
                
                return c;
            }
    
}
