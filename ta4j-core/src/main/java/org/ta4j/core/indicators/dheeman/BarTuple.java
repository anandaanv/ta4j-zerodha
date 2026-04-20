//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ta4j.core.indicators.dheeman;

import org.ta4j.core.Bar;

public class BarTuple {
    private int index;
    private Bar bar;

    public int getIndex() {
        return this.index;
    }

    public Bar getBar() {
        return this.bar;
    }

    public BarTuple(int index, Bar bar) {
        this.index = index;
        this.bar = bar;
    }
}
