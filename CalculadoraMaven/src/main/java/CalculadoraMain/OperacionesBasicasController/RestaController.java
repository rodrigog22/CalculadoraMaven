/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraMain.OperacionesBasicasController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodrigo
 */
@RestController
public class RestaController {
    
    @GetMapping("/resta")
    public int Resta(@RequestParam int a, @RequestParam int b)
            {
                
                return a-b;
            }
    
}
