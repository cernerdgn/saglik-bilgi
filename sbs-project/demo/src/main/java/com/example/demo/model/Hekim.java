
package com.example.demo.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Table(name="hekim")
@Data
@Getter
@Setter


@Entity

public class Hekim {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
    private Date baslama_tarihi;
    private Date bitis_tarihi;
    private boolean aktif;
    @ManyToOne
    @JoinColumn(name="fk_vatandas_id")
    private Vatandas vatandas;




}
