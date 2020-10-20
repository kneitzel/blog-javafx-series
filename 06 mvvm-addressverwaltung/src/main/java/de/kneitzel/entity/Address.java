package de.kneitzel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * A simple Address.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    /**
     * id of the Address.
     */
    private UUID id = UUID.randomUUID();

    /**
     * Name.
     */
    private String name;

    /**
     * Street
     */
    private String street;

    /**
     * Postcode.
     */
    private String postCode;

    /**
     * City
     */
    private String city;
}
