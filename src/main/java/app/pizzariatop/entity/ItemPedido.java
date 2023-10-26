package app.pizzariatop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Item item;

    private Integer quantidade;

    private String obsercacao;

    @ManyToMany
    @JoinTable(
        name = "sabor_item",
      joinColumns = @JoinColumn(name = "item_pedido_fk"),
      inverseJoinColumns = @JoinColumn(name = "sabores-fk")
    )
    private Set<Sabores> sabores = new HashSet<>();
}
