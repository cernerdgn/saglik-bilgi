
package com.example.demo.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name="kurum")
@Data
@Getter
@Setter

@Entity

public class Kurum {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String ad;
    private String adres;
    @OneToMany(mappedBy = "kurum")
    private List<Kurum_Klinik> kurumklinikList;


}
