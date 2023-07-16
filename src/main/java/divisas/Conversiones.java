/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package divisas;

/**
 *
 * @author samll
 */
public class Conversiones {

    private String moneda;
    private String monedaC;

    public Conversiones(String moneda, String monedaC) {
        this.moneda = moneda;
        this.monedaC = monedaC;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMonedaC() {
        return monedaC;
    }

    public void setMonedaC(String monedaC) {
        this.monedaC = monedaC;
    }

}
