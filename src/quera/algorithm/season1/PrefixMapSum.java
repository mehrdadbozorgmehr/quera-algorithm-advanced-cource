package quera.algorithm.season1;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    int value;

    TrieNode() {
        children = new HashMap<>();
        value = 0;
    }
}

public class PrefixMapSum {
    private final TrieNode root;
    private final Map<String, Integer> map;


    public PrefixMapSum() {
        root = new TrieNode();
        map = new HashMap<>();
    }

    public void insert(String key, int value) {
        int diff = value - map.getOrDefault(key, 0);
        map.put(key, value);

        TrieNode node = root;
        node.value += diff;

        for (char c : key.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
            node.value += diff;
        }
    }

    public int sum(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (!node.children.containsKey(c)) {
                return 0;
            }
            node = node.children.get(c);
        }
        return node.value;
    }

    public static void main(String[] args) {
        PrefixMapSum prefixMapSum = new PrefixMapSum();
        prefixMapSum.insert("columnar", 3);
        System.out.println("SUM ---> " + prefixMapSum.sum("col"));

        prefixMapSum.insert("column", 2);
        System.out.println("SUM ---> " + prefixMapSum.sum("col"));
    }

}

