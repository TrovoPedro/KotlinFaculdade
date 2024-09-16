fun main() {
    val estado = Estado();

    estado.setarNome("ba");
    estado.populacao = 14_000_000;
    estado.uf = "SP";

    println("Nome: ${estado.nome}")
    println("População: ${estado.populacao}")
    println("UF: ${estado.uf}")

}