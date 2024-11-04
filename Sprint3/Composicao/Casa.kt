package Composicao

class Casa {
    private val quartos = mutableListOf<Quarto>()

    fun setQuarto(novoQuarto: Quarto){
        quartos.add(novoQuarto)
    }

    fun getQuarto(): List<Quarto>{
        return quartos
    }
}