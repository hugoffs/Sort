O codigo em Java faz a implementação dos algoritimos de : **Bucket Sort, Comb Sort, Gnome Sort, Cocktail Sort e Selection Sort** .
Com a inteção de fazer a ferificação dos seguindes atributos: "Quantide Inteção"que seria á comparação entre os numeros e "Quantidade de Trocas", que seira as vezes que fizemos as trocas dos  numeros para ordenação.
Ultilizando os seguintes Vetores: 
  vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28}
  vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32}
  vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6}

Todas as classes exeto a Main, são filhas da classe abstrata Sort: 
  * Um vetor de ineteração onde é armazenda as interações de cada execução dos 3 vetores anteriores.
  * Junto com os meto get/set para retornar e setar o valor das interações.
  * Um metodo que Imrprimir : que realiza a impreção de cada alteração do vetor.
  * e um metodo abstrato sort: que ele será alterado por todas as classe sitadas anteriormente.


Apresentaremos para cada Vetor agora o melhro em Relação a trocas apartir dos dados coletados: 

## Trocas realizadas por vetor

### Vetor 1
| Algoritmo       | Trocas Realizadas |
|-----------------|-------------------|
| SELECTION SORT  |       18          |
| BUCKET SORT     |       20          |
| COMB SORT       |       22          |
| GNOME SORT      |       78          |
| COCKTAIL SORT   |       78          |

### Vetor 2
| Algoritmo       | Trocas Realizadas |
|-----------------|-------------------|
| SELECTION SORT  |        0          |
| COMB SORT       |        0          |
| GNOME SORT      |        0          |
| COCKTAIL SORT   |        0          |
| BUCKET SORT     |       20          |

### Vetor 3
| Algoritmo       | Trocas Realizadas |
|-----------------|-------------------|
| SELECTION SORT  |       10          |
| COMB SORT       |       18          |
| BUCKET SORT     |       20          |
| GNOME SORT      |      190          |
| COCKTAIL SORT   |      190          |


## Interações por vetor

### Vetor 1
| Algoritmo       | Interações      |
|-----------------|----------------|
| BUCKET SORT     | 97             |
| COMB SORT       | 129            |
| GNOME SORT      | 176            |
| SELECTION SORT  | 190            |
| COCKTAIL SORT   | 209            |

### Vetor 2
| Algoritmo       | Interações      |
|-----------------|----------------|
| COCKTAIL SORT   | 19             |
| GNOME SORT      | 20             |
| BUCKET SORT     | 92             |
| COMB SORT       | 110            |
| SELECTION SORT  | 190            |

### Vetor 3
| Algoritmo       | Interações      |
|-----------------|----------------|
| BUCKET SORT     | 96             |
| COMB SORT       | 129            |
| SELECTION SORT  | 190            |
| COCKTAIL SORT   | 380            |
| GNOME SORT      | 400            |


## Conclusão

A análise dos algoritmos de ordenação implementados — **Bucket Sort, Comb Sort, Gnome Sort, Cocktail Sort e Selection Sort**
permite observar diferenças claras no desempenho dependendo do tipo de vetor utilizado. Foram avaliados os critérios **Quantidade de Trocas** e **Quantidade de Interações**.

### Vetor 1 
|      Critério           |    Melhor Algoritmo     | Valor  |
|-------------------------|-------------------------|--------|
| Menos Trocas            | Selection Sort          |   18   |
| Menos Interações        | Bucket Sort             |   97   |

### Vetor 2
|      Critério           |         Melhor Algoritmo           | Valor  |
|-------------------------|------------------------------------|--------|
| Menos Trocas            | Selection/Comb/Gnome/Cocktail Sort |    0   |
| Menos Interações        | Cocktail Sort                      |   19   |

### Vetor 3
|      Critério           |    Melhor Algoritmo     | Valor  |
|-------------------------|-------------------------|--------|
| Menos Trocas            | Selection Sort          |  10    |
| Menos Interações        | Bucket Sort             |  96    |

**Observações gerais:**
- **Selection Sort** é eficiente em número de trocas, mas pode exigir mais interações dependendo do vetor.
- **Bucket Sort** é eficiente em número de interações, mesmo que ocasionalmente aumente o número de trocas.
- **Gnome Sort** e **Cocktail Sort** apresentam grande aumento em trocas e interações quando o vetor está muito desordenado.
- Vetores já ordenados favorecem algoritmos que verificam a ordem antes de trocar elementos.

Logo podemos concluir que  não existe um "melhor absoluto"; o desempenho depende fortemente da **estrutura inicial do vetor** e do critério de eficiência escolhido: **menor número de trocas** ou **menor número de interações**.

  




