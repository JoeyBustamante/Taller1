/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerdisenio;

/**
 *
 * @author joeybustamante
 */
import java.time.LocalDateTime;
import java.util.List;

public class Incidente {
    private int id;
    private LocalDateTime fechaReportado;
    private String estado;
    private String titulo;
    private String descripcion;
    private List<String> logActualizaciones;
    private LocalDateTime fechaCerrado;
    private String tipo;
}

