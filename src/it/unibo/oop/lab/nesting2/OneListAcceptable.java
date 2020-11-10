package it.unibo.oop.lab.nesting2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> list;
	
	public OneListAcceptable(List<T> list) {
		this.list = list;
	}

	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			final Iterator<T> iterator = OneListAcceptable.this.list.iterator();
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if(!this.iterator.hasNext() || !newElement.equals(this.iterator.next())) {
					throw new ElementNotAcceptedException(newElement);
				}
			}

			@Override
			public void end() throws EndNotAcceptedException {
                if (this.iterator.hasNext()) {
                	throw new EndNotAcceptedException();
                }   	
			}
			
		};
		
	}
	
}
