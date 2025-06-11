/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerdisenio;

/**
 *
 * @author joeybustamante
 */
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor responsable;
    private List<Estudiante> estudiantes;
    private List<ActividadSumativa> actividades;
    private List<Foro> foros;

    // Getters y setters
    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }
}
