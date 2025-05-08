public class StackLinkedList implements Stack{
    StackItem top=null;


    @Override
    public void push(Object item) {
        StackItem temp_box=new StackItem(item);
        StackItem previous_top=top;
        top=temp_box;
        top.setNext(previous_top);
    }

    @Override
    public void peek() {
        if(top==null){
            System.out.println("Null");
        }else {
            System.out.println("The top is " + top.getItem());
        }
    }


    @Override
    public Object pop() {
        Object data=top.getItem();
        top=top.getNext();
        return data;
    }

    @Override
    public boolean isEmpty() {
        return this.top==null;
    }
}
