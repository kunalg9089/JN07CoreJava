package com.tnsif.Day 9.covariantoverriding;

public class ClassD extends ClassC{
	@Override
	public String getType()
	{
		return "ClassD";
	}
	@Override
	public ClassD getObject()
	{
		return this;
	}
}
