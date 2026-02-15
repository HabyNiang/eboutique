package sn.edu.isepat.eboutique.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sn.edu.isepat.eboutique.entities.Categorie;
import sn.edu.isepat.eboutique.entities.ProduitHabyNiang;
import sn.edu.isepat.eboutique.repositories.CategorieRepository;
import sn.edu.isepat.eboutique.repositories.ProduitHabyNiangRepository;

@Component
@Order(2)
public class InitProduitHabyNiang implements CommandLineRunner {
    
    private final ProduitHabyNiangRepository produitRepository;
    private final CategorieRepository categorieRepository;

    public InitProduitHabyNiang(ProduitHabyNiangRepository produitRepository, 
                                 CategorieRepository categorieRepository) {
        this.produitRepository = produitRepository;
        this.categorieRepository = categorieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== CRÉATION DU PRODUIT ===");
        
        // Récupérer la catégorie créée plus tôt
        Categorie categorie = categorieRepository.findByNom("ELECTROMENAGER-Haby-Niang");
        
        // Créer un produit
        ProduitHabyNiang produit = new ProduitHabyNiang();
        produit.setNom("Réfrigérateur Samsung");
        produit.setDescription("Réfrigérateur 300L Inox");
        produit.setPrix(350000.0);
        produit.setQuantiteStock(15);
        produit.setCategorie(categorie);
        
        // Sauvegarder
        produitRepository.save(produit);
        
        System.out.println("Produit créé: " + produit.getNom());
        System.out.println("Catégorie associée: " + produit.getCategorie().getNom());
        System.out.println("=== FIN ===");
    }
}
