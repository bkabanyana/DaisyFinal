package com.example.daisy.control;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Manufacture {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer Man_Id;
        @Column(nullable = false, length = 40)
        String Man_name;

        public String getMan_name() {
                return Man_name;
        }
}


