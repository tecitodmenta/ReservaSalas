/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author lvved
 */
public class ComandoReservar implements Comando {
    private final SistemaReservas sistema;

    public ComandoReservar(SistemaReservas sistema) {
        this.sistema = sistema;
    }

    public void ejecutar() {
        sistema.hacerReserva();
    }
}