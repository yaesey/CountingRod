package CountingRod.core.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoadingConfig {
    /**
     * Write the modules you need to depend on here.
     *
     * 这里写上你需要依赖的模块
     * @return
     */
    Module[] dependOn();
}
