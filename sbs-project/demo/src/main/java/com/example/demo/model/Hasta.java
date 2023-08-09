
package com.example.demo.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

@Entity
@Table(name = "hasta")


public class Hasta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean aktif;
    @ManyToOne
    @JoinColumn(name="fk_vatandas_id")
    private Vatandas vatandas;



}
