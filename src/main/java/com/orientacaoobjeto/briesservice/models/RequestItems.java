package com.orientacaoobjeto.briesservice.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="requests_items")
public class RequestItems implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "requests_id", referencedColumnName = "id")
    private Request request;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "items_id", referencedColumnName = "id")
    private Item item;

    @NotNull
    @Column(name="amount")
    private Integer amount;
}
