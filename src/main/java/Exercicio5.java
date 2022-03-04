public class Exercicio5 {

    public static void main(String[] args) {

        //Criando um novo personagem
        Ashen soul = new Ashen();

        soul.vida = 100;
        soul.nome = "Zé";
        //Esse personagem tem uma arma, logo devemos fazer uma agregação
        Arma espada = new Arma();
        soul.arma = espada; //Agora o soul tem uma arma chamada espada;

        //Criando a espada
        espada.nome = "Zweinhandler";
        espada.poder = 50;
        espada.resistencia = 100;
        espada.descricao = "Uma arma grande";

        //Fazendo as funções das classes ashen e arma
        System.out.println("O Ashen tem " + soul.vida + " de vida.");
        soul.tomardano();
        System.out.println("Ashen recebeu dano, e agora tem " + soul.vida + " de vida.");
        soul.usarArma();
        System.out.println("O Ashen usou sua arma, ela agora tem " + espada.resistencia + " de resistencia.");
        System.out.println();

        System.out.println("Você inspeciona a arma:");
        System.out.println();
        espada.mostraInfoArma();
    }
}
