package cn.dylan.type;

import cn.dylan.lang.UsesJava8;

import java.time.*;

/**
 * Created by yuhp@terminus.io on 2017/7/13.
 * Desc:
 */
@UsesJava8
public class Java8TypeHandlersRegistrar {

    public static void registerDateAndTimeHandlers(TypeHandlerRegistry registry) {
        registry.register(Instant.class, InstantTypeHandler.class);
        registry.register(LocalDateTime.class, LocalDateTimeTypeHandler.class);
        registry.register(LocalDate.class, LocalDateTypeHandler.class);
        registry.register(LocalTime.class, LocalTimeTypeHandler.class);
        registry.register(OffsetDateTime.class, OffsetDateTimeTypeHandler.class);
        registry.register(OffsetTime.class, OffsetTimeTypeHandler.class);
        registry.register(ZonedDateTime.class, ZonedDateTimeTypeHandler.class);
        registry.register(Month.class, MonthTypeHandler.class);
        registry.register(Year.class, YearTypeHandler.class);
        registry.register(YearMonth.class, YearMonthTypeHandler.class);
    }

}
