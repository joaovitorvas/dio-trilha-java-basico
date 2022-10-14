public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada: " + smartTv.ligada);

        Calculadora.somar(5, 3);

        System.out.println(Quadrilatero.area(4));
        System.out.println(Quadrilatero.area(4, 3));
        System.out.println(Quadrilatero.area(4, 3, 4));
    }
}
