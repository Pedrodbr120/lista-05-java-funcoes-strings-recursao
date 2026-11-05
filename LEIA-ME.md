# Lista 05 - Funções, Strings e Recursão

Os dez arquivos pedidos estão em `src`, de `Exercicio01.java` a `Exercicio10.java`. Cada classe executa separadamente, com seu próprio `main`, sem bibliotecas externas. Cada exercício usa array, função com retorno e procedimento `void` além do `main`.

## Executar no IntelliJ IDEA

Abra esta pasta em **File > Open**. Se necessário, selecione o JDK 21 em **File > Project Structure > Project > SDK**. Abra a classe desejada e clique no triângulo verde ao lado de `main`. Digite os dados no painel **Run**, pressionando Enter após cada valor ou frase.

No exercício 2, use vírgula nos decimais, peso em kg e altura em metros: `70` e `1,75`. Informe alturas maiores que zero. Nos exercícios 6, 7 e 8, escreva cada frase ou nome completo em uma linha.

## Entenda os métodos

1. `gerarLinha` devolve uma String com repetições do símbolo; `desenharTriangulo` imprime linhas de tamanho 1 até a altura. O array armazena as três alturas.
2. `calcularImc` divide o peso pelo quadrado da altura; `classificarImc` aplica as faixas do enunciado. `exibirRelatorio` percorre os dois arrays e mostra o resultado.
3. `ehPrimo` testa divisores até a raiz do número. A condição `divisor <= numero / divisor` evita multiplicação que poderia ultrapassar o limite do int. `contarPrimos` conta e `exibirPrimos` mostra os primos. Números abaixo de 2 não são primos.
4. `ordenar` compara vizinhos e troca os valores usando uma variável auxiliar. A cada passagem, um valor maior chega ao final. `estaOrdenado` verifica a ordem e `exibir` mostra o array.
5. `paraBinario` usa o resto da divisão por 2 e o coloca à esquerda da String. Zero tem tratamento próprio. Informe inteiros não negativos, como pede a lista.
6. `contarVogais` converte o texto para minúsculas e verifica cada caractere. Também conta vogais acentuadas usuais em português. `exibirContagem` mostra as contagens e a frase vencedora; em empate, escolhe a primeira.
7. `gerarIniciais` usa `trim`, `split` e `toUpperCase`. Cada parte não vazia fornece uma inicial, inclusive palavras como "da" e "de". `exibirChamada` imprime os nomes e as iniciais com ponto final.
8. A leitura usa `split(" ")`, como pedido. Informe uma frase não vazia, com um espaço entre as palavras. `maiorPalavra` compara comprimentos e mantém a primeira em caso de empate; `exibirPalavras` numera a lista. Pontuação continua fazendo parte da palavra.
9. `potencia` tem caso base no expoente zero. Nos outros casos, multiplica a base pelo resultado da chamada com expoente menos um. A função não usa laço nem `Math.pow`. O procedimento percorre as bases. Expoentes negativos são recusados, pois o retorno inteiro e o caso base pedidos correspondem a expoentes não negativos. Use expoentes pequenos e resultados que caibam em `long`.
10. `fibonacci` soma as duas chamadas anteriores até chegar a 0 ou 1. `preencher` guarda os termos no array, `somar` devolve a soma e `exibir` mostra os valores. N fora de 1 a 30 encerra com mensagem. A recursão direta repete cálculos, conforme a proposta básica da lista.

Funções devolvem um valor com `return`. Procedimentos `void` executam uma ação sem devolver um valor. Os métodos são `static` para serem chamados diretamente pelo `main`.

## Exemplos para conferir

- Exercício 1: alturas 1, 2 e 3 produzem três triângulos, separados por uma linha em branco.
- Exercício 3: 0, 1, 2, 3, 4, 5, 6 e 7 contêm quatro primos: 2, 3, 5 e 7.
- Exercício 4: 6, 5, 4, 3, 2 e 1 ficam em ordem 1, 2, 3, 4, 5 e 6.
- Exercício 5: 0, 1, 2, 10 e 15 viram 0, 1, 10, 1010 e 1111.
- Exercício 7: `maria da silva` gera `M.D.S.`.
- Exercício 9: expoente 3 e bases 2, 3, 0, -2 e 1 produzem 8, 27, 0, -8 e 1. Pelo caso base pedido, expoente 0 retorna 1, inclusive para base 0.
- Exercício 10: N igual a 10 produz `0 1 1 2 3 5 8 13 21 34` e soma 88.

As entradas devem seguir os tipos e domínios dos enunciados. As validações adicionais ficam limitadas ao N do exercício 10 e ao expoente negativo do exercício 9. Leia as soluções e pratique explicar os métodos antes de entregar, seguindo as regras da sua faculdade.
