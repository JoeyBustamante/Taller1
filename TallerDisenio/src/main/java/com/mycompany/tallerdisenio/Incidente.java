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
    protected int id;
    protected LocalDateTime fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> logActualizaciones;
    protected LocalDateTime fechaCerrado;
    protected String tipo;
    protected Usuario responsable;
    protected PersonalAcademico beneficiario;
}

