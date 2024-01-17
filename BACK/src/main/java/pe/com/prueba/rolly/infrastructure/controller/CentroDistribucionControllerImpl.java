package pe.com.prueba.rolly.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pe.com.prueba.rolly.application.CentroDistribucionService;

@RestController
public class CentroDistribucionControllerImpl implements CentroDistribucionController {

    private final CentroDistribucionService centroDistribucionService;

    public CentroDistribucionControllerImpl(CentroDistribucionService centroDistribucionService) {
        this.centroDistribucionService = centroDistribucionService;
    }

    @Override
    public ResponseEntity<String> obtenerCentroDistribucion(String centroDistribucion) {
        return  ResponseEntity.ok(centroDistribucionService.obtenerDescripcionNombre(centroDistribucion));
    }
}
