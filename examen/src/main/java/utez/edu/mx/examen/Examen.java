package utez.edu.mx.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class Examen {

    public static void main(String[] args) {
        SpringApplication.run(Examen.class, args);
    }

    @GetMapping("/mensaje")
    public Mensaje saludar() {
        return new Mensaje("Hola desde mi backend");
    }

    static class Mensaje {
        private String mensaje;

        public Mensaje(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }
    }
}
