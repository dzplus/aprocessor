package icu.dzplus.annotation_test;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) {
        // 打印父类注解信息
        Annotation[] fatherAnnotations = Father.class.getAnnotations();
        System.out.println("父类注解个数：" + fatherAnnotations.length);
        for (Annotation fa : fatherAnnotations) {
            System.out.println(fa.annotationType().getSimpleName());
        }
        // 打印子类注解信息
        Annotation[] childAnnotations = Son.class.getAnnotations();
        System.out.println("子类注解个数：" + childAnnotations.length);
        for (Annotation ca: childAnnotations) {
            System.out.println(ca.annotationType().getSimpleName());
        }
    }
}