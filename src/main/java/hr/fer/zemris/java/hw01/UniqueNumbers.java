package hr.fer.zemris.java.hw01;

import java.util.Scanner;

/**
 * Class that builds a binary tree from given integers by the user. Class uses a nested class "TreeNode" as 
 * a structure for further tree manipulation. When user finished the input, the class will print the tree elements in
 * ascending and descending order. If the input is in invalid format, the class will notify the user. 
 * 
 * @author Dinz
 *
 */
public class UniqueNumbers {

	/**
	 * Structure of a tree node. Consist of its value, the left child and the right child.
	 * 
	 * @author Dinz
	 *
	 */
	static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
	}

	/**
	 * Method that manages the user input and executes the class.
	 * 
	 * @param args Arguments given through the command prompt.
	 */
	public static void main(String[] args) {

		TreeNode glava = null;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Unesite cijeli broj.");
			String input = scanner.nextLine();

			if (input.equals("kraj"))
				break;

			try {
				int inputNumber = Integer.parseInt(input);
				if (containsValue(glava, inputNumber)) {
					System.out.println("Broj već postoji. Preskačem.");
				} else {
					glava = addNode(glava, inputNumber);
					System.out.println("Dodano.");
				}
			} catch (NumberFormatException ex) {
				System.out.println("'" + input + "' nije cijeli broj.");
			}
		}

		if (treeSize(glava) == 0) {
			System.out.print("Stablo nema članova. Doviđenja.");
		}

		else {

			System.out.print("Ispis od najmanjeg: ");
			printTreeAscending(glava);
			System.out.print("\nIspis od najvećeg: ");
			printTreeDescending(glava);
		}

		scanner.close();
	}
	/**
	 * Method that adds the integer element into the tree. If the tree already contains the given element
	 * the action is aborted.
	 * 
	 * @param root Tree's root.
	 * @param value Value that has to be input in the tree.
	 * @return Tree's root.
	 */
	public static TreeNode addNode(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode();
			root.value = value;
		} else {
			if (containsValue(root, value))
				return root;

			else if (value > root.value)
				root.right = addNode(root.right, value);
			else
				root.left = addNode(root.left, value);
		}
		return root;
	}
	/**
	 * Method that checks if the given element is already present in a given tree.
	 * 
	 * @param root Tree's root
	 * @param value Value that has to be checked
	 * @return True if the element is present, false otherwise.
	 */
	public static boolean containsValue(TreeNode root, int value) {
		if (root == null)
			return false;

		if (root.value == value)
			return true;
		else if (root.value > value)
			return containsValue(root.left, value);
		else if (root.value < value)
			return containsValue(root.right, value);
		else
			return true;
	}
	/**
	 * Method that calculates the size of the given tree.
	 * 
	 * @param root Tree's root
	 * @return Size of the given tree
	 */
	public static int treeSize(TreeNode root) {
		if (root == null)
			return 0;
		else
			return 1 + treeSize(root.left) + treeSize(root.right);
	}
	/**
	 * Method that prints the tree's elements in ascending order.
	 * 
	 * @param root Tree's root
	 */
	public static void printTreeAscending(TreeNode root) {
		if (root == null)
			return;
		printTreeAscending(root.left);
		System.out.print(root.value + " ");
		printTreeAscending(root.right);
	}

	/**
	 * Method that prints the tree's elements in descending order.
	 * 
	 * @param root Tree's root
	 */
	public static void printTreeDescending(TreeNode root) {
		if (root == null)
			return;
		printTreeDescending(root.right);
		System.out.print(root.value + " ");
		printTreeDescending(root.left);
	}

}
