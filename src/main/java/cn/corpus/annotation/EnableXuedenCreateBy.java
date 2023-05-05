package cn.corpus.annotation;

import cn.corpus.annotation.generation.CreationCreateByGeneration;
import org.hibernate.annotations.ValueGenerationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**功能描述：自动填充创建者ID
 * @version:1.0
 */
@ValueGenerationType(
        generatedBy = CreationCreateByGeneration.class
)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface EnableXuedenCreateBy {
}
