package org.webtree.neuralnetwork.evo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;

/**
 * @author Maxim Levicky
 */
public class CodeFragmentsHolder {
    private static final CodeFragmentsHolder inst = new CodeFragmentsHolder();
    private List<String> fragments;
    private static final String persistFilePath = "fragments.out";

    public CodeFragmentsHolder() {
        loadFragments();
    }

    public static CodeFragmentsHolder getInst() {
        return inst;
    }

    public List<String> getFragments() {
        return fragments;
    }

    public void addFragment(String fragment) {
        fragments.add(fragment);
        Collections.sort(fragments);
    }

    public String getFragmentById(int id) {
        return fragments.get(id);
    }

    public synchronized void persistFragments() throws PersistExeption {
        try {
            FileOutputStream out = new FileOutputStream(persistFilePath);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(fragments);
            oos.flush();
        } catch (Exception e) {
            System.out.println("Problem serializing: " + e);
            throw new PersistExeption(e);
        }
    }

    public synchronized void loadFragments() {
        try {
            FileInputStream in = new FileInputStream(persistFilePath);
            ObjectInputStream ois = new ObjectInputStream(in);
            fragments = (List<String>) (ois.readObject());
        } catch (Exception e) {
            System.out.println("Problem serializing: " + e);
            throw new IllegalStateException();
        }
    }

    public static class PersistExeption extends Exception {
        public PersistExeption(Throwable cause) {
            super(cause);
        }
    }
}
