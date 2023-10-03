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
@WebService(serviceName = "Varianza")
public class Varianza {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Varianza")
    public double Varianza(@WebParam(name = "arreglo") double[] arreglo) {
        double media = 0;
        double suma = 0;
        double varianza = 0;

        // Calcular la media de los datos
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        media = suma / arreglo.length;

        // Calcular la varianza de los datos
        for (int i = 0; i < arreglo.length; i++) {
            varianza += Math.pow(arreglo[i] - media, 2);
        }
        varianza = varianza / arreglo.length;

        return varianza;
    }
    
    
}
