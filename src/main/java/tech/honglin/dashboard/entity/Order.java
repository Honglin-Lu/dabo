package tech.honglin.dashboard.entity;

import lombok.Data;
import tech.honglin.dashboard.base.OrderStatus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal totalPrice;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    public Customer getCustomer() { return customer;}

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;


    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ")
    private LocalDateTime created_at = LocalDateTime.now();

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ")
    private LocalDateTime updated_at = LocalDateTime.now();

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "orders_products",
               joinColumns = {
                    @JoinColumn(name = "order_id", referencedColumnName = "id",
                    nullable = false, updatable = false)},
               inverseJoinColumns = {
                    @JoinColumn(name = "product_id", referencedColumnName = "id",
                    nullable = false, updatable = false)})
    private Set<Product> products = new HashSet<>();


}

