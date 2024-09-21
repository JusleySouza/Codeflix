package com.fullcycle.ju.admin.catalogo.application.category.retrieve.list;

import com.fullcycle.ju.admin.catalogo.application.UseCase;
import com.fullcycle.ju.admin.catalogo.domain.category.CategorySearchQuery;
import com.fullcycle.ju.admin.catalogo.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> { }
