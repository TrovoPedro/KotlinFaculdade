import java.util.Scanner

class Relogio(
    var marca: String = "",
    var preco: Double = 0.0,
    var horas: Int = 0,
    var minutos: Int = 0,
    var segundos: Int = 0
) {

    fun zerar() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    fun validar(): String {
        var textoErro = "";

        if (horas in 0..23 && minutos in 0..60 && segundos in 0..60) {
            textoErro = "Valores corretos!";
        } else {
            if(horas < 0 || horas >= 23){
                horas = 0;
            }
            if(minutos < 0 || minutos >= 23){
                minutos = 0;
            }
            if(segundos < 0 || segundos >= 23){
                segundos = 0;
            }
            textoErro = "Valores inválidos indetificados. Ajustado!!"
        }

        return textoErro;
    }

    fun verHora(): String {
        validar();

        var exibirHora = println("${horas}:${minutos}:${segundos}");

        if (horas < 10) {
            exibirHora = println("${"%02d".format(horas)}:${minutos}:${segundos}");
        }

        return exibirHora.toString();
    }

    fun perguntarHora(): Int {
        validar();

        val teclado = Scanner(System.`in`);
        var respostaHora = 0;

        println("Informe a hora: ");
        respostaHora = teclado.nextInt();

        horas = respostaHora;

        return respostaHora;
    }

    fun perguntaMinuto(): Int {
        validar();

        val teclado = Scanner(System.`in`);
        var respostaMinutos = 0;

        println("Informe os minutos: ");
        respostaMinutos = teclado.nextInt();

        minutos = respostaMinutos;

        return respostaMinutos;
    }

    fun perguntarSegundos(): Int {
        validar();

        val teclado = Scanner(System.`in`);
        var respostaSegundos = 0;

        println("Informe os segundos: ");
        respostaSegundos = teclado.nextInt();

        segundos = respostaSegundos;

        return respostaSegundos;
    }

    fun perguntarMarca(): String {
        validar();

        val teclado = Scanner(System.`in`);
        var respostaModelo = "";

        println("Informe a marca: ");
        respostaModelo = teclado.nextLine();

        marca = respostaModelo;

        return respostaModelo;
    }

    fun perguntarPreco(): Double {
        validar();

        val teclado = Scanner(System.`in`);
        var respostaPreco = 0.0;

        println("Informe o preço: ");
        respostaPreco = teclado.nextDouble();

        preco = respostaPreco;

        return respostaPreco;
    }

    fun exibirRelogio2(): String {
        var textoRelogio2 = println(
            """
             Marca: ${marca}
             Preço: ${preco}
             Horas: ${horas}:${minutos}:${segundos}
        """.trimIndent()
        );

        if (horas < 10) {
            textoRelogio2 = println(
                """
                Marca: ${marca}
                Preço: ${preco}
                Horas: ${"%02d".format(horas)}:${minutos}:${segundos}
            """.trimIndent()
            );
        }

        return textoRelogio2.toString();
    }
}