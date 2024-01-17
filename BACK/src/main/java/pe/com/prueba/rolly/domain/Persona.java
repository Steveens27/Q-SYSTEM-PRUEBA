package pe.com.prueba.rolly.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Persona {
    @JsonProperty("dni")
    private String dni;
    @JsonProperty("appMaterno")
    private String appMaterno;
    @JsonProperty("appPaterno")
    private String appPaterno;
}
