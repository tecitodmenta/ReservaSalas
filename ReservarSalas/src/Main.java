/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import command.*;

import java.util.Scanner;

/**
 *
 * @author lvved
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaReservas sistema = new SistemaReservas();
        Comando reservar = new ComandoReservar(sistema);
        Comando historial = new ComandoHistorial(sistema);

        while (true) {
            System.out.println("\n=== Sistema de Reserva de Salas ===");
            System.out.println("1. Hacer reserva");
            System.out.println("2. Ver historial");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> reservar.ejecutar();
                case "2" -> historial.ejecutar();
                case "3" -> {
                    System.out.println("👋 ¡Hasta luego!");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }
}
