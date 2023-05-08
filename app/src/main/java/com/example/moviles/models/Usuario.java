package com.example.moviles.models;

import com.google.firebase.firestore.GeoPoint;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private String nombreUsuario;
    private String correoUsuario;
    private String contrasenaUsuario;
    private Map<String, Object> ubicacionEmergencia;
    private Map<String, Object> ubicacion;

    public Usuario(String nombreUsuario, String correoUsuario, String contrasenaUsuario, Map<String, Object> ubicacion, Map<String, Object> ubicacionEmergencia) {
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.ubicacion = ubicacion;
        this.ubicacionEmergencia = ubicacionEmergencia;

    }
    public Usuario() {
        this.nombreUsuario = "";
        this.correoUsuario = "";
        this.contrasenaUsuario = "";
        this.ubicacion = new HashMap <String, Object>() ;
        this.ubicacionEmergencia = new HashMap <String, Object>() ;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public Map<String, Object> getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Map<String, Object> ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Map<String, Object> getUbicacionEmergencia() {
        return ubicacionEmergencia;
    }

    public void setUbicacionEmergencia(Map<String, Object> ubicacionEmergencia) {
        this.ubicacionEmergencia = ubicacionEmergencia;
    }

}