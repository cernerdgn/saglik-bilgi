
package com.example.demo.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Table(name="hekim_kurum")
@Data
@Getter
@Setter
@Entity

public class Hekim_Kurum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date bitis_tarihi;
    @ManyToOne
    @JoinColumn(name="fk_kurum_id ")
    private Kurum kurum_id;
    @ManyToOne
    @JoinColumn(name="fk_klinik_id ")
    private Klinik klinik_id;
}

