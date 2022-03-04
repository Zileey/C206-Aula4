public class Ashen {
    String nome;
    int vida;

    Arma arma;

    void usarArma(){
        arma.resistencia = arma.resistencia - 2;
    }

    void tomardano(){
        vida = vida - 5;
    }
}
