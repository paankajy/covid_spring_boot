package com.covid.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "covid_19_india")
@Data
public class CovidData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;

    private String date;
    private String time;
    private String state;
    private Integer indian;
    private Integer foreigner;
    private Integer cured;
    private Integer deaths;
    private Integer confirmed;




}
