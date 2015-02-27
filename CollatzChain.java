import java.util.*;

class CollatzChain {
	static Map<Integer, Integer> collatzMap = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		int chainLength;
		int longestChainLength = 0;
		int startOfLongestChain = 0;
		int max = 100000000;

		for (int i = ; i < max; i++) {
			chainLength = chainLength(i);
			collatzMap.put(i, chainLength);
			if (longestChainLength < chainLength) {
				longestChainLength = chainLength;
				startOfLongestChain = i;
			}
		}
		
		System.out.println("Longest chain length upto " + max + " is " + longestChainLength + " and it starts at " + startOfLongestChain);
	}

	public static int chainLength(int start) {
		List<Integer> chain = new ArrayList<Integer>();
		chain.add(start);
		while (start > 1) {
			if(collatzMap.containsKey(start))
				return chain.size() + collatzMap.get(start);
			if (start % 2 == 0)
				start /= 2;
			else {
				start *= 3;
				start += 1;
			}
			chain.add(start);
		}
		return chain.size();
	}
}




