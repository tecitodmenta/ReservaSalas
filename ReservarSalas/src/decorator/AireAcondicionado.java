/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author lvved
 */
public class AireAcondicionado extends ExtraDecorator {
    public AireAcondicionado(SalaReserva sala) {
        super(sala);
    }

    public String getDescripcion() {
        return sala.getDescripcion() + " + Aire Acondicionado";
    }

    public double getPrecio() {
        return sala.getPrecio() + 3000;
    }
}
