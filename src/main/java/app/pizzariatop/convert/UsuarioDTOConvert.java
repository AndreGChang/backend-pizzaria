package app.pizzariatop.convert;


import app.pizzariatop.dto.EnderecoDTO;
import app.pizzariatop.dto.UsuarioDTO;
import app.pizzariatop.entity.Endereco;
import app.pizzariatop.entity.Usuario;
import app.pizzariatop.service.EnderecoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class UsuarioDTOConvert {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EnderecoService enderecoService;


    public UsuarioDTO convertUsuarioToUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = modelMapper.map(usuario, UsuarioDTO.class);


    if (usuarioDTO.getEnderecos() != null) {
        for (int i = 0; i < usuarioDTO.getEnderecos().size(); i++) {
            usuarioDTO.getEnderecos().get(i).setUsuario(usuarioDTO);
        }

    }

//        if(usuario.getEnderecos() != null){
//            usuarioDTO.setEnderecos(usuario.getEnderecos().stream()
//              .map(endereco -> modelMapper.map(endereco, EnderecoDTO.class))
//              .collect(Collectors.toList())
//            );
//        }
//
//        usuario.getEnderecos().forEach(e ->{
//            System.out.println(e.getId() + "Usuario");
//        });
//
//        usuarioDTO.getEnderecos().forEach(a ->{
//            System.out.println(a.getId() + "UsuarioDTO");
//        });

        return usuarioDTO;
    }


    public Usuario convertUsuarioDTOToUsuario(UsuarioDTO usuarioDTO){

        Usuario usuario = modelMapper.map(usuarioDTO, Usuario.class);

        if (usuario.getEnderecos() != null) {
            for (int i = 0; i < usuario.getEnderecos().size(); i++) {

                usuario.getEnderecos().get(i).setUsuario(usuario);
            }

        }

//        if(usuarioDTO.getEnderecos() != null){
//            usuario.setEnderecos(usuario.getEnderecos().stream()
//              .map(enderecoDTO -> modelMapper.map(enderecoDTO, Endereco.class))
//              .collect(Collectors.toList())
//            );
//        }

//        usuario.getEnderecos().forEach(e ->{
//            System.out.println(e.getId() + "Usuario");
//        });
//
//        usuarioDTO.getEnderecos().forEach(a ->{
//            System.out.println(a.getId() + "UsuarioDTO");
//        });

        return usuario;
    }

}
