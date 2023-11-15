public class AdvancedLinkedList {
    private Object data;
    private AdvancedLinkedList next;
    public AdvancedLinkedList(){
        int numOfObject = (int)(Math.random() * 5 + 1);

        TestObject[] arr = new TestObject[numOfObject];
        for(int i =0; i < numOfObject; i++){
            arr[i] = new TestObject();
        }
        this.data = arr;
        this.next = null;
    }
    public AdvancedLinkedList(Object data, AdvancedLinkedList next){
        this.data = data;
        this.next = next;
    }
    public AdvancedLinkedList(Object data){
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public AdvancedLinkedList getNext() {
        return next;
    }

    public void setNext(AdvancedLinkedList next) {
        this.next = next;
    }
}
