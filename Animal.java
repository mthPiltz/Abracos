public class Animal extends Usuario{
    String especie;
    boolean vacina;

    public Animal(String especie, boolean vacina){
        setEspecie(especie);
        setVacina(vacina);
    }

    public String getEspecie() {
        return especie;
    }
    public boolean getVacina() {
        return vacina;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setVacina(boolean vacina) {
        this.vacina = vacina;
    }

    public void recebeAbraco(){
        
    }

    @Override
    public void darAbraco(Usuario enviouAbraco, Usuario recptorAbraco) {
        System.out.println("Me visite e traga comida assim que a Covid-19 passar");
        recptorAbraco.recebeAbraco(enviouAbraco);
    }

    @Override
    public void recebeAbraco(Usuario enviouAbraco) {
        if (enviouAbraco instanceof Animal || enviouAbraco instanceof Roqueiro){
            setVacina(true);
        }
        
    }
}
