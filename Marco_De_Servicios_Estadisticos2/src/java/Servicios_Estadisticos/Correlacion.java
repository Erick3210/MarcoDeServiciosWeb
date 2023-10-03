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
@WebService(serviceName = "Correlacion")
public class Correlacion {

    /**
     * This is a sample web service operation
     * @param conjunto1
     * @param conjunto2
     * @return 
     */
    @WebMethod(operationName = "CalcularCorrelacion")
    public double CalcularCorrelacion(@WebParam(name = "conjunto1") double[] conjunto1,
                                      @WebParam(name = "conjunto2") double[] conjunto2) {
        if (conjunto1.length != conjunto2.length) {
            throw new IllegalArgumentException("Los conjuntos deben tener la misma longitud");
        }

        double media1 = calcularMedia(conjunto1);
        double media2 = calcularMedia(conjunto2);

        double covarianza = calcularCovarianza(conjunto1, conjunto2, media1, media2);
        double desviacion1 = calcularDesviacion(conjunto1, media1);
        double desviacion2 = calcularDesviacion(conjunto2, media2);

        double correlacion = covarianza / (desviacion1 * desviacion2);

        return correlacion;
    }

    private double calcularMedia(double[] conjunto) {
        double suma = 0;
        for (double valor : conjunto) {
            suma += valor;
        }
        return suma / conjunto.length;
    }

    private double calcularCovarianza(double[] conjunto1, double[] conjunto2, double media1, double media2) {
        double covarianza = 0;
        for (int i = 0; i < conjunto1.length; i++) {
            covarianza += (conjunto1[i] - media1) * (conjunto2[i] - media2);
        }
        return covarianza / conjunto1.length;
    }

    private double calcularDesviacion(double[] conjunto, double media) {
        double suma = 0;
        for (double valor : conjunto) {
            suma += Math.pow(valor - media, 2);
        }
        return Math.sqrt(suma / conjunto.length);
    }
}
