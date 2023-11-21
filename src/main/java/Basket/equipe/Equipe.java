package Basket.equipe;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipe")
public class Equipe {
    
    @Id
    private Long id;
    private String nom;


    public Equipe()
    {

    }

    public Equipe(Long id, String nom)
    {
        setId(id);
        setNom(nom);
    }

    public Equipe(String nom)
    {
        setNom(nom);
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

}
