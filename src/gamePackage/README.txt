============================================
	DADOS DO ALUNO
============================================
Daniel A. Bulh�es
2016200817
Engenharia de computa��o
Turma 126 - Programa��o Orientada a Objetos
Professor Ricardo Pires Mesquita
============================================


..........................................................
Documenta��o do Aplicativo VIRTUAL KEYBOARD MACHINE - VKM
..........................................................


---------------------------------------------
	OBJETIVO DO PROGRAMA
---------------------------------------------
.
O aplicativo foi desenvolvido no formato gamificado com o objetivo de treinar o usu�rio a digitar corretamente sem a necessidade de olhar no teclado f�sico.

Trazendo alguns pric�pios simples utilizados em games, como nome de "jogador" e uma tela bem desenhada e confort�vel para passar um tempo maior de pr�tica,
o programa leva o usu�rio a aprender de maneira mais simples e menos cansativa, podendo tamb�m desafiar um amigo que esteja pr�ximo.
.
.
---------------------------------------------
	DETALHES T�CNICOS DO PROGRAMA	     
---------------------------------------------
.
O programa conta com componentes de tela herdadas da classe JFrame.
-JButton: como teclado virtual.
-JTextArea: para area de texto a ser preenchida nos desafios.
-JLabel: para mostrar as frases de desafio.
-JPanel: para organiza��o dos itens na janela.
.
Utilizei para a leitura das teclas os m�todos implementados da classe KeyListener.
-keyPressed: para identificar qual foi a tecla pressionada e linkar com o Bot�o respectivo.
-keyReleased: para setar a cor original do bot�o quando este for "despressionado".
-keyTyped: verifica se o bot�o pressionado � corresponde ao caractere de texto correto na frase de desafio. se for ele seta uma cor verde ao background do bot�o e printa no JTextArea a letra digitada
se n�o, o bot�o carrega u background vermelho e nada � posto no JTextArea.
.
Um m�todo utilizado separadamente foi o nextLevel() que verifica se o usu�rio j� digitou toda frase, tendo como positivo ele pular� para a proxima fase, caso chegue ao final de todas as frases, o programa mostrar� sua pontua��o que se dar� pelo somat�rio do numero de erros cometidos durante o treino de digita��o.
O m�todo initialComponents � utilizado para setar os componentes visuais do JFrame na janela do game.
.
O programa se encontra da vers�o 2.0 e aguardando atualiza��o para novos n�veis.
.
Autor: Daniel Bulh�es
Acad�mico de Engenharia de Computa��o
Aluno pela Unicarioca.
E-mail: danielalmeidabulhoes@gmail.com
tel: (21)99379-7407
Brasil, Rio de Janeiro.