package de.aittr.bd1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "card")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="number")
    private String number;
    @Column(name="owner")
    private String owner;

    @Convert(converter = CardTypeConverter.class)
    @Column(name="cardType")
    private CardType cardType;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;

}
