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
@WebService(serviceName = "Media")
public class Media {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Media")
    public double Media(@WebParam(name = "arreglo") double[] arreglo) {
        double media = 0;

        for (int i = 0; i < arreglo.length; i++) {
            media = media + arreglo[i];
        }

        media = media / arreglo.length;

        return media;
    }
}
