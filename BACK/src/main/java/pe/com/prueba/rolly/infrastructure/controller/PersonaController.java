package pe.com.prueba.rolly.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.com.prueba.rolly.domain.Persona;

import java.util.List;

@RequestMapping(value = "api/v1/personaService")
public interface PersonaController {

    @PostMapping(value = "/ordenarListaPersona")
    ResponseEntity<List<Persona>> ordenarListaPersona(@RequestBody List<Persona> listPersonas);

    @PostMapping(value = "/ordenarPersonaPorAppPaterno")
    ResponseEntity<List<Persona>> ordenarPersonaPorAppPaterno(@RequestBody List<Persona> listPersonas);


}
