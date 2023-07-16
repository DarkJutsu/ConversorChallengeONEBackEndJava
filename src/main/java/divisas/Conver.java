/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package divisas;

/**
 *
 * @author samll
 */
public class Conver {

    private final double EURO = 0.89;
    private final double LIBRA = 0.76;
    private final double YEN = 137.86;
    private final double WON = 1238.88;

    private final double EDOLAR = 1.12;
    private final double ELIBRA = 0.85;
    private final double EYEN = 154.81;
    private final double EWON = 1390.75;

    private final double LDOLAR = 1.31;
    private final double LEURO = 1.16;
    private final double LYEN = 180.63;
    private final double LWON = 1631.31;

    private final double YDOLAR = 0.0073;
    private final double YEURO = 0.0065;
    private final double YLIBRA = 0.0055;
    private final double YWON = 9.02;

    private final double WDOLAR = 0.0008;
    private final double WEURO = 0.0007;
    private final double WLIBRA = 0.0006;
    private final double WYEN = 0.1110;

    public double convertir(Conversiones cvt, double cambio) {

        switch (cvt.getMoneda()) {
            case "Dolar" -> {
                return switch (cvt.getMonedaC()) {
                    case "Dolar" ->
                        cambio;
                    case "Euro" ->
                        cambio * EURO;
                    case "Libra Esterlina" ->
                        cambio * LIBRA;
                    case "Yen Japonés" ->
                        cambio * YEN;
                    default ->
                        cambio * WON;
                };
            }
            case "Euro" -> {
                return switch (cvt.getMonedaC()) {
                    case "Dolar" ->
                        cambio * EDOLAR;
                    case "Euro" ->
                        cambio;
                    case "Libra Esterlina" ->
                        cambio * ELIBRA;
                    case "Yen Japonés" ->
                        cambio * EYEN;
                    default ->
                        cambio * EWON;
                };
            }
            case "Libra Esterlina" -> {
                return switch (cvt.getMonedaC()) {
                    case "Dolar" ->
                        cambio * LDOLAR;
                    case "Euro" ->
                        cambio * LEURO;
                    case "Libra Esterlina" ->
                        cambio;
                    case "Yen Japonés" ->
                        cambio * LYEN;
                    default ->
                        cambio * LWON;
                };
            }
            case "Yen Japonés" -> {
                return switch (cvt.getMonedaC()) {
                    case "Dolar" ->
                        cambio * YDOLAR;
                    case "Euro" ->
                        cambio * YEURO;
                    case "Libra Esterlina" ->
                        cambio * YLIBRA;
                    case "Yen Japonés" ->
                        cambio;
                    default ->
                        cambio * YWON;
                };
            }
            case "Won Sur-Coreano" -> {
                return switch (cvt.getMonedaC()) {
                    case "Dolar" ->
                        cambio * WDOLAR;
                    case "Euro" ->
                        cambio * WEURO;
                    case "Libra Esterlina" ->
                        cambio * WLIBRA;
                    case "Yen Japonés" ->
                        cambio * WYEN;
                    default ->
                        cambio;
                };
            }
            default -> {
            }
        }
        return 0.0;
    }

}
