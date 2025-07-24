package com.ijse.sams.sams.dao;

import java.util.ArrayList;

public interface CrudDao<T ,ID> extends SuperDao {
    public boolean save(T t)throws Exception;
    public boolean update(T t) throws Exception;
    public boolean delete(ID id) throws Exception;
    public T search(ID id) throws Exception;
    public ArrayList<T> getAll() throws Exception;
}
