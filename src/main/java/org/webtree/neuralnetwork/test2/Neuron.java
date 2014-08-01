package org.webtree.neuralnetwork.test2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim
 */
public class Neuron {
    public Map<Integer, HistoryItem> history = new HashMap<>();
    public int[] availableOut;
    public int[] in;

    public void in(int value) {

    }

    protected void out(int value, int targetId) {

    }

    protected int choiceOut(int value) {
        return 0;
    }
}
