package za.ac.cput.repository;
/*
    Author: Group 10
    Date: 02 - 04 - 2022
 */

@Deprecated
public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    T delete(T t);
}
