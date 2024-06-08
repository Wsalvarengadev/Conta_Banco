# Projeto Conta Bancária Simples

Este é um projeto simples em Java que simula uma conta bancária. O objetivo deste projeto é fornecer uma implementação básica de uma conta bancária. Este projeto é ideal para iniciantes em programação que desejam entender conceitos fundamentais de orientação a objetos e manipulação de dados em Java.


## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

### contaTerminal.java

Esta classe representa a estrutura de uma conta bancária. Ela contém os seguintes atributos:

- `numeroConta`: Um `int` que representa o número da conta.
- `nomeCliente`: Um `String` que representa o nome do cliente.
- `agencia`: Um `String` que representa a agência da conta.
- `saldo`: Um `double` que representa o saldo da conta.


## Como Executar

1. **Clone o repositório**:
   ```bash
   [git clone https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/Wsalvarengadev/Conta_Banco.git)
2.Navegue até o diretório do projeto e compile os arquivos Java:
  Conta_Banco src/*.java -d bin

3.Exemplo do codigo:

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Por favor entre com número da conta: ");
        numero = input.nextInt();
        System.out.print("Por favor entre com a agencia: ");
        agencia = input.next();
        System.out.print("Por favor entre com nome do cliente: ");
        input.nextLine();
        nomeCliente = input.nextLine();
        System.out.print("Por favor entre com saldo: ");
        saldo = input.nextDouble();

Bons estudos!
