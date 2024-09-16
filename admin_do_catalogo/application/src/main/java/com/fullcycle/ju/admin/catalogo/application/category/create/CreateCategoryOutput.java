package com.fullcycle.ju.admin.catalogo.application.category.create;

import com.fullcycle.ju.admin.catalogo.domain.category.Category;
import com.fullcycle.ju.admin.catalogo.domain.category.CategoryID;

public record CreateCategoryOutput(
        CategoryID id
) {

    public static CreateCategoryOutput from(final Category aCategory){
        return new CreateCategoryOutput(aCategory.getID());
    }

}