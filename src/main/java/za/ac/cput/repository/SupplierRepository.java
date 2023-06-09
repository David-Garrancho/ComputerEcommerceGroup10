package za.ac.cput.repository;

import za.ac.cput.domain.Supplier;

import java.util.Set;
/*
    Author: Ethan Botes
    This is SupplierRepository
    Date: 02 - 04 - 2022
 */
public interface SupplierRepository {
    public Set<Supplier> getAll();
}
