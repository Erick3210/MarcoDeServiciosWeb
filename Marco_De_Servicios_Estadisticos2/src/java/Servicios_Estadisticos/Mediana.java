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
@WebService(serviceName = "Mediana")
public class Mediana {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Mediana")
    public double Mediana(@WebParam(name = "arreglo") double[] arreglo) {
        double mediana;
        double media = 0;
        double suma = 1;

        // Ordenar los datos con el algoritmo de Burbuja
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    double temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        int mitad = arreglo.length / 2;
        // Si la longitud es par, se deben promediar los del centro
        if (arreglo.length % 2 == 0) {
            mediana = (arreglo[mitad - 1] + arreglo[mitad]) / 2;
            return mediana;
        } else {
            mediana = arreglo[mitad];
            return mediana;
        }

    }

}
