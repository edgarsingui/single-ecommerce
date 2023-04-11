package com.single_ecomerce.single_ecomerce.models;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    private String slug;
    private String image;

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug){this.slug = slug;}
    public String getSlug(){return slug;}

    public void setImage(String image){this.image = image;}
    public String getImage(){return image;}

}