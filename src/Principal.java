//Declara a classe principal do programa, chamada Principal. É o ponto de entrada da aplicação.
public class Principal {
    //Declara o método main, o ponto de execução inicial de qualquer aplicação Java.
    // Ele é public (acessível), static (pertence à classe, não a um objeto), e void (não retorna valor).
    public static void main(String[] args) {
        //Carro1
        //Declara uma variável chamada carro1 do tipo Carro
        //(assumindo que existe uma classe Carro em outro arquivo, como Carro.java).
        //O operador new Carro() aloca memória e chama o construtor da classe Carro,
        //criando uma nova instância (objeto).
        Carro carro1 = new Carro();
        //Acessa o atributo (variável de instância) numeroCarro do objeto carro1 e atribui a ele o valor de string "Carro 1".
        carro1.numeroCarro = "Carro 1";
        //Acessa o atributo modelo do objeto carro1 e atribui o valor "Civic".
        carro1.modelo = "Civic";
        //Acessa o atributo cor do objeto carro1 e atribui o valor "Prata".
        carro1.cor = "Prata";
        //Acessa o atributo ano do objeto carro1 e atribui o valor numérico (inteiro) 1915.
        carro1.ano = 1915;
        //Acessa o atributo cambio do objeto carro1 e atribui o valor "Manual".
        carro1.cambio = "Manual";
        //Acessa o atributo cilindrada do objeto carro1 e atribui o valor numérico (ponto flutuante) 2.5.
        carro1.cilindrada = 2.5;
        //Acessa o atributo cavalos do objeto carro1 e atribui o valor numérico 380.
        carro1.cavalos = 380;
        //Chamada de Método: Chama o método (ou função) ligar() no objeto carro1.
        //Isso executa o código definido dentro do método ligar da classe Carro.
        carro1.ligar();
        //Impressao de metodo: imprime o metodo carro1.mostrarinfo()
        System.out.println(carro1.mostrarinfo());


        //Carro2
        Carro carro2 = new Carro();
        carro2.numeroCarro = "Carro 2";
        carro2.modelo = "Nissan";
        carro2.cor = "preto";
        carro2.ano = 2001;
        carro2.cambio = "Manual";
        carro2.cilindrada = 2.0;
        carro2.cavalos = 250;
        carro2.ligar();
        System.out.println(carro2.mostrarinfo());
        //Carro3
        Carro carro3 = new Carro();
        carro3.numeroCarro = "Carro 3";
        carro3.modelo = "BYD";
        carro3.cor = "Azul";
        carro3.ano = 2024;
        carro3.cambio = "automatico";
        carro3.cilindrada = 1.0;
        carro3.cavalos = 120;
        carro3.ligar();
        System.out.println(carro3.mostrarinfo());
    }
}
