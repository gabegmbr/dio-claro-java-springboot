package dio.my_first_web_api.controller;
import dio.my_first_web_api.model.Usuario;
import dio.my_first_web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return usuarioRepository.listAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(String username){
        return usuarioRepository.findByUsername(username);
    }
}
