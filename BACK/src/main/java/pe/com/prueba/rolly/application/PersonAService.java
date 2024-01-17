package pe.com.prueba.rolly.application;

import pe.com.prueba.rolly.domain.Persona;

import java.util.List;

public interface PersonAService {

List<Persona> ordenarListaPorDNI(List<Persona> listaPersona);

List<Persona> ordenarPersonaPorAppPaterno(List<Persona> listaPersona);



}
