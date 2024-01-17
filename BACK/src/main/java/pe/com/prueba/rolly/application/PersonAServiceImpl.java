package pe.com.prueba.rolly.application;

import org.springframework.stereotype.Service;
import pe.com.prueba.rolly.domain.Persona;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonAServiceImpl implements PersonAService {


    @Override
    public List<Persona> ordenarListaPorDNI(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .sorted(Comparator.comparing(Persona::getDni))
                .collect(Collectors.toList());
    }
/* se agrega el toLowerCase para que pueda comparar en minuscula , porque al comparar con mayuscula sale error
*  en la comparacion*/
    @Override
    public List<Persona> ordenarPersonaPorAppPaterno(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .sorted(Comparator.comparing(persona -> persona.getAppPaterno().toLowerCase()))
                .collect(Collectors.toList());
    }
}
