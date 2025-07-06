# if-operator
Operador if em java
Verificador de Habilitação para Dirigir
Este é um simples aplicativo Java de linha de comando que verifica se uma pessoa pode dirigir com base em sua idade e status de emancipação/habilitação.

Como Funciona
O programa solicita ao usuário seu nome e idade. Com base na idade fornecida:

Se a idade for entre 16 e 17 anos, o programa pergunta se a pessoa é emancipada.

Se a idade for 15 anos ou menos, o programa informa que a pessoa é muito jovem para dirigir.

Se a pessoa for emancipada (e tiver entre 16-17 anos) ou tiver 18 anos ou mais, o programa pergunta se ela é habilitada (possui carteira de motorista).

Finalmente, o programa informa se a pessoa pode ou não dirigir com base nas respostas.

Requisitos
Java Development Kit (JDK) 8 ou superior instalado.

Como Compilar e Executar
Salve o código: Salve o código fornecido em um arquivo chamado App.java.

Abra o terminal/prompt de comando: Navegue até o diretório onde você salvou o arquivo App.java.

Compile o código: Use o compilador Java para compilar o arquivo:

javac App.java

Execute o programa: Após a compilação bem-sucedida, execute o programa:

java App

Interaja com o programa: Siga as instruções no terminal para inserir seu nome, idade e responder às perguntas.

Exemplo de Interação
Informe o seu nome:
João
Informe a sua idade:
17
Você é emancipado, João! (s/n)
s
Você é habilitado? (s/n)
s
Parabéns, João! Você pode dirigir.

Informe o seu nome:
Maria
Informe a sua idade:
15
Desculpe Maria, você é muito jovem para dirigir.
