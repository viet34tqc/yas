package com.yas.order.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contactName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String zipCode;
    private Long districtId;
    private Long stateOrProvinceId;
    private Long countryId;
    @OneToOne(mappedBy = "billingAddressId")
    private Order billingOrderId;

    @OneToOne(mappedBy = "shippingAddressId")
    private Order shippingOrderId;
}
