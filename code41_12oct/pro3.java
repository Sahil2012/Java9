
class StrStore {

	public static void main(String[] args) {

		/*
		* An object of st1 is created in string constant pool
		* because it is string literal st1 is directly pointing to the obj at scp
		*/
		String st1 = "Sahil";

		/* 
		* the object of st2 is created at the heap memory as well as in scp
		* because it is an object created using new keyword it is pointing to obj at heap
		*/
		String st2 = new String("Gupta");

		System.out.println(st1 + " " + st2);
	}
}
