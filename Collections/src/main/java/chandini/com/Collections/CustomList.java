package chandini.com.Collections;

import java.util.AbstractList;
import java.util.Arrays;

public class CustomList<T>{
	private int size = 0;
	private static final int INITIAL_CAPACITY = 10;
	private Object elements[];
	
	public CustomList(){
		elements = new Object[INITIAL_CAPACITY];
	}
	
	public void add(T element){
		if(size == elements.length){
			increaseCapacity();
		}
		elements[size++] = element;
	}
	
	private void increaseCapacity(){
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public T get(int i){
		if(i >= size || i < 0) 
			throw new ArrayIndexOutOfBoundsException("Index :"+i+", Size "+ elements.length);
		return (T)elements[i];
	}
	
	public T remove(int i){
		if(i >= size || i < 0) 
			throw new ArrayIndexOutOfBoundsException("Index :"+i+", Size "+ elements.length);
		Object element = elements[i];
		int elementsAfter_i = elements.length - (i+1);
		System.arraycopy(elements, i+1, elements, i, elementsAfter_i);
		// elements is source list
		// i+1 from that position to end of list
		// elements is destination list
		// i is the starting position where to copy the elements in destination array
		// elmentsAfter_i length how many elements to be copied
		size--;
		return (T)element;
	}
	
	
	
	@Override
	public String toString() {
		String s="";
		for(int i =0; i < size-1; i++){
			s += elements[i]+", ";
		}
		s+=elements[size-1];
		return "CustomList [elements= " + s + "]";
	}

	public int size(){
		return size;
	}

}
