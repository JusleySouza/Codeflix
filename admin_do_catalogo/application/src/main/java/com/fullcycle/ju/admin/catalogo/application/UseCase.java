package com.fullcycle.ju.admin.catalogo.application;

import com.fullcycle.ju.admin.catalogo.domain.category.Category;

public abstract class UseCase<IN, OUT> {

    public abstract OUT execute(IN anIn);

}