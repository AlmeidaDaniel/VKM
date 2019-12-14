============================================
	DADOS DO ALUNO
============================================
Daniel A. Bulhões
2016200817
Engenharia de computação
Turma 126 - Programação Orientada a Objetos
Professor Ricardo Pires Mesquita
============================================


..........................................................
Documentação do Aplicativo VIRTUAL KEYBOARD MACHINE - VKM
..........................................................


---------------------------------------------
	OBJETIVO DO PROGRAMA
---------------------------------------------
.
O aplicativo foi desenvolvido no formato gamificado com o objetivo de treinar o usuário a digitar corretamente sem a necessidade de olhar no teclado físico.

Trazendo alguns pricípios simples utilizados em games, como nome de "jogador" e uma tela bem desenhada e confortável para passar um tempo maior de prática,
o programa leva o usuário a aprender de maneira mais simples e menos cansativa, podendo também desafiar um amigo que esteja próximo.
.
.
---------------------------------------------
	DETALHES TÉCNICOS DO PROGRAMA	     
---------------------------------------------
.
O programa conta com componentes de tela herdadas da classe JFrame.
-JButton: como teclado virtual.
-JTextArea: para area de texto a ser preenchida nos desafios.
-JLabel: para mostrar as frases de desafio.
-JPanel: para organização dos itens na janela.
.
Utilizei para a leitura das teclas os métodos implementados da classe KeyListener.
-keyPressed: para identificar qual foi a tecla pressionada e linkar com o Botão respectivo.
-keyReleased: para setar a cor original do botão quando este for "despressionado".
-keyTyped: verifica se o botão pressionado é corresponde ao caractere de texto correto na frase de desafio. se for ele seta uma cor verde ao background do botão e printa no JTextArea a letra digitada
se não, o botão carrega u background vermelho e nada é posto no JTextArea.
.
Um método utilizado separadamente foi o nextLevel() que verifica se o usuário já digitou toda frase, tendo como positivo ele pulará para a proxima fase, caso chegue ao final de todas as frases, o programa mostrará sua pontuação que se dará pelo somatório do numero de erros cometidos durante o treino de digitação.
O método initialComponents é utilizado para setar os componentes visuais do JFrame na janela do game.
.
O programa se encontra da versão 2.0 e aguardando atualização para novos níveis.
.
Autor: Daniel Bulhões
Acadêmico de Engenharia de Computação
Aluno pela Unicarioca.
E-mail: danielalmeidabulhoes@gmail.com
tel: (21)99379-7407
Brasil, Rio de Janeiro.