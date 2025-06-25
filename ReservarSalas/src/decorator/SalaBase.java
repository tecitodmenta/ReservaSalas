/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author lvved
 */
public class SalaBase implements SalaReserva {
    public String getDescripcion() {
        return "Reserva básica";
    }

    public double getPrecio() {
        return 20000;
    }
}
