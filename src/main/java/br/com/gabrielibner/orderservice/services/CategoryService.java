package br.com.gabrielibner.orderservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.gabrielibner.orderservice.entities.Category;
import br.com.gabrielibner.orderservice.repositories.CategoryRepository;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
