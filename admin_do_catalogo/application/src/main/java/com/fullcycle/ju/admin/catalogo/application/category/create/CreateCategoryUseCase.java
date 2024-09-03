package com.fullcycle.ju.admin.catalogo.application.category.create;

import com.fullcycle.ju.admin.catalogo.application.UseCase;
import com.fullcycle.ju.admin.catalogo.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
