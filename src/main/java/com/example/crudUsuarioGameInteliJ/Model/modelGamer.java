package com.example.crudUsuarioGameInteliJ.Model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "perfil")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class modelGamer {



        @Id
        @GeneratedValue(
                strategy=GenerationType.IDENTITY)
        private Long id;
        private String nickname;
        private Integer nivel;
        private String email;
        private String jogoFavorito;
    }





