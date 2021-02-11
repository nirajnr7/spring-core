package com.refrenceObjUsingBean;

public class B {
    private int y;
    private A aobj;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public A getAobj() {
        return aobj;
    }

    public void setAobj(A aobj) {
        this.aobj = aobj;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                ", aobj=" + aobj +
                '}';
    }
}
