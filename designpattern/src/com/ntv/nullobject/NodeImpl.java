package com.ntv.nullobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NodeImpl implements Node{
	private static final Logger LOGGER = LoggerFactory.getLogger(NodeImpl.class);
	private final String name;
	private final Node left;
	private final Node right;

	public NodeImpl(String name,Node left,Node right) {
		this.name = name;
		this.left = left;
		this.right = right;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getTreeSize() {
		// TODO Auto-generated method stub
		return 1 + left.getTreeSize() + right.getTreeSize();
	}

	@Override
	public Node getLeft() {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	public Node getRight() {
		// TODO Auto-generated method stub
		return right;
	}

	@Override
	public void walk() {
		LOGGER.info(name);
		if (left.getTreeSize() > 0) {
			left.walk();
		}
		if (right.getTreeSize() > 0) {
			right.walk();
		}
		
	}

}
