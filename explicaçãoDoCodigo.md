Exercício de JAVA para aula de Estrutura de Dados 2º Semestre curso de Sistemas para Internet - FATEC

Aqui está a explicação detalhada do código linha por linha:
________________________________________
Importação da Classe Scanner
import java.util.Scanner;
•	Importa a classe Scanner, que permite capturar entradas do usuário via teclado.
________________________________________
Declaração da Classe Principal
public class ContasMensais {
•	Declara a classe ContasMensais, que contém o método principal main onde o programa será executado.
________________________________________
Método Principal (main)
public static void main(String[] args) {
•	Método principal do programa, onde a execução começa.
________________________________________
Criação do Scanner para Entrada de Dados
Scanner scanner = new Scanner(System.in);
•	Cria um objeto Scanner chamado scanner, que será usado para capturar entradas digitadas pelo usuário.
________________________________________
Criação do Vetor para Armazenar os Valores das Contas
double[] contas = new double[10]; // Vetor para armazenar as contas
•	Declara um vetor chamado contas do tipo double com tamanho 10 para armazenar os valores das contas mensais digitadas pelo usuário.
________________________________________
Declaração da Variável para Somar os Valores
double soma = 0;
•	Declara a variável soma, iniciando com 0. Essa variável será usada para armazenar a soma total dos valores das contas.
________________________________________
Solicitação dos Valores ao Usuário
System.out.println("Digite os valores das 10 contas mensais:");
•	Exibe uma mensagem pedindo para o usuário digitar os valores das contas.
________________________________________
Laço de Repetição para Capturar os Valores
for (int i = 0; i < 10; i++) {
•	Inicia um loop for que se repete 10 vezes (de i = 0 até i = 9), pois precisamos capturar 10 contas.
Dentro do Loop:
System.out.print("Conta " + (i + 1) + ": R$ ");
•	Exibe no console o número da conta que está sendo digitada (i + 1 para começar de 1 ao invés de 0).
contas[i] = scanner.nextDouble(); // Armazena o valor no vetor
•	Captura o valor digitado pelo usuário e armazena na posição correspondente do vetor contas.
soma += contas[i]; // Soma os valores
•	Adiciona o valor digitado à variável soma, acumulando o total das contas.
________________________________________
Exibição do Total das Contas
System.out.println("\nO total das contas mensais é: R$ " + soma);
•	Exibe o valor total da soma das contas armazenadas no vetor.
________________________________________
Fechamento do Scanner
scanner.close();
•	Fecha o objeto scanner, liberando os recursos utilizados para capturar entrada do teclado.
________________________________________
Resumo do Funcionamento
1.	O programa solicita ao usuário que insira 10 valores de contas mensais.
2.	Esses valores são armazenados em um vetor.
3.	Um laço percorre o vetor, somando todos os valores inseridos.
4.	No final, o programa exibe o total das contas somadas.
Isso garante que o usuário tenha um controle rápido sobre seus gastos mensais de forma simples e eficiente! 🚀


