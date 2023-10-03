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
@WebService(serviceName = "DesviacionEstandar")
public class DesviacionEstandar {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "DesviacionEstandar")
    public double DesviacionEstandar(@WebParam(name = "arreglo") double[] arreglo) {
        double sum = 0.0;
        double desviacionStandar = 0.0;
        double media = 0.0;
        double res = 0.0;
        double sq = 0.0;

        for (int i = 0; i < arreglo.length; i++) {
            sum = sum + arreglo[i];
        }

        media = sum / (arreglo.length);

        for (int i = 0; i < arreglo.length; i++) {
            desviacionStandar = desviacionStandar + Math.pow((arreglo[i] - media), 2);
        }

        sq = desviacionStandar / arreglo.length;
        res = Math.sqrt(sq);
        return res;
    }
}
