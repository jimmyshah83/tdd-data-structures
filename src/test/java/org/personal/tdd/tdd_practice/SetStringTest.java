package org.personal.tdd.tdd_practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test Set Implementation class
 */
public class SetStringTest 
{
    /**
     * Below tests are to validate the size of a Set
     */
    @Test
    public void zeroSizeWhenObjectEmpty() {
	Set<String> set = new Set<String>();
	Assert.assertEquals(0, set.size()); 
    }
    
    @Test
    public void checkSizeNotEmpty_lessThanDefault() {
	Set<String> set = new Set<String>();
	set.add("Jimmy");
	Assert.assertEquals(1, set.size()); 
    }
    
    @Test
    public void checkSizeNotEmpty_greaterThanDefault() {
	Set<String> set = new Set<String>();
	for (int i = 1; i <= 17; i++) {
	    set.add(String.valueOf(i));
	}
	Assert.assertEquals(17, set.size());
    }
    
    /**
     * Below tests are to validate a particular value is contained in the Set
     */
    @Test
    public void check_afterRemove_middleElement() {
	Set<String> set = new Set<String>();
	for (int i = 1; i <= 7; i++) {
	    set.add(String.valueOf(i));
	}
	Assert.assertEquals(7, set.size()); 
	Assert.assertTrue(set.contains("5"));
	set.remove("5");
	Assert.assertEquals(6, set.size());
	Assert.assertFalse(set.contains("5"));
    }
    
    @Test
    public void check_afterRemove_lastElement() {
	Set<String> set = new Set<String>();
	for (int i = 1; i <= 7; i++) {
	    set.add(String.valueOf(i));
	}
	Assert.assertEquals(7, set.size()); 
	Assert.assertTrue(set.contains("7"));
	set.remove("7");
	Assert.assertEquals(6, set.size()); 
	Assert.assertFalse(set.contains("7"));
    }
    
    @Test
    public void check_afterRemove_firstElement() {
	Set<String> set = new Set<String>();
	for (int i = 1; i <= 7; i++) {
	    set.add(String.valueOf(i));
	}
	Assert.assertEquals(7, set.size()); 
	Assert.assertTrue(set.contains("1"));
	set.remove("1");
	Assert.assertEquals(6, set.size()); 
	Assert.assertFalse(set.contains("1"));
    }
    
    /**
     * Below tests are Delete specific that are not covered in the above cases
     */
    @Test
    public void invalid_delete() {
	Set<String> set = new Set<String>();
	set.add("1");
	Assert.assertEquals(1, set.size()); 
	Assert.assertTrue(set.contains("1"));
	Assert.assertFalse(set.remove("3"));
    }
    
    /**
     * Below tests are IsEmpty related tests
     */
    @Test
    public void isEmtpySetTest() {
	Set<String> set = new Set<String>();
	set.add("1");
	Assert.assertFalse(set.isEmpty());
	set.remove("1");
	Assert.assertTrue(set.isEmpty());
    }
    
    /**
     * Below tests are clear specific
     */
    @Test
    public void test_clear() {
	Set<String> set = new Set<String>();
	set.add("1");
	set.add("2");
	Assert.assertEquals(2, set.size()); 
	Assert.assertTrue(set.contains("1"));
	set.clear();
	Assert.assertEquals(0, set.size()); 
	Assert.assertFalse(set.contains("1"));
    }
    
    /**
     * Below are set specific tests which does not allow duplicates
     */
    @Test
    public void replaceOnDuplicateTest() {
	Set<String> set = new Set<String>();
	set.add("1");
	set.add("2");
	set.add("2");
	set.add("3");
	Assert.assertEquals(3, set.size()); 
	Assert.assertTrue(set.contains("3"));
    }
}