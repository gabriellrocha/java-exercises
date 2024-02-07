public class Solution0 {

    // criar uma classe estática Idea
    // ter um método getDescription() que retorna alguma String
    // implementar o método printIdea na classe Solution
    // chamar esse método através do main() passando um objeto Idea e exibindo a String do mesmo

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());

    }

    public static class Idea {

        public String getDescription(){
            return "Java";
        }
    }

}