package stefanini.matteo.mapexs;


class Person implements Comparable<Person>{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object o) {	
		if (!(o instanceof Person))
			return false;
		
		Person p = (Person)o;
		
		if (this.name == null)
			return p.name == null;
					
		return this.name.equals(p.name);
	}
	
	// necessario per hash set
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	// interface comparable, necessario per treeset.
	@Override
	public int compareTo(Person p) {
		// restituire valore negativo se this < p
		// = 0 se this equals p
		// valore positivo se this > p
		
		return this.name.compareTo(p.getName());
	}
}