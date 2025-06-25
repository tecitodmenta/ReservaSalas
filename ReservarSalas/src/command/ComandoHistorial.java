/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author lvved
 */

public class ComandoHistorial implements Comando {
    private final SistemaReservas sistema;

    public ComandoHistorial(SistemaReservas sistema) {
        this.sistema = sistema;
    }

    public void ejecutar() {
        sistema.verHistorial();
    }
}