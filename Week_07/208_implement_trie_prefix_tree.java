class Trie {
    boolean isEnd;
    Trie[] next;
    /** Initialize your data structure here. */
    public Trie() {
        isEnd = false;
        next = new Trie[26];
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word == null || word.length() == 0) return;
        char[] array = word.toCharArray();
        Trie current = this;
        for(int i = 0; i < array.length; i++) {
            int item = array[i] - 'a';
            if(current.next[item] == null) current.next[item] = new Trie();
            current = current.next[item];
        }
        current.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = searchItem(word);
        return node != null && node.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix == null || prefix.length() == 0) return false;
        
        Trie node = searchItem(prefix);
        return node != null;
    }
    
    private Trie searchItem(String prefix) {
        char[] array = prefix.toCharArray();
        Trie current = this;
        for(int i=0;i<array.length;i++) {
            int item = array[i] - 'a';
            if(current.next[item] == null) {
                return null;
            }
            current = current.next[item];
        }
        return current;
    }
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */