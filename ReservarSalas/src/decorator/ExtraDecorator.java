/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author lvved
 */
public abstract class ExtraDecorator implements SalaReserva {
    protected SalaReserva sala;

    public ExtraDecorator(SalaReserva sala) {
        this.sala = sala;
    }
}
