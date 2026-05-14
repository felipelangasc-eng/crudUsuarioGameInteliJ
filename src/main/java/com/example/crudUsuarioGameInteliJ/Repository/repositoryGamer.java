package com.example.crudUsuarioGameInteliJ.Repository;

import com.example.crudUsuarioGameInteliJ.Model.modelGamer;
import org.springframework.data.jpa.repository.JpaRepository;

public class repositoryGamer {
    public interface GamerRepository extends JpaRepository<Model.modelGamer, Long> {
    }

}