package de.kneitzel.entity;

import java.util.*;

/**
 * List of addresses.
 */
public class AddressList {

    /**
     * List of all known Addresses.
     */
    private List<Address> addresses = new ArrayList<>();

    /**
     * Finds an address by id.
     * @param id Id to look for.
     * @return Optional Address.
     */
    public Optional<Address> findById(final UUID id) {
        return addresses.stream().filter(a -> a.getId() == id).findAny();
    }

    /**
     * Finds an address by name.
     * @param name Name to look for.
     * @return Optional Address.
     */
    public Optional<Address> findByName(final String name) {
        return addresses.stream().filter(a -> Objects.equals(a.getName(), name)).findAny();
    }

    /**
     * Saves an address.
     * @param address Address to add.
     */
    public void save(final Address address) {
        Optional<Address> existent = findById(address.getId());
        if (existent.isPresent()) {
            delete(existent.get());
        }
        addresses.add(address);
    }

    /**
     * Deletes an address.
     * @param address address to delete.
     */
    public void delete(final Address address) {
        addresses.remove(address);
    }

    /**
     * Gets all known addresses.
     * @return List with all known addresses.
     */
    public List<Address> getAddresses() { return new ArrayList<Address>(addresses); }
}
