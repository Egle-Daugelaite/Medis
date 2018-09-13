package com.tree.DepthSearch;

import com.tree.model.Branch;

public class DepthSearch {

	public DepthSearch() {
	}

	public int findTheDeepestLevel(Branch tree) {

		if (tree.getBranches().size() == 0) {
			return 1;
		}

		int theDeepestLevel = 0;
		for (int i = 0; i < tree.getBranches().size(); i++) {
			int level = findTheDeepestLevel(tree.getBranches().get(i));
			if (level > theDeepestLevel) {
				theDeepestLevel = level;

			}
		}

		return theDeepestLevel + 1;
	}

}
