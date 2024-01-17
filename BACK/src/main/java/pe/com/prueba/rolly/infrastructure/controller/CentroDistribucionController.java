package pe.com.prueba.rolly.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "api/v1/centroDistribucionService")
public interface CentroDistribucionController {

    @GetMapping(value = "/obtenerCentroDistribucion")
    ResponseEntity<String> obtenerCentroDistribucion(@RequestParam String centroDistribucion);
}
