/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temperaturas;

/**
 *
 * @author samll
 */
public class Temperatura {

    private String temp;
    private String tempC;

    public Temperatura(String temp, String tempC) {
        this.temp = temp;
        this.tempC = tempC;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTempC() {
        return tempC;
    }

    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

}
