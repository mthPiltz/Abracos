public abstract class UsuarioPessoa extends Usuario{
        String nome;
        String cpf;
    
        public UsuarioPessoa(){
    
        }
    
        public UsuarioPessoa(String nome, String cpf){
            setNome(nome);
            setCpf(cpf);
        }
    
        public abstract void darAbraco(Usuario enviouAbraco ,Usuario recptorAbraco);
        public abstract void recebeAbraco(Usuario enviouAbraco);
    
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getCpf() {
            return cpf;
        }
        public String getNome() {
            return nome;
        }
}
