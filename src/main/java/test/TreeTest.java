package test;



import org.junit.jupiter.api.Test;

import interfaces.Tree;
import junit.framework.TestCase;

class TreeTest extends TestCase{

	private Tree<String> tree;
	
	private String node;
	private String parent;
	
	
	public void stageOne() {
		
		tree =  new Tree<>();
		node = "1";
		parent = "2";
		
		for (int i = 0; i < 4; i++) {
			
			tree.add(node+i, parent+i);
		}
	}

	
	@Test
	public void testAdd() {
		
		stageOne();
		
//		tree.add(node, parent);
		String m =  tree.getRoot().getElem();
	
		
		assertEquals(m, "10");
	}
	@Test
	public void testPrint() {
		
		
	}
	
}