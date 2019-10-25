package deqo.dlat.mysimplestack;

public class Stack implements SimpleStack{

    Stack stack;

    public Stack(){

        stack=new Stack();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getSize(){
        return stack.getSize();
    }

    public void push(Item item){
        stack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return stack.peek();
    }
    public Item pop() throws EmptyStackException{
        return stack.pop();
    }
}
