package org.factoriaf5.digital_academy.funko_shop.address;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

import org.factoriaf5.digital_academy.funko_shop.profile.Profile;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shipping_address")
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private long id;
    @NonNull
    private String street;
    @NonNull
    private String city;
    @NonNull
    private String region;
    @NonNull
    private String postalCode;
    @NonNull
    private String country;

    @OneToOne
    @JoinColumn(name = "profile_id", referencedColumnName = "profile_id", nullable = false)
    private Profile profile;

}
