
 
public class criandoEmpresa {

    private String nome;
    private String cnpj;
    private String endereco;
    
    public void criandoEmpresa (String cnpj, String nome, String endereco) {
    	this.cnpj = cnpj;
    	this.nome = nome;
    	this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}