package org.example;

import java.util.List;

public interface IMetier <T,U>{
    public T save(T o);
    public List<T> getAll();
    public T findOne(U id);
    public void update(T o);
    public void delete(U id);



}
