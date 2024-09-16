class Cidade {

    var nome: String = ""
        // exemplo básico = get() = field.uppercase();
        get(){
            if(field.isBlank()){
                return "Não informado";
            }
            return field.uppercase();
        }
        set(value) {
            if(value.length >= 3){
                field = value;
            }
        }
}