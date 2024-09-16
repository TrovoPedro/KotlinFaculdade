import com.github.javafaker.Faker

fun main() {
    val faker = Faker();

    println("Digite um número: ");
    val numero = readln().toInt();

    // explicação do ponto de parada

    if(numero >= 10){
        println(faker.name().fullName());
    }
}