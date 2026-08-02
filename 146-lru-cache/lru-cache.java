class Node{
    int key;
    int value;
    Node prev;
    Node next;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class LRUCache {
    HashMap<Integer,Node> map=new HashMap<>();
    Node dummyhead, dummytail;
    int capacity;
    public LRUCache(int capacity) {
        dummyhead=new Node(-1,-1);
        dummytail=new Node(-1,-1);
        dummyhead.next=dummytail;
        dummytail.prev=dummyhead;
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node temp=map.get(key);
        remove(temp);
        insertfront(temp);
        return temp.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp=map.get(key);
            temp.value=value;
            remove(temp);
            insertfront(temp);
            return ;
        }
        if(map.size()==capacity){
            Node lru=dummytail.prev;
            remove(lru);
            map.remove(lru.key);
        }
        Node temp=new Node(key,value);
        map.put(key,temp);
        insertfront(temp);
    }
    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insertfront(Node node){
        node.next=dummyhead.next;
        node.prev=dummyhead;
        dummyhead.next.prev=node;
        dummyhead.next=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */