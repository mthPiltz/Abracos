public class Emo extends UsuarioPessoa{
    int comprimentoFranja;
    String corCabelo;

    public Emo(int comprimentoFranja, String corCabelo){
        setComprimentoFranja(comprimentoFranja);
        setCorCabelo(corCabelo);
    }

    public int getComprimentoFranja() {
        return comprimentoFranja;
   }
    public String getCorCabelo() {
        return corCabelo;
   }
    private void setComprimentoFranja(int comprimentoFranja) {
        this.comprimentoFranja = comprimentoFranja;
   }
    private void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
   }

    @Override
    public void recebeAbraco(Usuario enviouAbraco) {
        if (enviouAbraco instanceof Emo){
            comprimentoFranja += 2;
            setComprimentoFranja(comprimentoFranja);
        } else{
            comprimentoFranja += 1;
            setComprimentoFranja(comprimentoFranja);
        }
        
    }

    @Override
    public void darAbraco(Usuario enviouAbraco, Usuario receptorAbraco) {
        if (receptorAbraco instanceof Emo){
        setCorCabelo("Rosa");
        } else{
            setCorCabelo("Verde");
        }
        receptorAbraco.recebeAbraco(enviouAbraco);
    }
}

// //Em relação a um emo, é importante saber seu nome (tamanho máximo de
// 20 letras), cpf (14 dígitos no formato YYY.YYY.YYY-YY), comprimento da franja (em centímetros e
// duas casas decimais) e cor do cabelo (as únicas opções são rosa, verde ou amarelo).