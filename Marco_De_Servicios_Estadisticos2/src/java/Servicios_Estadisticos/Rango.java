/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Servicios_Estadisticos;

import java.util.Scanner;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author efcas
 */
@WebService(serviceName = "Rango")
public class Rango {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Rango")
    public double Rango(@WebParam(name = "arreglo") double[] arreglo) {
      double rango;
      double maximo = arreglo[0];
      double minimo = arreglo[0];
 
      for (int i = 0; i < arreglo.length; i++){
        if (maximo < arreglo[i])
                maximo = arreglo[i];
        if (minimo > arreglo[i])
                minimo = arreglo[i];
     }  
        rango= maximo-minimo;
        return rango;
    }
}
