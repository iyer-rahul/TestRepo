package javapractice.stringreverse;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCharCount {
	public static void main(String[] args) {
		String letter = "k";
		String word = "Bookkeeper";
		// step1: convert into an array of String objects
		String[] wordarray = word.split("");
		
	Map<String,Long>	res = Arrays.stream(wordarray)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				
//List<Entry<String,Long>> output = res.entrySet().stream()
//					.filter(o->(o.getKey().equals(letter)))
//					//.map(entry->entry.getValue())
//					.collect(Collectors.toList());
	
	List<Long> output = res.entrySet().stream()
			.filter(o->(o.getKey().equals(letter)))
			.map(entry->entry.getValue())
			.collect(Collectors.toList());


System.out.println(output);
		
		
	}

}
