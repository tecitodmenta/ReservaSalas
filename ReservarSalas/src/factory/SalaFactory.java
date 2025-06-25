/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author lvved
 */
public class SalaFactory {
    public Sala crearSala(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "reunion" -> new SalaReunion();
            case "auditorio" -> new SalaAuditorio();
            case "taller" -> new SalaTaller();
            default -> null;
        };
    }
}
