package com.ibm.academia.restapi.validaciones;

import com.ibm.academia.restapi.excepciones.NotFoundException;
import com.ibm.academia.restapi.modelos.entidades.Tarjeta;
import com.ibm.academia.restapi.service.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TarjetaValidacion {

    @Autowired
    private TarjetaService tarjetaService;

    @Autowired
    private Environment environment;

    public ResponseEntity<?> tarjetasValidadas(String pasion, Double salario, Integer edad){
        Map<String, Object> validaciones = new HashMap<String, Object>();
        List<String> listaErrorres = new ArrayList<>();
        String[] pasiones ={"shopping", "travels", "sports", "my style", "my business", "help"};
        if(pasion.isBlank()){
            listaErrorres.add("Tu pasión no debe ser nula");
        }
        if(!Arrays.asList(pasiones).contains(pasion.toLowerCase())){
            listaErrorres.add("Tu pasión no es valida");
        }
        if(18>edad || edad>75){
            listaErrorres.add("Edades validas: 18 a 75 años");
        }
        if(0>edad || 0>salario){
            listaErrorres.add("No se permiten valores negativos");
        }
        if(!listaErrorres.isEmpty()){
            validaciones.put("Lista de errores:", listaErrorres);
            return new ResponseEntity<Map<String, Object>>(validaciones, HttpStatus.BAD_REQUEST);
        }

        List<Tarjeta> tarjetasEncontradas = tarjetaService.buscarMejorTarjeta(pasion, salario, edad).stream().
                map(tarjeta -> {
                    tarjeta.setPuerto(Integer.parseInt(environment.getProperty("local.server.port")));
                    return tarjeta;
                }).collect(Collectors.toList());

        if(tarjetasEncontradas.isEmpty())
            throw new NotFoundException(String.format("No se encontraron tarjetas diponibles"));


        System.out.println(tarjetasEncontradas);
        return new ResponseEntity<List<Tarjeta>>(tarjetasEncontradas ,HttpStatus.OK);
    }

}
