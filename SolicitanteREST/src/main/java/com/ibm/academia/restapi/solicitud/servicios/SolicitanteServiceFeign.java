package com.ibm.academia.restapi.solicitud.servicios;

import com.ibm.academia.restapi.solicitud.clientes.SolicitanteClienteRest;
import com.ibm.academia.restapi.solicitud.modelos.entidades.Solicitante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SolicitanteServiceFeign implements SolicitanteService{
	
	@Autowired
	private RestTemplate tarjetasRest;
	
	@Autowired SolicitanteClienteRest clienteFeing;
	
    @Override
    public List<Solicitante> buscarTarjetasAprobadas() {
    	//List<Solicitante> solicitante = Arrays.asList( tarjetasRest.getForObject("http://localhost:8080/api/vi/rest-tarjetas/tarjetas", Solicitante[].class) );
        //return solicitante;
    	return clienteFeing.tarjetasSolicitante();
    }

	@Override
	public List<Solicitante> tardejatIdeal(String pasion, Double salario, Integer edad) {
//		Map<String, Object> solicitud = new HashMap<>();
//		solicitud.put("pasion", pasion.toString());
//		solicitud.put("salario", salario.toString());
//		solicitud.put("edad", edad.toString());
//		
//		
//		List<Solicitante> solicitante = Arrays.asList( tarjetasRest.getForObject("http://localhost:8080/api/vi/rest-tarjetas/tarjetas/mejorOferta/{pasion}/{salario}/{edad}", Solicitante[].class,solicitud) );
//        

		//return solicitante;
		return clienteFeing.mejoresTarjetasSolicitante(pasion, salario, edad);
	}
}
