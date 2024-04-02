package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunMethod {
    //int value();//不给默认值必须手动在标注后面写value = 3,（int）,,value写type等时，类中也需要改变
    int value() default 1;//给默认值后类中可以直接写数值
    String name() default "null";

}
