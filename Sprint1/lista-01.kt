fun main() {

    //listOf = lista imutavel (apenas para visualização)
    val listaPaises = listOf("Brasil", "Alemanha", "Argentina");

    println("Paises: $listaPaises");

    println("Primeiro valor: ${listaPaises.get(0)}");

    //mutableListOf (podemos alterar e adicionar elementos a lista)
    val listaProduto = mutableListOf("Bolacha", "Arroz");
    listaProduto.add("Sabão");
    listaProduto.add("Sorvete");

    listaProduto.remove("Bolacha");
    listaProduto.removeAt(1);

    println("Lista de produtos: $listaProduto");
}