package cn.dylan.annotations;

import cn.dylan.type.JdbcType;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yuhp@terminus.io on 2017/6/29.
 * Desc:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({})
public @interface Arg {

    boolean id() default false;

    String column() default "";

    Class<?> javaType() default void.class;

    JdbcType jdbcType() default JdbcType.UNDEFINED;

}
