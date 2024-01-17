package pe.com.prueba.rolly.application;

import org.springframework.stereotype.Service;
import pe.com.prueba.rolly.domain.CentroDistribucion;

@Service
public class CentroDistribucionServiceImpl implements CentroDistribucionService {
    @Override
    public String obtenerDescripcionNombre(String centro) {
        for (CentroDistribucion CentroDistribucion : CentroDistribucion.values()) {
            if (CentroDistribucion.name().equalsIgnoreCase(centro)) {
                String nombreCentroPorDescripcion = "SE ENCONTRO CORRECTAMENTE EL DISTRITO CENTRO DE DISTRIBUCION "+   CentroDistribucion.getValue();
                return nombreCentroPorDescripcion;
            }
        }
        return "DISTRITO CENTRO DE DISTRIBUCION NO ENCONTRADO";
    }
}
