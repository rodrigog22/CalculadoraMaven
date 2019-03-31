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
public class ValorAbsolutoController {
    
    @GetMapping("/valor")
    public int valor(@RequestParam int a)
            {
                int b = 0;
                if(a>=0)
                    {
                        b=a;
                    }
                else if(a<0)
                    {
                        b = a*-1;
                    }
                
                return b;
            }
    
}
