/*
Autor: Daniel A. Bulhões
Matrícula: 2016200817
Prof.º: Ricardo P. Mesquita
Programação orientada a objetos
Turma: 126
.
APS - VKM - VIRTUAL KEYBOARD MACHINE
*/

package gamePackage;

import javax.swing.JOptionPane;

public class GameDriver {
    public static void main(String[] args){
        GameView game = new GameView();
        
        String nome = JOptionPane.showInputDialog(null, "Dados do jogador", "");
        game.player = nome;
        
    }
}
