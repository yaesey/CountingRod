package CountingRod.core.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Module {
    /**
     * Your module name
     * A example : "LaTeXLoader". allow case but can't has any space
     *
     * But remember, CountingRod is use module <b>id</b> to manage
     * module <b>not module name</b>,if you didn't set your module
     * id, as you see, we will convert uppercase letters of
     * name to id as lowercase.
     *
     * 你的模块名称
     * 一个例子是 ： "LaTex Loader" 。允许大小写但不能有空格
     *
     * 但是请记住：CountingRod 是使用模块的 <b<>id</> 来管理模块<b>而不是
     * 模块名</b>， 如果你未设定你的模块 id ，那么我们将会将 Name 强制小写作为id
     */
    String moduleName() default "";

    String moduleID() default "";

    String version() default "1.0";

    @interface Loader {
        String dependOn();
        String loadAfter();

        String loadFirst();
    }
}
