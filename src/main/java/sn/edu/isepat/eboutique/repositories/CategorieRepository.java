package sn.edu.isepat.eboutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isepat.eboutique.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    Categorie findByNom(String nom);
}
