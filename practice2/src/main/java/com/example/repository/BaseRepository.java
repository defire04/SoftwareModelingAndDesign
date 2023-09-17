package com.example.repository;

import com.example.model.BaseEntity;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class BaseRepository<E extends BaseEntity> {

    private final List<E> list = new ArrayList<>();

    public void addItemToDb(E entity) {
        list.add(entity);
    }
    public void addItemsToDb(List<E> items) {
        list.addAll(items);
    }

    public Optional<E> findById(long id) {
        return list.stream().filter(entity -> entity.getId() == id).findFirst();
    }


}
