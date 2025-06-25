/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author lvved
 */
public class Proyector extends ExtraDecorator {
    public Proyector(SalaReserva sala) {
        super(sala);
    }

    public String getDescripcion() {
        return sala.getDescripcion() + " + Proyector";
    }

    public double getPrecio() {
        return sala.getPrecio() + 5000;
    }
}
