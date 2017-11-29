@SuppressWarnings("unchecked")
public class NoDupsPrioritizeArrayStack<T> extends ArrayStack<T>
	implements NoDupsPrioritizeStackInterface<T> {
	
	public NoDupsPrioritizeArrayStack() {
		super();
	} 
	public NoDupsPrioritizeArrayStack(int initialCapacity) {
		super(initialCapacity);
	} 

	@Override
	public void push(T newEntry) {
		if(indexLocate(newEntry) < 0)
			super.push(newEntry);		
	}

	public void moveToTop(T entry) {	
		int index = indexLocate(entry);				
		//not in stack
		if(index < 0)
			super.push(entry);
		//in stack
		else{
			T toTop = stack[index];
			for(int i = index; i < topIndex; i++){
				stack[i] = stack[i+1];
			}
			stack[topIndex] = toTop;	
		}
	} 

	public void display() {
		System.out.print("Display: \nBOTTOM ");		
		for (int i = 0; i <= topIndex; i++)
			System.out.print(stack[i] + " ");
		System.out.println("TOP");
	}

	private int indexLocate (T entry){
		for(int i = 0; i <= topIndex; i++){
			if(stack[i].equals(entry)){
				return i;
			}
		}
		return -1;
	}
} 
