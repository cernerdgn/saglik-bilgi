
package com.example.demo.model;


import javax.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Data
@Getter
@Setter

@Entity
@Table(name="klinik")

public class Klinik {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String ad;
    private String adres;
    @OneToMany(mappedBy = "klinik")
    private List<Kurum_Klinik> kurumklinikList;

}


