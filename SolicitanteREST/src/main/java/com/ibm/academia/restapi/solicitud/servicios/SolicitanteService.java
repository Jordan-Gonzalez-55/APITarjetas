package com.ibm.academia.restapi.solicitud.servicios;

import com.ibm.academia.restapi.solicitud.modelos.entidades.Solicitante;

import java.util.List;

public interface SolicitanteService {
    public List<Solicitante> buscarTarjetasAprobadas();
    public List<Solicitante> tardejatIdeal(String pasion, Double salario,Integer edad);
}
