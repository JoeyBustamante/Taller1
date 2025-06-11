/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerdisenio;

import java.util.ArrayList;

/**
 *
 * @author joeybustamante
 */
public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes;

    protected boolean login() {
        // lógica de login
        return true;
    }

    protected boolean logOut() {
        // lógica de logout
        return true;
    }
}

