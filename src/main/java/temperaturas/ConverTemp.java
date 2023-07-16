/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temperaturas;

/**
 *
 * @author samll
 */
public class ConverTemp {

    public double convertir(Temperatura t, double cambio) {
        switch (t.getTemp()) {
            case "Celsius" -> {
                return switch (t.getTempC()) {
                    case "Fahrenheit" ->
                        (cambio * 1.8) + 32;
                    case "Kelvin" ->
                        cambio + 273.15;
                    default ->
                        cambio;
                };
            }
            case "Fahrenheit" -> {
                return switch (t.getTempC()) {
                    case "Celsius" ->
                        (cambio-32)/1.8;
                    case "Kelvin" ->
                        ((cambio-32)/1.8) + 273.15;
                    default ->
                        cambio;
                };
            }
            case "Kelvin" -> {
                return switch (t.getTempC()) {
                    case "Celsius" ->
                        cambio-273.15;
                    case "Fahrenheit" ->
                        ((cambio-273.15)*1.8)+32;
                    default ->
                        cambio;
                };
            }
        }
        return 0.0;
    }


}
