import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Roqueiro extends UsuarioPessoa{
    int quantidadeCamiseta;
    String fezBarba;

    public Roqueiro(int quantidadeCamiseta, String fezBarba){
        setQuantidadeCamiseta(quantidadeCamiseta);
        setFezBarba(fezBarba);
    }
    public String getFezBarba() {
        return fezBarba;
    }

    public int getQuantidadeCamiseta() {
        return quantidadeCamiseta;
    }

    public void setFezBarba(String fezBarba) {
        this.fezBarba = fezBarba;
    }
    public void setQuantidadeCamiseta(int quantidadeCamiseta) {
        this.quantidadeCamiseta = quantidadeCamiseta;
    }

    private String puxaData(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String data = dtf.format((now));
        return data;
    }

    @Override
    public void darAbraco(Usuario enviouAbraco, Usuario receptorAbraco) {
        if(receptorAbraco instanceof Roqueiro){
            quantidadeCamiseta -= 1;
        } else{
            String novaData = puxaData();
            setFezBarba(novaData);
        }
        receptorAbraco.recebeAbraco(enviouAbraco);
    }

    @Override
    public void recebeAbraco(Usuario enviouAbraco) {
        if (enviouAbraco instanceof Roqueiro){
            System.out.println("Rock’n’roll baby");
        } else {
            System.out.println("Obrigado");
        }
        
    }
}
