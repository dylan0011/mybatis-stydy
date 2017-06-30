package cn.dylan.session;

import cn.dylan.io.VFS;
import cn.dylan.logging.Log;
import cn.dylan.mapping.Environment;
import cn.dylan.type.JdbcType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuhp@terminus.io on 2017/6/30.
 * Desc:
 */
public class Configuration {
    protected Environment environment;


    protected boolean safeRowBoundsEnabled; //允许在嵌套语句中使用分页（RowBounds）。 If allow, set the false.
    protected boolean safeResultHandlerEnabled = true; //允许在嵌套语句中使用分页（ResultHandler）。 If allow, set the false.
    protected boolean mapUnderscoreToCamelCase;//是否开启自动驼峰命名规则（camel case）映射，即从经典数据库列名 A_COLUMN 到经典 Java 属性名 aColumn 的类似映射。
    protected boolean aggressiveLazyLoading; //当开启时，任何方法的调用都会加载该对象的所有属性。否则，每个属性会按需加载（参考lazyLoadTriggerMethods).

    protected boolean multipleResultSetsEnabled = true; //是否允许单一语句返回多结果集（需要兼容驱动）。
    protected boolean useGeneratedKeys; //允许 JDBC 支持自动生成主键，需要驱动兼容。 如果设置为 true 则这个设置强制使用自动生成主键，尽管一些驱动不能兼容但仍可正常工作（比如 Derby）。
    protected boolean useColumnLabel = true; //使用列标签代替列名。不同的驱动在这方面会有不同的表现， 具体可参考相关驱动文档或通过测试这两种不同的模式来观察所用驱动的结果。
    protected boolean cacheEnabled = true; //该配置影响的所有映射器中配置的缓存的全局开关。

    protected boolean callSettersOnNulls; //指定当结果集中值为 null 的时候是否调用映射对象的 setter（map 对象时为 put）方法，这对于有 Map.keySet() 依赖或 null 值初始化的时候是有用的。注意基本类型（int、boolean等）是不能设置成 null 的。
    protected boolean useActualParamName = true; //允许使用方法签名中的名称作为语句参数名称。 为了使用该特性，你的工程必须采用Java 8编译，并且加上-parameters选项。（从3.4.1开始）
    protected boolean returnInstanceForEmptyRow; //当返回行的所有列都是空时，MyBatis默认返回null。 当开启这个设置时，MyBatis会返回一个空实例。 请注意，它也适用于嵌套的结果集 (i.e. collectioin and association)。（从3.4.2开始）



    protected String logPrefix; //指定 MyBatis 增加到日志名称的前缀
    protected Class <? extends Log> logImpl;
    protected Class <? extends VFS> vfsImpl;
    protected LocalCacheScope localCacheScope = LocalCacheScope.SESSION;
    protected JdbcType jdbcTypeForNull = JdbcType.OTHER;
    protected Set<String> lazyLoadTriggerMethods = new HashSet<String>(Arrays.asList(new String[] { "equals", "clone", "hashCode", "toString" }));
    protected Integer defaultStatementTimeout;
    protected Integer defaultFetchSize;
//    protected ExecutorType defaultExecutorType = ExecutorType.SIMPLE;
//    protected AutoMappingBehavior autoMappingBehavior = AutoMappingBehavior.PARTIAL;
//    protected AutoMappingUnknownColumnBehavior autoMappingUnknownColumnBehavior = AutoMappingUnknownColumnBehavior.NONE;


}
