package com.tree.Runner;

import com.tree.DepthSearch.DepthSearch;
import com.tree.DepthSearch.TreeCreation;
import com.tree.model.Branch;

public class Runner {

	public static void main(String[] args) {

		Branch tree = TreeCreation.createTree();

		DepthSearch theDeepestLevel = new DepthSearch();

		System.out.println("The deepest level is: " + theDeepestLevel.findTheDeepestLevel(tree));

	}
}
