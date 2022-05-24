package com.ibm.academia.restapi.modelos.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

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
    private Integer id;

    @Column(name = "pasion")
    private String pasion;

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

