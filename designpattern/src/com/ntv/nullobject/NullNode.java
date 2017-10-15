package com.ntv.nullobject;

public class NullNode implements Node{

	private static NullNode instance = new NullNode();
	
	private NullNode(){
		
	}
	
	public static NullNode getInstance(){
		return instance;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTreeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Node getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}
