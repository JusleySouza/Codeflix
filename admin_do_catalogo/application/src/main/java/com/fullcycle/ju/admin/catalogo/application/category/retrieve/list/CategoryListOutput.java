package com.fullcycle.ju.admin.catalogo.application.category.retrieve.list;

import com.fullcycle.ju.admin.catalogo.application.category.retrieve.get.CategoryOutput;
import com.fullcycle.ju.admin.catalogo.domain.category.Category;
import com.fullcycle.ju.admin.catalogo.domain.category.CategoryID;

import java.time.Instant;

public record CategoryListOutput(
        CategoryID id,
        String name,
        String description,
        boolean isActive,
        Instant createdAt,
        Instant deletedAt
) {

    public static CategoryListOutput from(final Category aCategory){
        return new CategoryListOutput(
                aCategory.getId(),
                aCategory.getName(),
                aCategory.getDescription(),
                aCategory.isActive(),
                aCategory.getCreatedAt(),
                aCategory.getDeletedAt()
        );
    }

}
