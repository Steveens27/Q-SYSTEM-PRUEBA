package pe.com.prueba.rolly.application;

import org.springframework.stereotype.Service;

@Service
public class OperacionesService {

    Operacion suma = Suma();
    Operacion resta = Resta();
    Operacion multiplicacion  = Multiplicacion();

    public Operacion Suma() {
        return (a, b) -> a + b;
    }
    public Operacion Resta() {
        return (a, b) -> a - b;
    }

    public Operacion Multiplicacion() {
        return (a, b) -> a * b;
    }

    public int performOperation(int a, int b, Operacion operation) {
        return operation.Operacion(a, b);
    }

    public void showResult(String operation, int result) {
        System.out.println("Resultado " + operation + ": " + result);
    }

}
