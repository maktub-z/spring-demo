package cn.osxm.ssmi.chp04.methodinj;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class NewEraPeople implements MethodReplacer {
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        String inputParam = (String)objects[0];
        System.out.println("传入参数：" + inputParam);
        String newStr = inputParam + "在新时代吃肉";
        System.out.println("替换返回新的字符串或对象");
        return newStr;
    }
}
