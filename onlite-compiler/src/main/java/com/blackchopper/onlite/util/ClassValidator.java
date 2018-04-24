package com.blackchopper.onlite.util;

import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;

/**
 * author  : Black Chopper
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/BlackChopper
 * project : OnLite
 */
public class ClassValidator {
    public static boolean isPrivate(Element element) {
        return element.getModifiers().contains(Modifier.PRIVATE);
    }

    public static String getClassName(Element type, String packageName) {
        int packageLen = packageName.length() + 1;
        return ((TypeElement) type).getQualifiedName().toString().substring(packageLen).replace('.', '$');
    }
}
