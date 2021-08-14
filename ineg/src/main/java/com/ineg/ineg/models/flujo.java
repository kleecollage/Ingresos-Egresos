package com.ineg.ineg.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "Saldo")
public class Flujo {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @NotNull
    @Size (max = 255)
    private Float Cantidad ;

    @NotNull
    @Size (max = 15)
    private String Tipo ;

    @NotNull
    @Size (max = 50)
    private String Categoria ;

    @NotNull
    private LocalDate Fecha = LocalDate.now() ;

    @NotNull
    @Size (max = 255)
    private Float Saldo ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Float cantidad) {
        Cantidad = cantidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public Float getSaldo() {
        return Saldo;
    }

    public void setSaldo(Float saldo) {
        Saldo = saldo;
    }

}
