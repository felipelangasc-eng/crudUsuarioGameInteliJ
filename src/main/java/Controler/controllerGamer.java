package Controler;

import Service.serviceGamer;
import com.example.crudUsuarioGameInteliJ.Model.modelGamer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/perfil")
@RequiredArgsConstructor

public class controllerGamer {




        private final serviceGamer service;
        // GET /pessoas — lista todas (era case 2 no menu)
        @GetMapping
        public List<modelGamer.Gamer> listar() {
            return service.listar();
        }
        // GET /pessoas/{id} — busca por ID
        @GetMapping("/{id}")
        public ResponseEntity<modelGamer.Gamer> buscar(@PathVariable Long id) {
            return ResponseEntity.ok(service.buscarPorId(id));
        }
        // POST /pessoas — insere (era case 1 no menu)
        @PostMapping
        public ResponseEntity<modelGamer.Gamer> salvar(@RequestBody modelGamer.Gamer gamer) {
            return ResponseEntity.ok(service.salvar(gamer));
        }
        // PUT /pessoas/{id} — atualiza (era case 3 no menu)
        @PutMapping("/{id}")
        public ResponseEntity<modelGamer.Gamer> atualizar(
                @PathVariable Long id, @RequestBody modelGamer.Gamer dados) {
            return ResponseEntity.ok(service.atualizar(id, dados));
        }
        // DELETE /pessoas/{id} — exclui (era case 4 no menu)
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> excluir(@PathVariable Long id) {
            return ResponseEntity.noContent().build();
        }
    }

