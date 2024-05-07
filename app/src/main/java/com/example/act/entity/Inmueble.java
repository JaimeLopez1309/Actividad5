package com.example.act.entity;

import android.media.Image;

import java.sql.Blob;

public class Inmueble {


    private int ID;
    private String Direccion;
    private String vendedor;
    private String Descripcion;
    private int Valor;
    private String Tipo;
    private String celular;
    private Image Imagen;
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public Image getImagen() {
        return Imagen;
    }

    public void setImagen(Image imagen) {
        Imagen = imagen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Inmueble{");
        sb.append("ID=").append(ID);
        sb.append(", Direccion='").append(Direccion).append('\'');
        sb.append(", vendedor='").append(vendedor).append('\'');
        sb.append(", Descripcion='").append(Descripcion).append('\'');
        sb.append(", Valor=").append(Valor);
        sb.append(", Tipo='").append(Tipo).append('\'');
        sb.append(", celular='").append(celular).append('\'');
        sb.append(", Imagen=").append(Imagen);
        sb.append('}');
        return sb.toString();
    }
}
