/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2017 Marc de Verdelhan, 2017-2021 Ta4j Organization & respective
 * authors (see AUTHORS)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.ta4j.core;

/**
 * Listener for BarSeries events.
 * Indicators and other components can subscribe to receive notifications
 * when bars are added or updated.
 */
public interface BarSeriesListener {

    /**
     * Called when a new bar is added to the series.
     * @param index the index of the newly added bar
     * @param bar the bar that was added — allows listeners to compute delta incrementally
     */
    void onBarAdded(int index, Bar bar);

    /**
     * Called when the last bar is replaced/updated (e.g. live tick updating current bar).
     * @param index the index of the replaced bar
     * @param bar the new/updated bar
     */
    default void onBarReplaced(int index, Bar bar) {
        // Default: treat as new bar
        onBarAdded(index, bar);
    }
}
