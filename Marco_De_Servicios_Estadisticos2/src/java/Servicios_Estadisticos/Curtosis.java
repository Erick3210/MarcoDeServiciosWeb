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
@WebService(serviceName = "Curtosis")
public class Curtosis {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Curtosis")
    public double Curtosis(@WebParam(name = "arreglo") double[] arreglo) {
        double n = arreglo.length;
        double media = 0;
        double desviacion_estandar = 0;
        double suma = 0;
        double suma_desviacion = 0;

        // Calcular la media de los datos
        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }
        media = suma / n;

        // Calcular la desviación estándar de los datos
        for (int i = 0; i < n; i++) {
            suma_desviacion += Math.pow(arreglo[i] - media, 2);
        }
        desviacion_estandar = Math.sqrt(suma_desviacion / (n - 1));

        // Calcular la suma de las diferencias elevadas a la cuarta potencia
        double suma_cuarta = 0;
        for (int i = 0; i < n; i++) {
            suma_cuarta += Math.pow(arreglo[i] - media, 4);
        }

        double kurtosis = ((1 / n) * suma_cuarta / Math.pow(desviacion_estandar, 4)) - 3;

        return kurtosis;

    }
}
