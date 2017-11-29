
public class NoDupsPrioritizeArrayStack<T> extends ArrayStack<T> implements NoDupsPrioritizeStackInterface<T> {
	
	public NoDupsPrioritizeArrayStack() {
		super();
	} 
	public NoDupsPrioritizeArrayStack(int initialCapacity) {
		super(initialCapacity);
	} 

	@Override
	public void push(T newEntry) {
		if(contains(newEntry)){
			super.push(newEntry);
		}
	}

	public void moveToTop(T entry) {		
		if(contains(entry)){
			int oldIndex = locateIndex(entry);
			T oldEntry = stack[oldIndex];
			removeGap(oldIndex);
			createGap(0);
			stack[0] = oldEntry;
		}
		else{
			//add entry to top
		}
	} 

	public void display() {
		// YOUR CODE HERE
	}
	
	private boolean contains (T entry){
		if(locateIndex(entry) < 0)
			return false;
		else
			return true;
	}
	
	private int locateIndex (T entry){
		for(int i = 0; i < topIndex; i++){
			if(stack[i].equals(entry))
				return i;
		}
		return -1;
	}
	
	private void removeGap(int gapIndex){
		
	}
	
	private void createGap (int gapIndex){
	}
} 
