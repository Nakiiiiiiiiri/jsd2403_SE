package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//ElementType.TYPE可以用在类上
//ElementType.FIELD 可以用在属性上
@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)//让反射能反射到 .CLASS不让用，.SOURCE,变成class时不让用
public @interface AutoRunClass {

}
