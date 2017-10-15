package com.ntv.nullobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class NullNodeTest {

	@Test
	public void testGetInstance() {
		final NullNode instance = NullNode.getInstance();
		assertNotNull(instance);
		assertSame(instance, NullNode.getInstance());
		
	}

	@Test
	public void testWalk() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testFields() {
		final NullNode node = NullNode.getInstance();
		assertEquals(0,node.getTreeSize());
		assertNull(node.getName());
		assertNull(node.getLeft());
		assertNull(node.getRight());
	}

}
