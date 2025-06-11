/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerdisenio;

/**
 *
 * @author joeybustamante
 */
public class Administrador extends Usuario {
    public void crearUsuarioConRol(String usuario, String contraseña) {
        // Crear nuevo usuario
    }

    public void asignarPermiso(String usuario) {
        // Asignar permisos
    }

    public void actualizarSoftware() {
        // Actualizar software
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
        curso.setResponsable(responsable);
    }
}

