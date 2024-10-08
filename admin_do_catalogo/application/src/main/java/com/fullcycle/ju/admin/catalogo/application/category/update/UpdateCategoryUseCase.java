package com.fullcycle.ju.admin.catalogo.application.category.update;

import com.fullcycle.ju.admin.catalogo.application.UseCase;
import com.fullcycle.ju.admin.catalogo.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase extends UseCase<UpdateCategoryCommand, Either<Notification,UpdateCategoryOutput >> {
}
