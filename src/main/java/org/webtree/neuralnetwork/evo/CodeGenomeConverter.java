package org.webtree.neuralnetwork.evo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Levicky
 */
public class CodeGenomeConverter {
    public DNA codeToDNA(String code) {
        Map<Integer, Integer> fragments = new HashMap();
        for (String fragment : CodeFragmentsHolder.getInst().getFragments()) {

        }
        DNA dna = new DNA();

        return dna;
    }

    public String code(DNA dna) {
        return "";
    }
}
