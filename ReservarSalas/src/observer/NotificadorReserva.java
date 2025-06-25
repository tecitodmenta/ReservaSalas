/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lvved
 */
public class NotificadorReserva {
    private final List<Observer> observadores = new ArrayList<>();

    public void agregar(Observer obs) {
        observadores.add(obs);
    }

    public void notificarTodos(String mensaje) {
        for (Observer obs : observadores) {
            obs.notificar(mensaje);
        }
    }
}
