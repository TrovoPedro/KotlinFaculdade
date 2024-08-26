fun main() {
    val relogio = Relogio(
        "Patek",
        50.750,
        10,
        11,
        50
    );

    val relogio2 = Relogio(

    );

    relogio.verHora();
    println(relogio.validar());

    relogio2.perguntarMarca();
    relogio2.perguntarPreco();
    relogio2.perguntarHora();
    relogio2.perguntaMinuto();
    relogio2.perguntarSegundos();
    relogio2.exibirRelogio2();
}