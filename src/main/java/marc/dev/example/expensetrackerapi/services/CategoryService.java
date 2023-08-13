package marc.dev.example.expensetrackerapi.services;

import marc.dev.example.expensetrackerapi.entities.Category;
import marc.dev.example.expensetrackerapi.exceptions.EtBadRequestException;
import marc.dev.example.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);
    Category fetchCategoryById(Integer userId,Integer categoryId)  throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId,Integer categoryId,Category category) throws EtBadRequestException;
    void removeCategoryWithAllTransactions(Integer userId,Integer categoryId) throws  EtResourceNotFoundException;

}



