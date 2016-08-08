package my.spring.main;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyBean {

	private Set<String> sampleSet;
	private Map<Integer, String> sampleMap;
	private List<String> sampleList;

	public Set<String> getSampleSet() {
		return sampleSet;
	}

	public void setSampleSet(Set<String> sampleSet) {
		this.sampleSet = sampleSet;
	}

	public Map<Integer, String> getSampleMap() {
		return sampleMap;
	}

	public void setSampleMap(Map<Integer, String> sampleMap) {
		this.sampleMap = sampleMap;
	}

	public List<String> getSampleList() {
		return sampleList;
	}

	public void setSampleList(List<String> sampleList) {
		this.sampleList = sampleList;
	}

	public void printValues() {
		System.out.println("Values of Set: ");
		for (String string : sampleSet) {
			System.out.println(string);
		}
		System.out.println("\nValues of list: ");
		for (String string : sampleList) {
			System.out.println(string);
		}

		System.out.println("\nValues of map: ");
		for (int i = 1; i<= sampleMap.size(); i++) {
			System.out.println("index: " + i + "-- value: " + sampleMap.get(i));
		}
	}

}
