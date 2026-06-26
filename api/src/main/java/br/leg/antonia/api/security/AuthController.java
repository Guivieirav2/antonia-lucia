package br.leg.antonia.api.security;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> body) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(body.get("email"), body.get("senha"))
            );
            String token = jwtUtil.gerarToken(body.get("email"));
            Usuario usuario = usuarioRepository.findByEmail(body.get("email")).get();
            return ResponseEntity.ok(Map.of(
                    "token", token,
                    "nome", usuario.getNome(),
                    "perfil", usuario.getPerfil()
            ));
        } catch (AuthenticationException e) {
            return ResponseEntity.status(401).body(Map.of("erro", "Email ou senha inválidos"));
        }
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody Usuario usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().body(Map.of("erro", "Email já cadastrado"));
        }
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        if (usuario.getPerfil() == null) usuario.setPerfil("EDITOR");
        usuarioRepository.save(usuario);
        return ResponseEntity.ok(Map.of("mensagem", "Usuário cadastrado com sucesso"));
    }
}