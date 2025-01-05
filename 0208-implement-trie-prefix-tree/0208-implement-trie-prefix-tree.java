class Trie {
    public TrieNode root;
    public Trie() {
        root=new TrieNode('0');
    }
    
    public void insert(String word) {
        insert(root,word);
    }
    public void insert(TrieNode root,String s){
        if(s.length()==0){
            root.isWord=true;
            return ;
        }
        int idx=s.charAt(0)-'a';
        TrieNode child=root.children[idx];
        if(child==null){
            child=new TrieNode(s.charAt(0));
            root.children[idx]=child;
        }
        insert(child,s.substring(1));
    }
    
    public boolean search(String word) {
        return search(root,word);
    }
    public boolean search(TrieNode root,String s){
        if(s.length()==0) return root.isWord;
        int idx=s.charAt(0)-'a';
        TrieNode child=root.children[idx];
        if(child==null) return false;
        return search(child,s.substring(1));
    }
    
    public boolean startsWith(String prefix) {
        return startsWith(root,prefix);
    }
    public boolean startsWith(TrieNode root,String s){
        if(s.length()==0) return true;
        int idx=s.charAt(0)-'a';
        TrieNode child=root.children[idx];
        if(child==null) return false;
        return startsWith(child,s.substring(1));
    }
}
class TrieNode{
    char data;
    boolean isWord;
    TrieNode[] children;
    public TrieNode(char data){
        this.data=data;
        isWord=false;
        children=new TrieNode[26];
    }
}