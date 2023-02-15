package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		Tree tree = new Tree();

		while (true) {

			if (!console.hasNext()) {
				break;
			}
			String input = console.nextLine();

			if (input.startsWith("I") && (input.length() == 3)) {

				if (tree.getValue() == 0) {
					tree.setValue(input.charAt(2));
				} else {
					insertTree(tree, input.charAt(2));
				}
			}

			if (input.startsWith("P") && (input.length() == 3)) {
				Tree pesq = searchTree(tree, input.charAt(2));
				String saida = pesq != null ? pesq.getValue() + " existe" : input.charAt(2) + " nao existe";
				System.out.println(saida);
			}

			// PREFIXA POSFIXA
			if (input.contains("INFIXA")) {
				printTreeINFIXA(tree, result);
				System.out.println(result.toString().trim());
				result.setLength(0);
			} 
			
			if (input.contains("PREFIXA")) {
				printTreePrefixa(tree, result);
				System.out.println(result.toString().trim());
				result.setLength(0);
			} 
			
			if (input.contains("POSFIXA")) {
				printTreePosfixa(tree, result);
				System.out.println(result.toString().trim());
				result.setLength(0);
			} 
			

		}

	}

	public static Tree searchTree(Tree tree, char letter) {

		if ((tree != null) && (tree.getValue() == letter)) {
			return tree;
		} else {

			if (letter > tree.getValue()) {
				if (tree.getRight() != null) {
					return searchTree(tree.getRight(), letter);
				}
			} else {

				if (tree.getLeft() != null) {
					return searchTree(tree.getLeft(), letter);
				}
			}

			return null;
		}

	}

	public static void printTreePrefixa(Tree tree, StringBuilder stringBuilder) { 
        
		stringBuilder.append(tree.getValue() + " ");
		
		if (tree.getLeft() != null) {
			printTreePrefixa(tree.getLeft(), stringBuilder);
		}
			
		if (tree.getRight() != null) {
			printTreePrefixa(tree.getRight(), stringBuilder);
		}

	}
	
    public static void printTreePosfixa(Tree tree, StringBuilder stringBuilder) { 
	
		if (tree.getLeft() != null) {
			printTreePosfixa(tree.getLeft(), stringBuilder);
		}
			
		if (tree.getRight() != null) {
			printTreePosfixa(tree.getRight(), stringBuilder);
		}
		stringBuilder.append(tree.getValue() + " ");

	}
	
	public static void printTreeINFIXA(Tree tree, StringBuilder stringBuilder) { // testar mais depois subir

		if (tree.getLeft() != null) {
			printTreeINFIXA(tree.getLeft(), stringBuilder);
		}
		stringBuilder.append(tree.getValue() + " ");

		if (tree.getRight() != null) {
			printTreeINFIXA(tree.getRight(), stringBuilder);
		}

	}

	public static Tree insertTree(Tree tree, char letter) {

		if (tree == null) {
			tree = new Tree();
			tree.setValue(letter);
			return tree;

		} else {

			if (letter > tree.getValue()) {
				tree.setRight(insertTree(tree.getRight(), letter));
			} else {
				tree.setLeft(insertTree(tree.getLeft(), letter));
			}

			return tree;
		}
	}

} // main class

class Tree {

	private char value;
	private Tree left;
	private Tree right;

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
	}

}
