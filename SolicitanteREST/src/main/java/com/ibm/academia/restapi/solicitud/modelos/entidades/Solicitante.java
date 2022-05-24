package com.ibm.academia.restapi.solicitud.modelos.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Setter
@Getter
@NoArgsConstructor
public class Solicitante implements Serializable {

    //Datos que estan en el otro programa----------------
    private String pasion;
    private Integer edadSeleccionada;
    private Double salarioSeleccionado;
    private String nombreTarjeta;
    private Integer puerto;


    private static final long serialVersionUID = 9043160628483851183L;
}
