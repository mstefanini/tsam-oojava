package stefanini.matteo.CaseStudy;

public class Address {
	private Integer id;
	private String nVia;
	private String indirizzo;
	private String nCivico;
	private String città;
		
	
	public Address(String nVia, String indirizzo, String nCivico, int id){
		this.id = new Integer(id);
		this.nVia = nVia;
		this.indirizzo = indirizzo;
		this.nCivico = nCivico;
		this.città = "Milano";
	}
	
	
	@Override
	public boolean equals(Object o){
		if(!(o instanceof Address))
			return false;
		Address a = (Address)o;
		if(a.getnVia() == null || a.getIndirizzo() == null || a.getnCivico() == null)
			return false;
		return (nVia+indirizzo+nCivico).equals(a.nVia+a.indirizzo+a.nCivico);
		
	}
	
	@Override
	public int hashCode(){
		return (nVia+indirizzo+nCivico).hashCode();
	}
	
	@Override
	public String toString(){
		return (nVia+" "+indirizzo+" "+nCivico+" "+città);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnVia() {
		return nVia;
	}

	public void setnVia(String nVia) {
		this.nVia = nVia;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getnCivico() {
		return nCivico;
	}

	public void setnCivico(String nCivico) {
		this.nCivico = nCivico;
	}
	
	
}
