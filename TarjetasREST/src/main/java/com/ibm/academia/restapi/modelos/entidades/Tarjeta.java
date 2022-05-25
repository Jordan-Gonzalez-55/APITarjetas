package com.ibm.academia.restapi.modelos.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tarjetas")
public class Tarjeta implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    //Datos a ingresar en el endpoint----------------
    @NotNull(message = "No puede ser nulo")
    @NotEmpty(message = "No puede estar vacio")
    @Column(name = "pasion")
    private String pasion;

    @Transient
    @NotNull(message = "No puede ser nulo")
    @NotEmpty(message = "No puede estar vacio")
    @Positive(message = "Debe ser mayor a 0")
    private Integer edadSeleccionada;

    @Transient
    @NotNull(message = "No puede ser nulo")
    @NotEmpty(message = "No puede estar vacio")
    @Positive(message = "Debe ser mayor a 0")
    private Double salarioSeleccionado;

    @Transient
    private Integer puerto;
    //--------------------------------------


    @Column(name = "salario_minimo")
    private Double salarioMinimo;

    @Column(name = "salario_maximo")
    private Double salarioMaximo;

    @Column(name = "edad_minima")
    private Integer edadMinima;

    @Column(name = "edad_maxima")
    private Integer edadMaxima;

    @Column(name = "nombre_tarjeta")
    private String nombreTarjeta;

    @Column(name = "fecha_alta", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;


    public Tarjeta(String pasion, Double salarioMinimo, Double salarioMaximo, Integer edadMinima, Integer edadMaxima,
                   String nombreTarjeta, Date fechaAlta) {
        this.pasion = pasion;
        this.salarioMinimo = salarioMinimo;
        this.salarioMaximo = salarioMaximo;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.nombreTarjeta = nombreTarjeta;
        this.fechaAlta = fechaAlta;
    }

    private static final long serialVersionUID = 7901895145077518325L;
}

