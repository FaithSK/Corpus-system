package cn.corpus.annotation;

import cn.corpus.annotation.generation.CreationUpdateByGeneration;
import org.hibernate.annotations.ValueGenerationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version:1.0
 */
@ValueGenerationType(
        generatedBy = CreationUpdateByGeneration.class
)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface EnableXuedenUpdateBy {
}
