public class Carro {
    String numeroCarro;
    String modelo;
    String cor;
    String cambio;
    int ano;
    int cavalos;
    double cilindrada;


    // metodo sem retorno
    void ligar() {
       System.out.println("Carro esta ligado");
    }

    //metodo com retorno

    String mostrarinfo(){
        return "Numero do carro: "+numeroCarro+ "\n" +"Modelo: " + modelo + "\n" + "cor: " + cor +"\n"+ "Ano: " + ano + "\n" +
                "Tipo de cambio: " + cambio + "\n" + "cilindrada: " + cilindrada + "\n" + "Cavalaria: " + cavalos;
    }


}
