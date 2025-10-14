# 💰 Revisão Java: <br> Tributação de Fintechs (Foco em Funções)

### O que são fintechs e por que governo Lula diz que elas devem pagar mais impostos

<p>Após o governo sofrer dura derrota no Congresso com a rejeição de uma Medida Provisória que elevaria impostos sobre o sistema financeiro, o presidente Luiz Inácio Lula da Silva (PT) disse que vai apresentar novas propostas de tributação do setor, mirando especialmente as fintechs — plataformas de serviços financeiros digitais. </p>

<p>A proposta do governo, que foi barrada com a queda da MP, era elevar a alíquota de 9% para 15% e a de 15% para 20%. </p>

<p>"Vou reunir o governo para discutir como é que a gente vai propor que o sistema financeiro, sobretudo as fintechs, que tem fintech hoje maior do que banco, que elas paguem o imposto devido a esse país", disse em entrevista à Rádio Piatã.</p>

Fonte: https://www.bbc.com/portuguese/articles/cz7r4dw5jdlo <br>
Acesso em 2025/10/14

Este exercício de revisão visa consolidar o uso de **Funções (Métodos)** em Java, abordando: <br>
métodos estáticos e não estáticos, com e sem retorno, e o uso de parâmetros.

O contexto é a proposta de elevação de impostos para *fintechs* no Brasil, exigindo a simulação do impacto financeiro e a análise do status do diálogo político.

## 🎯 Objetivo

Criar um programa em Java com métodos bem definidos para modularizar as tarefas de cálculo tributário e análise de diálogo, utilizando a passagem de parâmetros e diferentes tipos de retorno (incluindo `void`).

## 📋 Requisitos e Estruturas Obrigatórias

Você deve criar uma classe principal chamada `SimuladorTributario` (em `src/SimuladorTributario.java`) que contenha os seguintes métodos:

### 1\. Funções de Cálculo (Métodos Estáticos com Retorno)

Implemente estes três métodos **estáticos** para realizar os cálculos propostos:

| Método                    | Parâmetros                                        | Retorno  | Descrição                                                                         |
| :------------------------ | :------------------------------------------------ | :------- | :-------------------------------------------------------------------------------- |
| `calcularImpostoAntigo`   | `double valorFaturamento`, `int aliquotaBase`     | `double` | Calcula o imposto pago com a alíquota original.                                   |
| `calcularImpostoProposto` | `double valorFaturamento`, `int aliquotaProposta` | `double` | Calcula o imposto com a nova alíquota.                                            |
| `calcularDiferenca`       | `double impostoAntigo`, `double impostoProposto`  | `double` | Retorna a diferença absoluta ($\text{Imposto Proposto} - \text{Imposto Antigo}$). |

> **Fórmula:** $\text{Imposto} = \text{Faturamento} \times (\text{Alíquota} / 100)$

### 2\. Função de Diálogo (Método Não Estático Sem Retorno)

Implemente este método que exige a instanciação da classe e não retorna valor:

| Método          | Parâmetro                 | Retorno | Descrição                                                                                 |
| :-------------- | :------------------------ | :------ | :---------------------------------------------------------------------------------------- |
| `statusDialogo` | `boolean acessoAoGoverno` | `void`  | Imprime o status da negociação política usando uma estrutura **condicional (`if-else`)**. |

  * **Se `acessoAoGoverno` for `true`:** Imprimir "STATUS: Diálogo aberto. Há espaço para negociação."
  * **Se `acessoAoGoverno` for `false`:** Imprimir "STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política."

### 3\. Execução Principal (`main`)

Dentro do método `public static void main(String[] args)`:

1.  Defina um valor de faturamento de exemplo (`double`) (ex: $50,000,000.00$).
2.  **Chame** os métodos de cálculo para a proposta de elevação de $\mathbf{9\% \rightarrow 15\%}$. Imprima os três resultados (antigo, proposto e a diferença).
3.  **Chame** os métodos de cálculo para a proposta de elevação de $\mathbf{15\% \rightarrow 20\%}$. Imprima os três resultados.
4.  **Instancie** a classe `SimuladorTributario`.
5.  **Chame** o método `statusDialogo` duas vezes: uma com o parâmetro `true` e outra com `false`.

## 💻 Como Entregar

1.  **Fork** este repositório para sua conta.
2.  Crie e implemente a classe `SimuladorTributario.java` na pasta `src`.
3.  Garanta que todos os métodos e requisitos estejam implementados.
4.  **Commite** suas alterações.

No seu Commit, inclua o código e a **saída completa do console** gerada pela sua execução.

## Exemplo de Saída Esperada

*(Para Faturamento de R$ 50.000.000,00)*

```
=== Análise de Tributação de Fintechs ===

Faturamento Base: R$ 50.000.000,00

-- Proposta A (9% -> 15%) --
Imposto Antigo (9%): R$ 4.500.000,00
Imposto Proposto (15%): R$ 7.500.000,00
Aumento de Imposto: R$ 3.000.000,00

-- Proposta B (15% -> 20%) --
Imposto Antigo (15%): R$ 7.500.000,00
Imposto Proposto (20%): R$ 10.000.000,00
Aumento de Imposto: R$ 2.500.000,00

-- Análise de Diálogo --
STATUS: Diálogo aberto. Há espaço para negociação.
STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.
```

**Mãos à obra e utilize as funções de forma eficiente\!** 🚀