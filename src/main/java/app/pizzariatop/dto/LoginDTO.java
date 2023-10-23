package app.pizzariatop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {

    private Long id;

    private String email;

    private String senha;

    private UsuarioDTO usuarioDTO;

    public LoginDTO(){

    }

    public LoginDTO(Long id, String email, String senha, UsuarioDTO usuarioDTO) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.usuarioDTO = usuarioDTO;
    }
}
