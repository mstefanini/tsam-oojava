package stefanini.matteo.smartset;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashSmartSet<E> implements SmartSet<E> {
	
	private HashMap<E, Object> map;
	
	private static final Object PRESENT = new Object();
	
	public HashSmartSet(){
		map = new HashMap<E, Object>();
	}
	
	public boolean equals(Object o) {
		if (o == this)
			return true;
       if (!(o instanceof Set))
			return false;
		Collection c = (Collection) o;
		if (c.size() != size())
			return false;
		try {
			return containsAll(c);
		} catch (ClassCastException unused)   {
			return false;
         } catch (NullPointerException unused) {
		     return false;
		}
	}
	
	public Iterator<E> iterator(){
		return map.keySet().iterator();
	}
	
	public boolean isEmpty(){
		return map.isEmpty();
	}
	
	public boolean contains(Object o){
		return map.containsKey(o);
	}
	
	public boolean add(E e){
		return map.put(e, PRESENT) == null;
	}
	
	public boolean remove(Object o){
		return map.remove(o) == PRESENT;
	}
	
	public boolean removeAll(Collection<?> c){
		boolean modified = false;
		
		if(size() > c.size()){
			for(Iterator<?> i = c.iterator(); i.hasNext();){
				modified |= remove(i.next());
			}
		}else{
				for(Iterator<?> i = iterator(); i.hasNext();){
					if(c.contains(i.next())){
						i.remove();
						modified = true;
					}
				}
			}
		return modified;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(E e) {
		if( map.containsKey(e) )
			return map.keySet().iterator().next();
		else
			return null;
	}
	
	
}
