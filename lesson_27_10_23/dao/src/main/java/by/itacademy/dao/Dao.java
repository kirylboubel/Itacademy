package by.itacademy.dao;

public interface Dao<T> {
    Integer create(T model) throws DaoException;

    T read(Integer id) throws DaoException;
}
