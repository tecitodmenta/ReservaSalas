/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import factory.Sala;
import factory.SalaFactory;
import decorator.*;
import observer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lvved
 */
public class SistemaReservas {
    private final List<String> historial = new ArrayList<>();
    private final NotificadorReserva notificador = new NotificadorReserva();
    private final Usuario usuario = new Usuario("Fernando");

    public SistemaReservas() {
        notificador.agregar(usuario);
    }

    public void hacerReserva() {
        Scanner sc = new Scanner(System.in);
        SalaFactory factory = new SalaFactory();

        System.out.print("Tipo de sala (reunion/auditorio/taller): ");
        String tipo = sc.nextLine();

        Sala sala = factory.crearSala(tipo);
        if (sala == null) {
            System.out.println("❌ Tipo de sala no válida.");
            return;
        }

        SalaReserva reserva = new SalaBase();
        System.out.print("¿Agregar proyector? (s/n): ");
        if (sc.nextLine().equalsIgnoreCase("s")) {
            reserva = new Proyector(reserva);
        }

        System.out.print("¿Agregar aire acondicionado? (s/n): ");
        if (sc.nextLine().equalsIgnoreCase("s")) {
            reserva = new AireAcondicionado(reserva);
        }

        String mensaje = "✅ Reserva confirmada: " + sala.getDescripcion() + " - " + reserva.getDescripcion() + " ($" + reserva.getPrecio() + ")";
        System.out.println(mensaje);
        historial.add(mensaje);
        notificador.notificarTodos("Tu reserva fue procesada correctamente.");
    }

    public void verHistorial() {
        System.out.println("📜 Historial de reservas:");
        for (String r : historial) {
            System.out.println("- " + r);
        }
    }
}
