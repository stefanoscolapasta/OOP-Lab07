package it.unibo.oop.lab.nesting2;
import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> list;
	
	public OneListAcceptable(List<T> list) {
		this.list = list;
	}
	
	@Override
	public Acceptor<T> acceptor() {
		final Iterator<T> iterator = this.list.iterator();
		
		return new Acceptor<T>() {

			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				try {
					if(newElement.equals(iterator.next())) {
						return;
					}
				}catch(ElementNotAcceptedException e) {
					System.out.println(e.getMessage());
				}
				throw new ElementNotAcceptedException(newElement);
			}

			@Override
			public void end() throws EndNotAcceptedException {
				try {
                    if (!iterator.hasNext()) {
                        return;
                    }
                } catch (EndNotAcceptedException e) {
                    System.out.println(e.getMessage());
                }
                throw new EndNotAcceptedException();	
			}
			
		};
		
	}
	
}
