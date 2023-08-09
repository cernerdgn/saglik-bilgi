package com.example.demo.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Table(name="kurum_klinik")
@Data
@Getter
@Setter

@Entity


public class Kurum_Klinik {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private boolean aktif;
    private Date bitis_tarihi;
    @ManyToOne
    @JoinColumn(name= "fk_kurum_id ")
    private Kurum kurum;
    @ManyToOne
    @JoinColumn(name= "fk_klinik_id ")
    private Klinik klinik;


}
