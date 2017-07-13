package cn.dylan.type;

import java.lang.annotation.*;

/**
 * Created by yuhp@terminus.io on 2017/7/13.
 * Desc: 用于标记 TypeHandler
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MappedTypes {
    Class<?>[] value();
}
