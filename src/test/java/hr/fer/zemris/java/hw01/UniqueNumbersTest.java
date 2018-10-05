package hr.fer.zemris.java.hw01;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumbersTest {

	@Test
	public void addNodeTestRoot() {
		UniqueNumbers.TreeNode testNode = null;

		testNode = UniqueNumbers.addNode(testNode, 3);

		Assert.assertEquals(testNode.value, 3);
	}

	@Test
	public void addNodeTestLeft() {
		UniqueNumbers.TreeNode testNode = null;

		testNode = UniqueNumbers.addNode(testNode, 3);
		testNode = UniqueNumbers.addNode(testNode, 1);

		Assert.assertEquals(testNode.left.value, 1);
	}

	@Test
	public void addNodeTestRight() {
		UniqueNumbers.TreeNode testNode = null;

		testNode = UniqueNumbers.addNode(testNode, 3);
		testNode = UniqueNumbers.addNode(testNode, 15);

		Assert.assertEquals(testNode.right.value, 15);
	}

	@Test
	public void containsValueTestYes() {
		UniqueNumbers.TreeNode testNode = null;

		testNode = UniqueNumbers.addNode(testNode, 2);

		Assert.assertEquals(true, UniqueNumbers.containsValue(testNode, 2));

	}

	@Test
	public void containsValueTestMultipleYes() {
		UniqueNumbers.TreeNode testNode = null;

		testNode = UniqueNumbers.addNode(testNode, 3);
		testNode = UniqueNumbers.addNode(testNode, 2);

		Assert.assertEquals(true, UniqueNumbers.containsValue(testNode, 2));
	}

	@Test
	public void containsValueTestNo() {
		UniqueNumbers.TreeNode testNode = null;

		UniqueNumbers.addNode(testNode, 2);

		Assert.assertEquals(false, UniqueNumbers.containsValue(testNode, 3));

	}

	@Test
	public void containsValueTestEmpty() {
		UniqueNumbers.TreeNode testNode = null;

		Assert.assertEquals(false, UniqueNumbers.containsValue(testNode, 2));
	}

	@Test
	public void treeSizeTestAllSame() {
		UniqueNumbers.TreeNode testNode = null;

		testNode = UniqueNumbers.addNode(testNode, 12);
		testNode = UniqueNumbers.addNode(testNode, 12);
		testNode = UniqueNumbers.addNode(testNode, 12);
		testNode = UniqueNumbers.addNode(testNode, 12);

		Assert.assertEquals(1, UniqueNumbers.treeSize(testNode));
	}

	@Test
	public void treeSizeTestAllDifferent() {
		UniqueNumbers.TreeNode testNode = null;

		testNode = UniqueNumbers.addNode(testNode, -3);
		testNode = UniqueNumbers.addNode(testNode, 0);
		testNode = UniqueNumbers.addNode(testNode, 14);
		testNode = UniqueNumbers.addNode(testNode, 15);

		Assert.assertEquals(4, UniqueNumbers.treeSize(testNode));
	}

	@Test
	public void treeSizeTestSomeSame() {
		UniqueNumbers.TreeNode testNode = null;

		testNode = UniqueNumbers.addNode(testNode, 12);
		testNode = UniqueNumbers.addNode(testNode, 12);
		testNode = UniqueNumbers.addNode(testNode, 14);
		testNode = UniqueNumbers.addNode(testNode, 16);

		Assert.assertEquals(3, UniqueNumbers.treeSize(testNode));
	}

	@Test
	public void treeSizeTestEmpty() {
		UniqueNumbers.TreeNode testNode = null;

		Assert.assertEquals(0, UniqueNumbers.treeSize(testNode));

	}
}
