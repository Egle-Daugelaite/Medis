package com.tree.model;

import java.util.ArrayList;
import java.util.List;

public class Branch {
	
	private List<Branch> branches = new ArrayList<>();
	private Branch parent;
	private String name;
	
	
	public Branch(String name) {
		this.name = name;
		
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public Branch getParent() {
		return parent;
	}

	public void setParent(Branch parent) {
		this.parent = parent;
	}


	public String getName() {
		return name;
	}

	public Branch addChild(Branch child) {
		child.setParent(this);
		this.branches.add(child);
		return child;
	}

}
