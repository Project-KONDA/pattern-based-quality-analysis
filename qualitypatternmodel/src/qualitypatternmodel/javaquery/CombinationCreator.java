package qualitypatternmodel.javaquery;
import java.util.ArrayList;
import java.util.List;

public class CombinationCreator<T> {
	private List<List<T>> parameter;
	private Integer[] sizes;
	private Integer[] currentIndex;
	private Boolean finished;
	private Integer size;
	
    public CombinationCreator(List<List<T>> params) {
    	parameter = params;
    	size = params.size();

    	sizes = new Integer[size];
    	currentIndex = new Integer[size];
    	finished = false;
    	
    	for (int i = 0; i<size; i++) {
    		Integer listSize = parameter.get(i).size();
    		if (listSize == 0)
    			finished = true;
    		sizes[i] = listSize;
    		currentIndex[i] = 0;
    	}
        // Constructor logic here
    }
    
    public Boolean isFinisihed() {
    	return finished;
    }
    
    private void increment() {
    	for (int i = size-1; i >= 0; i--) {
    		currentIndex[i] += 1;
    		if (currentIndex[i] < sizes[i])
    			return;
    		else {
    			if(i == 0)
    				finished = true;
    			else 
        			currentIndex[i] = 0;
    		}
    	}
    }
    
    public List<T> getNext(){
    	if (finished) 
    		return null;
    	List<T> result = new ArrayList<T>();
    	for (int i = 0; i<size; i++)
    		result.add(parameter.get(i).get(currentIndex[i]));
    	increment();
        return result;
    		
    }
}
