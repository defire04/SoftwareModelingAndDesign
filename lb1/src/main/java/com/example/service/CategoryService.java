package com.example.service;

import com.example.model.Category;
import com.example.repository.BaseRepository;

import java.util.List;

public class CategoryService {
    private final BaseRepository<Category> categoryBaseRepository;

    public CategoryService(BaseRepository<Category> CategoryBaseRepository) {
        this.categoryBaseRepository = CategoryBaseRepository;
    }

    public void addItemToDb(Category Category) {
        categoryBaseRepository.addItemToDb(Category);
    }


    public void addItemsToDb(List<Category> CategoryList) {
        categoryBaseRepository.addItemsToDb(CategoryList);
    }


    public Category getById(int id) {
        return categoryBaseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found!"));
    }


}
