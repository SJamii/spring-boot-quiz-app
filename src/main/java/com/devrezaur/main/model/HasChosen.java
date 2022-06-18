package com.devrezaur.main.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="choosen")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HasChosen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quesId;
    private int chose;
}
