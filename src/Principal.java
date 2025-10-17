public class Principal {
    public static void main(String[] args) {
        //Carro1
        Carro carro1 = new Carro();
        carro1.numeroCarro = "Carro 1";
        carro1.modelo = "Civic";
        carro1.cor = "Prata";
        carro1.ano = 1915;
        carro1.cambio = "Manual";
        carro1.cilindrada = 2.5;
        carro1.cavalos = 380;
        carro1.ligar();
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
