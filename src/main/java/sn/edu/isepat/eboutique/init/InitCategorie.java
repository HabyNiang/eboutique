package sn.edu.isepat.eboutique.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sn.edu.isepat.eboutique.entities.Categorie;
import sn.edu.isepat.eboutique.repositories.CategorieRepository;

@Component
@Order(1)
public class InitCategorie implements CommandLineRunner {
    
    private final CategorieRepository categorieRepository;

    public InitCategorie(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== CRÉATION DE LA CATÉGORIE ===");
        
        Categorie categorie = new Categorie();
        categorie.setNom("ELECTROMENAGER-Haby-Niang");
        categorieRepository.save(categorie);
        
        System.out.println("Catégorie créée: " + categorie.getNom());
        System.out.println("=== FIN ===");
    }
}
