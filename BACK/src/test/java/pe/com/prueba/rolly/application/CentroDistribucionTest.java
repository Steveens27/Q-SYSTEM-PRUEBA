package pe.com.prueba.rolly.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pe.com.prueba.rolly.domain.CentroDistribucion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CentroDistribucionTest {

     private CentroDistribucionService centroDistribucionService;

    @BeforeEach
    public void setUp() {
        centroDistribucionService = new CentroDistribucionServiceImpl();
        System.out.println("Inicializacion");
    }


    @Test
    void TestObtenerDescripcionNombre() {

        CentroDistribucion[] mockCentroDistribucions = {
                CentroDistribucion.LURIN,
                CentroDistribucion.ICA,
                CentroDistribucion.TRUJILLO,
                CentroDistribucion.HUANUCO
        };
        mockStatic(CentroDistribucion.class);
        when(CentroDistribucion.values()).thenReturn(mockCentroDistribucions);

        String Centro1 = centroDistribucionService.obtenerDescripcionNombre("LURIN");
        assertEquals("SE ENCONTRO CORRECTAMENTE EL DISTRITO CENTRO DE DISTRIBUCION LURIN", Centro1);

        String Centro2 = centroDistribucionService.obtenerDescripcionNombre("LURIN");
        assertEquals("SE ENCONTRO CORRECTAMENTE EL DISTRITO CENTRO DE DISTRIBUCION LURIN", Centro2);

        String Centro3 = centroDistribucionService.obtenerDescripcionNombre("LURIN");
        assertEquals("SE ENCONTRO CORRECTAMENTE EL DISTRITO CENTRO DE DISTRIBUCION LURIN", Centro3);

        String Centro4 = centroDistribucionService.obtenerDescripcionNombre("LURIN");
        assertEquals("SE ENCONTRO CORRECTAMENTE EL DISTRITO CENTRO DE DISTRIBUCION LURIN", Centro4);

        String Centro5 = centroDistribucionService.obtenerDescripcionNombre("HUACHO");
        assertEquals("DISTRITO CENTRO DE DISTRIBUCION NO ENCONTRADO", Centro5);

        verify(CentroDistribucion.class, times(1));
        CentroDistribucion.values();
    }
}
