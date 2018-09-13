package com.tree.DepthSearch;

import com.tree.model.Branch;

public class TreeCreation {
	
	public TreeCreation() {
		
	}
	
	public static Branch createTree() {
		
		Branch root = new Branch("root");
		
		Branch node0 = root.addChild(new Branch("0"));
		Branch node1 = root.addChild(new Branch("1"));
		
		Branch node00 = node0.addChild(new Branch("00"));
		node0.addChild(new Branch("01"));
		Branch node02 = node0.addChild(new Branch("02"));
				
		Branch node10 = node1.addChild(new Branch("10"));
		Branch node11 = node1.addChild(new Branch("11"));
		
		node00.addChild(new Branch("000"));
		node00.addChild(new Branch("001"));
		
		node02.addChild(new Branch("020"));
		
		node10.addChild(new Branch("100"));
		node10.addChild(new Branch("101"));
		
		Branch node110 = node11.addChild(new Branch("110"));
		
		node110.addChild(new Branch("1100"));
		
		
		return root;
		
	}


}
