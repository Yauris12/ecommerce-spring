package com.ecommerce.app.model;

import java.util.Date;

public class Orden {

private Integer id;
private String numero;
private Date fechaCreaccion;
private Date fechaRecibida;
private double total;


    public Orden() {
    }

    public Orden(Integer id, String numero, Date fechaCreaccion, Date fechaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreaccion = fechaCreaccion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaCreaccion() {
        return fechaCreaccion;
    }

    public void setFechaCreaccion(Date fechaCreaccion) {
        this.fechaCreaccion = fechaCreaccion;
    }

    public Date getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", fechaCreaccion=" + fechaCreaccion +
                ", fechaRecibida=" + fechaRecibida +
                ", total=" + total +
                '}';
    }
}

