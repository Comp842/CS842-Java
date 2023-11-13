public class SimpleLinkedList {
    private int data;
    private SimpleLinkedList next;
    public SimpleLinkedList(){
        this.data = 0;
        this.next = null;
    }
    public SimpleLinkedList( int data, SimpleLinkedList next){
        this.data = data;
        this.next = next;
    }
    public SimpleLinkedList( int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SimpleLinkedList getNext() {
        return next;
    }

    public void setNext(SimpleLinkedList next) {
        this.next = next;
    }
}
