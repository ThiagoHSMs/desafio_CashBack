🚀 Cashback Strategy System
Este projeto é um exercício prático de Refatoração e Design Patterns em Java puro. O objetivo principal foi transformar um código baseado em múltiplas condicionais (if/else) em uma arquitetura extensível, limpa e de fácil manutenção, aplicando princípios de SOLID.

🎯 O Problema
Sistemas de cashback geralmente possuem regras que mudam frequentemente (promoções, tipos de clientes, datas festivas). Um código baseado em if/else ou switch cresce de forma desordenada, violando o princípio de responsabilidade única e tornando os testes unitários complexos e frágeis.

🛠️ Solução Aplicada: Strategy Pattern + Factory
Para resolver o acoplamento, implementei o Strategy Pattern. Agora, cada regra de cashback é uma classe independente que segue um "contrato" (Interface).

Principais conceitos de SOLID aplicados:
SRP (Single Responsibility Principle): Cada classe de estratégia (CashbackVip, CashbackComum) tem apenas uma razão para mudar: a alteração na sua regra específica de cálculo.

OCP (Open/Closed Principle): O sistema está aberto para expansão (podemos adicionar novos tipos de cashback) e fechado para modificação (não precisamos alterar a classe CalculadoraPagamento para adicionar novas regras).

DIP (Dependency Inversion Principle): A calculadora não depende de classes concretas, mas sim da interface EstrategiaCashback.

🏗️ Estrutura do Projeto
EstrategiaCashback.java: Interface que define o contrato para os cálculos.

implementations/: Pasta contendo as regras específicas (Vip, Comum, Sustentável).

CashbackFactory.java: Responsável por encapsular a lógica de criação dos objetos, removendo a responsabilidade do Main.

CalculadoraPagamento.java: O serviço que executa o cálculo de forma desacoplada.

💻 Como executar
git clone https://github.com/seu-usuario/cashback-strategy-java.git
Certifique-se de ter o JDK 17+ instalado.

Clone o repositório:

Abra a pasta no VS Code.

Execute o arquivo Main.java.

📈 Evolução do Conhecimento
Este projeto faz parte dos meus estudos de backend, onde foco em:

Java Core (Interfaces, Polimorfismo, Enums).

Design Patterns (Strategy e Factory).

Clean Code (Nomes significativos e métodos pequenos).
