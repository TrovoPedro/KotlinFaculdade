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

    val listaInteiro = mutableListOf<Int>(); //lista com o tipo declarativo por atribuição (pode criar uma lista vazia)

    //tipo declarativo por declaração
    // declarando uma variavel do tipo List que vai receber um Int
    val listaInterioDeclarativoSemAlteracao: List<Int>;
    /*
    * independte do valor que receba
    * (mutableListOf ou ListOf) ele vai ser imutavel
    */

    val listaInterioDeclarativo: MutableList<Int>;
    // Lista mutavel de Int

    val listaPessoas = mutableListOf("Pedro", "Trovo", "Souza");

    println("1° pessoa: ${listaPessoas.get(0)}")
    println("1° pessoa: ${listaPessoas.first()}"); //pegando o primeira pessoa com o metodo first()
    println("Ultima pessoa ${listaPessoas.last()}");

    //ultima pessoa pegando o ultimo index pelo tamanho da lista
    println("Ultima pessoa: ${listaPessoas.size - 1}");

    // TODO: pedro (lembre)
    // FIXME: Me conserta (funciona mas dá pra melhorar)

    //validando se o index existe
    if(listaPessoas.indices.contains(4)){
        println("A quinta pessoa: ${listaPessoas.get(4)}");
    }else{
        println("Não existe quinta pessoa");
    }

    //validando se o valor existe dentro da lista
    if(listaPessoas.contains("Pedro")){
        println("Existe Pedro na lista");
    }else{
        println("Não existe Pedro na lista");
    }

    println("Pessoas: $listaPessoas");
    println("A partir da segunda pessoa ${listaPessoas.drop(1)}")
    println("A partir da penultima pessoa: ${listaPessoas.dropLast(1)}");
    println("Sem o primeiro e sem p ultimo: ${listaPessoas.drop(1).dropLast(1)}");

    listaPessoas.add("José");
    listaPessoas.add("Roberto");
    listaPessoas.removeAt(0)

    println("Lista de pessoas: $listaPessoas");
    
    listaProduto[0] = "Pedro";
    listaProduto.set(0, "Trovo");
    
    //atualizando pelo valor do elemento
    val posicaoTrovo = listaProduto.indexOf("Trovo");
    if(posicaoTrovo != -1){
        listaProduto[posicaoTrovo] = "Novo valor";
    }


}
