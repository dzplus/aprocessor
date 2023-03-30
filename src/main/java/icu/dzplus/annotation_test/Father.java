package icu.dzplus.annotation_test; // PackageElement

import java.io.Serializable;

public class Father implements Serializable {// TypeElement
    int a;           // VariableElement

    Father() {
        // ExecutableElement
    }

    void setA(int newA/*VariableElement*/) {
        // ExecutableElement
    }
}