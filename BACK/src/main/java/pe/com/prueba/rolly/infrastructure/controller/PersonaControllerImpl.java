package pe.com.prueba.rolly.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pe.com.prueba.rolly.application.PersonAService;
import pe.com.prueba.rolly.domain.Persona;

import java.util.List;

@RestController
public class PersonaControllerImpl implements PersonaController {

    private final PersonAService personAService;

    public PersonaControllerImpl(PersonAService personAService) {
        this.personAService = personAService;
    }

    @Override
    public ResponseEntity<List<Persona>> ordenarListaPersona(List<Persona> listPersonas) {
        return ResponseEntity.ok(personAService.ordenarListaPorDNI(listPersonas));
    }

    @Override
    public ResponseEntity<List<Persona>> ordenarPersonaPorAppPaterno(List<Persona> listPersonas) {
        return ResponseEntity.ok(personAService.ordenarPersonaPorAppPaterno(listPersonas));
    }
}
