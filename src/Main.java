public class Main {
    public static void main(String[] args) {
        // Criando tarefas
        Tarefa t1 = new Tarefa("Estudar Java");
        Tarefa t2 = new Tarefa("Fazer exercícios de programação");
        Tarefa t3 = new Tarefa("Ler documentação do GitHub");

        // Concluir uma tarefa
        t2.concluir();

        // Exibir as tarefas
        System.out.println("Lista de Tarefas:");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
