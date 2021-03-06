package com.devrezaur.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devrezaur.main.model.HasChosen;

@Repository
public interface ChooseRepo extends JpaRepository<HasChosen, Integer> {

}
