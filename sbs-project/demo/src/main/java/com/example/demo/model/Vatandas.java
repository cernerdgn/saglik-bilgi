package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name="vatandas")
@Data
@Getter
@Setter

@Entity

public class Vatandas {


   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;
    private String ad;
    private String soyad;
    private Integer tc;
    private String dogum_tarihi;
    private String Cinsiyet;
    @OneToMany(mappedBy = "vatandas")
    private List<Hasta> hastaList;
    @OneToMany(mappedBy = "vatandas")
    private List<Hekim> hekimList;



}
