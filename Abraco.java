import java.util.Scanner;

public abstract class Abraco{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Usuario vetUsuario[] = new Usuario[10];
        vetUsuario[0] = new Animal("Gato", false);
        vetUsuario[1] = new Emo(4, "Verde");
        vetUsuario[2] = new Roqueiro(4, "15/08/1957");
        System.out.println("Bem vindo ao abraçometro");
        System.out.println("Por este menu você vai escolher quem será abraçado e quem enviará o abraço");
        do {
            System.out.println("Digite: '1'-> para animal, '2'-> para Emo e '3'-> para roqueiro '4'-> para sair");
            System.out.println("Quem irá abraçar?");
            String enviou = input.next();
            if (enviou.equals("4")){
                input.close();
                break;
            }
            System.out.println("Quem vai receber?");
            String recebeu = input.next();
            if        (enviou.equals("1") && recebeu.equals("1")) {
                vetUsuario[0].darAbraco(vetUsuario[0], vetUsuario[0]);
            } else if (enviou.equals("1") && recebeu.equals("2")) {
                vetUsuario[0].darAbraco(vetUsuario[0], vetUsuario[1]);
            } else if (enviou.equals("1") && recebeu.equals("3")) {
                vetUsuario[0].darAbraco(vetUsuario[0], vetUsuario[2]);
            } else if (enviou.equals("2") && recebeu.equals("1")) {
                vetUsuario[1].darAbraco(vetUsuario[1], vetUsuario[0]);
            } else if (enviou.equals("2") && recebeu.equals("2")) {
                vetUsuario[1].darAbraco(vetUsuario[1], vetUsuario[1]);
            } else if (enviou.equals("2") && recebeu.equals("3")) {
                vetUsuario[1].darAbraco(vetUsuario[1], vetUsuario[2]);
            } else if (enviou.equals("3") && recebeu.equals("1")) {
                vetUsuario[2].darAbraco(vetUsuario[2], vetUsuario[0]);
            } else if (enviou.equals("3") && recebeu.equals("2")) {
                vetUsuario[2].darAbraco(vetUsuario[2], vetUsuario[1]);
            } else if (enviou.equals("3") && recebeu.equals("3")) {
                vetUsuario[2].darAbraco(vetUsuario[2], vetUsuario[2]);
            }

        } while(true);

    }
}