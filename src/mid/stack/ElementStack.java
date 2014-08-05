package mid.stack;

import mid.Element;

public class ElementStack implements IStack {
	int top;
	Element[] stack;
	
	public ElementStack(){
		this(10);
	}
	
	public ElementStack(int initialCapacity){
		if(initialCapacity <1)
			return ;
		stack = new Element[initialCapacity];
		top = -1;
	}
	
	@Override
	public boolean isEmpty() {
		return top==-1;
	}

	@Override
	public void push(Object element) {
		if(top == stack.length -1)
			extendCapacity();
		stack[++top] = (Element) element;
	}

	@Override
	public Object pop() {
		if(isEmpty())
			return (Element)null;
		Element element = stack[top--];
		
		return (Element)element;
	}

	
	private void extendCapacity(){
		Element[] newStack = new Element[stack.length*2];
		
		for(int i=0; i<stack.length; i++){
			newStack[i] = stack[i];
		}
		
		stack = newStack;
	}
}
