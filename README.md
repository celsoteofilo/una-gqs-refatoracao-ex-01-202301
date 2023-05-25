# Gestão e Qualidade de Software

## Fixação - Exercício 01  

Exercício para fixação do conteúdo de Refatoração e Git Semântico.
Leia atentamente o texto e contexto a seguir, e em seguida desenvolva a solução proposta:

## Trecho do Texto

"Nas últimas semanas, o influenza H5N1, vírus causador da gripe aviária, voltou a figurar nas manchetes de todo o mundo.
Das cidades litorâneas do Daguestão, na Rússia, à costa do Peru, passando por fazendas de visons na Espanha
e granjas nos Estados Unidos, foram vários os episódios registrados de milhões de animais que morreram (ou foram sacrificados)
após terem contato com esse agente infeccioso.

Agências de saúde e pesquisadores do mundo inteiro aumentaram o nível de alerta sobre esse tipo de influenza
e o potencial que ele possui de causar a próxima pandemia.
"Com a capacidade de ser transmitido de uma pessoa para outra, o H5N1 pode ser um dos problemas mais graves
que a humanidade já enfrentou", diz o virologista Edison Luiz Durigon, professor titular
do Instituto de Ciências Biomédicas da Universidade de São Paulo (ICB-USP)."

Fonte: <https://www.bbc.com/portuguese/brasil-65214720>
Acessado em 19 de Abril de 2023

## Contexto

"Paiva Junior é um dos pesquisadores virologistas que acompanham a saga das pandemias.
Recentemente ele foi contratado para ajudar na identificação de possíveis expansões virais no Brasil vindas do exterior.
Ele teve a idéia de fazer um questionário de perguntas para todos os turistas e pessoas que estão viajando
e que estão retornando ou conhecendo o Brasil.
Mas para conseguir agilizar o processo de identificação de pessoas infectadas, precisará de ajuda."

Você apoiará na rápida identificação de pessoas sintomáticas e será responsável por criar uma solução em Java<
que faça as seguintes perguntas para as pessoas:

- Informe o seu nome
- Informe a sua idade

## Perguntas com respostas "SIM" ou "NAO"

- Seu cartão de vacina está em dia?,
- Teve algum dos sintomas recentemente?,
- Teve contato com pessoas com sintomas gripais nos últimos dias?,
- Está retornando de viagem realizada no exterior?

- O seu programa deverá calcular a porcentagem de risco que a pessoa oferece
- O cálculo da probabilidade de infecção que deverá ser realizado e,
- a soma da porcentagem de todas as perguntas com respostas "SIM" e "NAO" sendo:

- Cartão Vacinal em Dia - "NAO" : ***10***
- Teve Sintomas Recentes - "SIM": ***30***
- Teve contato com pessoa infectada - "SIM": ***30***
- Retornando de viagem - "SIM": ***+30%***

O programa deverá imprimir no final uma orientação para apoiar no direcionamento de todas as pessoas.
A lógica para orientação final, será baseada na porcentagem de uma pessoa estar infectada, sendo:

- Porcentagem menor ou igual a 30%: *"Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica."*
- Porcentagem menor ou igual a 60%: *"Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado."*
- Porcentagem menor ou igual a 89%: *"Paciente com alto risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado."*
- Porcentagem igual ou superior a 90%: *"Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado"*
- Indiferente da porcentagem, caso a pessoa esteja retornando de viagem, imediatamente imprimir: *"Você ficará sob observação por 05 dias."*

Caso a pessoa informe uma resposta errada para cada uma das 04 perguntas de "SIM" e NAO",
o programa fará novamente a mesma pergunta por mais duas tentativas.
Caso erre por três vezes, o programa será encerrado com a mensagem:

 texto;
"Não foi possível realizar o diagnóstico.
Gentileza procurar ajuda médica caso apareça algum sintoma.";

texto;
Após coletar os dados com sucesso e realizar os cálculos, o programa deverá imprimir:

texto;
Se o cartão de vacina está em dia
Se teve sintomas recentemente
se teve contato com pessoas infectadas
se a pessoa está retornando de viagem
A probabilidade dessa pessoa estar infectada
A orientação final do atendimento
.
Orientações Finais

O programa e sua devida refatoração deverá ser feito na linguagem ***Java***.
Lembre-se de testar a solução antes de entregá-la.
Você deverá criar um  deste repositório, e após isso, versionar o programa no seu repositório.
Utilize o conceito de Git Semântico para versioná-lo.
Você deverá enviar o link (url) do seu repositório na atividade da lista proposta em aula
