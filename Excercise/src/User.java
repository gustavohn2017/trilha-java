public class User {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        
        System.out.println("a TV está atualmente: "+ smartTv.Ligada);
        System.out.println("Está atualmente no canal: "+ smartTv.Canal);
        System.out.println("O volume está no: "+ smartTv.Volume);


    }
}


//Nomeação de metodos devem ser nomeados com Verbos e seguir o padrão "camelCase"
//Os metodos devem ser claros e bem legíveis para fácil entendimento de qualquer pessoa que leia o código
//Apenas UMA atribuição de tarefa para cada método.
//Definir a principal proposta do método.
//Definir o tipo de retorno do método.
//Caso não retorne nada, retornará Void.
//Excessões podem ser tratadas, mas devem ser evitadas.
//Visibilidade do método = Herança / classe 