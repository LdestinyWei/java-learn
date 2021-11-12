package com.lwkit;

public enum EnumMonkeyKing {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + '@' + hashCode();
    }
}
