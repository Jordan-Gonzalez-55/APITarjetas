package com.ibm.academia.restapi.solicitud.clientes;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "api-tarjetas")
public interface SolicitanteClienteRest {
}
