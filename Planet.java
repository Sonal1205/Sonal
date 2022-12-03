package com.in.source;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Planet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map = new HashMap<>();
map.put("Mercury", "No");
map.put("Venus", "No");
map.put("Earth", "No");
map.put("Jupitor", "Yes");
map.put("Saturn", "Yes");
map.put("Uranus", "Yes");
System.out.println(map);

Map<String, Long>values=map.values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println("Values Count : "+values);
String value = map.get(2);


	}

}
