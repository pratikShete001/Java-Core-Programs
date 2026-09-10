package com.jdbc;
import java.util.*;
public class Setdemo {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.add(2); h.add(3); h.add(1); h.add(22);h.add(0);h.add(100);
		System.out.println("----- HashSet ----");
		System.out.println(h);
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		lh.add(2); lh.add(3); lh.add(1); lh.add(22);lh.add(0);lh.add(100);
		System.out.println("----- LinkedHashSet ----");
		System.err.println(lh);
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(2); ts.add(3); ts.add(1); ts.add(22);ts.add(0);ts.add(100);
		System.out.println("----- LinkedHashSet ----");
		System.out .println(ts);
	}

}
