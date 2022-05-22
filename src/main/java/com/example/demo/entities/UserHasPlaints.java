package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserHasPlaints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "plaintID")
    private Plaint plaint;
    @ManyToOne
    @JoinColumn(name = "plaintID")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "traitID")
    private Traited traited;
}
