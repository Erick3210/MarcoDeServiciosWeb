/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Servicios_Estadisticos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author efcas
 */
@WebService(serviceName = "Moda")
public class Moda {

    /**
     * This is a sample web service operation
     */
     @WebMethod(operationName = "Moda")
    public double Moda(@WebParam(name = "arreglo") double[] arreglo) {
        double frecMax = 0;
      
        double moda = 0;
       
        for(int j=0;j<arreglo.length;j++){
                    int frec=0;
               
            for (int i = 0; i < arreglo.length; i++) {
                if(arreglo[j]==arreglo[i])
                {
                     frec++;
                  if(frec > frecMax){
                    moda = arreglo[j];
                    frecMax = frec;
                  }
                }
            }
        
        }        
            return moda;
    }
}
