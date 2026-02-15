package sn.edu.isepat.eboutique.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProduitHabyNiang {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nom;
    
    private String description;
    
    private Double prix;
    
    private Integer quantiteStock;
    
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}
