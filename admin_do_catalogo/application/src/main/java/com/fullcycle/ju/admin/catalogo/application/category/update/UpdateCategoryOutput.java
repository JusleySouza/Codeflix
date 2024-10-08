package com.fullcycle.ju.admin.catalogo.application.category.update;

import com.fullcycle.ju.admin.catalogo.application.category.create.CreateCategoryOutput;
import com.fullcycle.ju.admin.catalogo.domain.category.Category;
import com.fullcycle.ju.admin.catalogo.domain.category.CategoryID;

public record UpdateCategoryOutput(
        CategoryID id
) {

    public static UpdateCategoryOutput from(final Category aCategory){
        return new UpdateCategoryOutput(aCategory.getID());
    }
}
