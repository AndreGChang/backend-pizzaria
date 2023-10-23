package app.pizzariatop.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class UsuarioDTO {

    private Long id;

    private String nome;

    private String telefone;

    private String cpf;

    @JsonIgnoreProperties("usuario")
    private List<EnderecoDTO> enderecos;

    public UsuarioDTO(){

    }

    public UsuarioDTO( Long id, String nome, String telefone, String cpf) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }
}
