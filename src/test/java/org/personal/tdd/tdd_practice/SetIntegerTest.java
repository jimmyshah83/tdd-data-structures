package org.personal.tdd.tdd_practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test Set Implementation class
 */
public class SetIntegerTest 
{
    /**
     * Below tests are to validate the size of a Set
     */
    @Test
    public void zeroSizeWhenObjectEmpty() {
	Set<Integer> set = new Set<Integer>();
	Assert.assertEquals(0, set.size()); 
    }
    
    @Test
    public void checkSizeNotEmpty_lessThanDefault() {
	Set<Integer> set = new Set<Integer>();
	set.add(1);
	Assert.assertEquals(1, set.size()); 
    }
    
    @Test
    public void checkSizeNotEmpty_greaterThanDefault() {
	Set<Integer> set = new Set<Integer>();
	for (int i = 1; i <= 17; i++) {
	    set.add(i);
	}
	Assert.assertEquals(17, set.size());
    }
    
    /**
     * Below tests are to validate a particular value is contained in the Set
     */
    @Test
    public void check_afterRemove_middleElement() {
	Set<Integer> set = new Set<Integer>();
	for (int i = 1; i <= 7; i++) {
	    set.add(i);
	}
	Assert.assertEquals(7, set.size()); 
	Assert.assertTrue(set.contains(5));
	set.remove(5);
	Assert.assertEquals(6, set.size());
	Assert.assertFalse(set.contains(5));
    }
    
    @Test
    public void check_afterRemove_lastElement() {
	Set<Integer> set = new Set<Integer>();
	for (int i = 1; i <= 7; i++) {
	    set.add(i);
	}
	Assert.assertEquals(7, set.size()); 
	Assert.assertTrue(set.contains(7));
	set.remove(7);
	Assert.assertEquals(6, set.size()); 
	Assert.assertFalse(set.contains(7));
    }
    
    @Test
    public void check_afterRemove_firstElement() {
	Set<Integer> set = new Set<Integer>();
	for (int i = 1; i <= 7; i++) {
	    set.add(i);
	}
	Assert.assertEquals(7, set.size()); 
	Assert.assertTrue(set.contains(1));
	set.remove(1);
	Assert.assertEquals(6, set.size()); 
	Assert.assertFalse(set.contains(1));
    }
    
    /**
     * Below tests are Delete specific that are not covered in the above cases
     */
    @Test
    public void invalid_delete() {
	Set<Integer> set = new Set<Integer>();
	set.add(1);
	Assert.assertEquals(1, set.size()); 
	Assert.assertTrue(set.contains(1));
	Assert.assertFalse(set.remove(3));
    }
    
    /**
     * Below tests are IsEmpty related tests
     */
    @Test
    public void isEmtpySetTest() {
	Set<Integer> set = new Set<Integer>();
	set.add(1);
	Assert.assertFalse(set.isEmpty());
	set.remove(1);
	Assert.assertTrue(set.isEmpty());
    }
    
    /**
     * Below tests are clear specific
     */
    @Test
    public void test_clear() {
	Set<Integer> set = new Set<Integer>();
	set.add(1);
	set.add(2);
	Assert.assertEquals(2, set.size()); 
	Assert.assertTrue(set.contains(1));
	set.clear();
	Assert.assertEquals(0, set.size()); 
	Assert.assertFalse(set.contains(1));
    }
    
    /**
     * Below are set specific tests which does not allow duplicates
     */
    @Test
    public void replaceOnDuplicateTest() {
	Set<Integer> set = new Set<Integer>();
	set.add(1);
	set.add(2);
	set.add(2);
	set.add(3);
	Assert.assertEquals(3, set.size()); 
	Assert.assertTrue(set.contains(3));
    }
}