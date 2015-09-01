package cn.petech.ws2.domain.shared;


import java.io.Serializable;
import java.util.List;

public interface GenericRepository <T,PK extends Serializable> {


    List<T> getAll();


    List<T> getAllDistinct();



    T get(PK id);


    boolean exists(PK id);


    T save(T object);



    void remove(T object);


    void remove(PK id);



}
