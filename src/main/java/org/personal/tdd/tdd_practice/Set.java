package org.personal.tdd.tdd_practice;

import java.util.Arrays;

/**
 * A Set implementation backed by an Array. 
 * If a custom object is being stored in this set, it is advisable to override equals method
 */
public class Set<E> {
    private Object[] set;
    private int lastIndex;
    private final int DEFAULT_SIZE = 16;

    public Set() {
	set = new Object[DEFAULT_SIZE];
	lastIndex = -1;
    }

    public int size() {
	return lastIndex + 1;
    }

    public void add(E e) {
	if (this.contains(e))
	    return;
	lastIndex++;
	if (lastIndex >= set.length) {
	    set = Arrays.copyOf(set, set.length*2);
	}
	set[lastIndex] = e;
    }
    
    public boolean remove(E e) {
	for (int i = 0; i <= lastIndex; i++) {
	    if (null != set[i] && set[i].equals(e)) {
		for (int j = i; j <= lastIndex; j++) {
		    set[j] = set[j+1]; 
		}
		lastIndex--;
		return true;
	    }
	}
	return false;
    }
    
    public boolean contains(E e) {
	for (int i = 0; i <= lastIndex; i++) {
	    if (null != set[i] && set[i].equals(e)) {
		return true;
	    }
	}
	return false; 
    }
    
    public boolean isEmpty() {
	return lastIndex < 0 ? true : false;
    }
    
    public void clear() {
	for (int i = 0; i <= lastIndex; i++) {
	    set[i] = null;
	}
	lastIndex = -1;
    }
}
