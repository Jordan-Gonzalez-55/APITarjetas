package com.ibm.academia.restapi.solicitud.servicios;

import com.ibm.academia.restapi.solicitud.modelos.entidades.Solicitante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceFeign")
public class SolicitanteServiceFeign implements SolicitanteService{
    @Override
    public List<Solicitante> buscarTarjetasAprobadas() {
        return null;
    }
}
