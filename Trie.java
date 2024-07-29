class TrieNode{
    TrieNode[] children;
    boolean endOfWord;

    public TrieNode(){
        children = new TrieNode[26];
        endOfWord = false;
    }
}

class TrieImplementation{
    private TrieNode root;

    public TrieImplementation(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode temp = root;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(temp.children[index] == null){
                temp.children[index] = new TrieNode();
            }
            temp = temp.children[index];
        }
        temp.endOfWord = true;
    }


    public boolean search(String word){
        TrieNode temp = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(temp.children[index] == null){
                return false;
            }
            temp = temp.children[index];
        }
        return temp.endOfWord;
    }

    public boolean delete(String word){
        return deleteRec(root, word, 0);
    }

    private boolean deleteRec(TrieNode root, String word, int index){
        if(index == word.length()){
            if(!root.endOfWord){
                return false;
            }
            root.endOfWord = false;
            return root.children.length == 0;
        }

        char ch = word.charAt(index);
        int i = ch - 'a';
        TrieNode node = root.children[i];
        if(node == null){
            return false;
        }

        boolean shouldDeleteCurrentNode = deleteRec(node, word, index + 1) && !node.endOfWord;
        if(shouldDeleteCurrentNode){
            root.children[i] = null;
            return isEmpty(root);
        }
        return false;
    }

    private boolean isEmpty(TrieNode root){
        for(int i = 0; i < 26; i++){
            if(root.children[i] != null){
                return false;
            }
        }
        return true;
    }

    public boolean startWith(String prefix){
        TrieNode temp = root;
        for(char ch : prefix.toCharArray()){
            int index = ch - 'a';
            if(temp.children[index] == null){
                return false;
            }
            temp = temp.children[index];
        }
        return true;
    }
}

public class Trie {
    public static void main(String[] args) {
        TrieImplementation trie = new TrieImplementation();
        trie.insert("apple");
        System.out.println(trie.search("apple")); // true
        System.out.println(trie.search("app"));   // false
        System.out.println(trie.startWith("app")); // true

        trie.insert("app");
        System.out.println(trie.search("app"));   // true

        trie.delete("apple");
        System.out.println(trie.search("apple"));

    }
}
