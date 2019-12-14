
package gamePackage;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GameView extends JFrame implements KeyListener{
    public GameView(){
       
        this.addKeyListener(this);
        this.setFocusable(true);
        
        initialComponents();
        
        setLocationRelativeTo(this);
        setVisible(true);
        setResizable(false);
        this.requestFocusInWindow();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //setando as frases num array string para desafio
        challengeLevel[0] = frase1;
        challengeLevel[1] = frase2;
        challengeLevel[2] = frase3;
        challengeLevel[3] = frase4;
        jLabelChallengeLetter.setText(challengeLevel[fraseLevel]);
    }
    

    // Método para configuração dos componentes na tela
    private void initialComponents(){
        jPanelKeyboard = new JPanel();
        jButtonAc_Tio = new JButton();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButtonBackspace = new JButton();
        jButtonMais = new JButton();
        jButtonMenos = new JButton();
        jButton0 = new JButton();
        jButton9 = new JButton();
        jButtonI = new JButton();
        jButtonTab = new JButton();
        jButtonContraBarra = new JButton();
        jButtonQ = new JButton();
        jButtonFechaColchetes = new JButton();
        jButtonW = new JButton();
        jButtonAbreColchetes = new JButton();
        jButtonE = new JButton();
        jButtonP = new JButton();
        jButtonR = new JButton();
        jButtonO = new JButton();
        jButtonT = new JButton();
        jButtonY = new JButton();
        jButtonU = new JButton();
        jButtonA = new JButton();
        jButtonEnter = new JButton();
        jButtonS = new JButton();
        jButtonAsteristico = new JButton();
        jButtonD = new JButton();
        jButtonDoisPontos = new JButton();
        jButtonF = new JButton();
        jButtonL = new JButton();
        jButtonG = new JButton();
        jButtonH = new JButton();
        jButtonJ = new JButton();
        jButtonK = new JButton();
        jButtonCapslock = new JButton();
        jButtonVirgula = new JButton();
        jButtonShift = new JButton();
        jButtonZ = new JButton();
        jButtonX = new JButton();
        jButtonC = new JButton();
        jButtonInterrogacao = new JButton();
        jButtonV = new JButton();
        jButtonPonto = new JButton();
        jButtonB = new JButton();
        jButtonN = new JButton();
        jButtonM = new JButton();
        jButtonSpace = new JButton();
        jButtonDown = new JButton();
        jButtonLeft = new JButton();
        jButtonRight = new JButton();
        jButtonUp = new JButton();
        jPanelChallenge = new JPanel();
        jLabel1 = new JLabel();
        jLabelChallengeLetter = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextAreaChallenge = new JTextArea();
        
        
        jPanelKeyboard.setBackground(new java.awt.Color(36, 36, 36));

        jButtonAc_Tio.setBackground(new java.awt.Color(66, 66, 66));
        jButtonAc_Tio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAc_Tio.setText("~");
        jButtonAc_Tio.setBorder(null);
        jButtonAc_Tio.setBorderPainted(false);
        jButtonAc_Tio.setFocusPainted(false);

        jButton1.setBackground(new java.awt.Color(66, 66, 66));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        

        jButton2.setBackground(new java.awt.Color(66, 66, 66));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);

        jButton3.setBackground(new java.awt.Color(66, 66, 66));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);

        jButton4.setBackground(new java.awt.Color(66, 66, 66));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);

        jButton5.setBackground(new java.awt.Color(66, 66, 66));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);

        jButton6.setBackground(new java.awt.Color(66, 66, 66));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);

        jButton7.setBackground(new java.awt.Color(66, 66, 66));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);

        jButton8.setBackground(new java.awt.Color(66, 66, 66));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);

        jButtonBackspace.setBackground(new java.awt.Color(66, 66, 66));
        jButtonBackspace.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackspace.setText("BACKSPACE");
        jButtonBackspace.setBorderPainted(false);
        jButtonBackspace.setFocusPainted(false);

        jButtonMais.setBackground(new java.awt.Color(66, 66, 66));
        jButtonMais.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMais.setText("+");
        jButtonMais.setBorderPainted(false);
        jButtonMais.setFocusPainted(false);

        jButtonMenos.setBackground(new java.awt.Color(66, 66, 66));
        jButtonMenos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMenos.setText("-");
        jButtonMenos.setBorderPainted(false);
        jButtonMenos.setFocusPainted(false);

        jButton0.setBackground(new java.awt.Color(66, 66, 66));
        jButton0.setForeground(new java.awt.Color(255, 255, 255));
        jButton0.setText("0");
        jButton0.setBorderPainted(false);
        jButton0.setFocusPainted(false);

        jButton9.setBackground(new java.awt.Color(66, 66, 66));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.setBorderPainted(false);
        jButton9.setFocusPainted(false);

        jButtonI.setBackground(new java.awt.Color(66, 66, 66));
        jButtonI.setForeground(new java.awt.Color(255, 255, 255));
        jButtonI.setText("I");
        jButtonI.setBorderPainted(false);
        jButtonI.setFocusPainted(false);

        jButtonTab.setBackground(new java.awt.Color(66, 66, 66));
        jButtonTab.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTab.setText("TAB");
        jButtonTab.setBorderPainted(false);
        jButtonTab.setFocusPainted(false);

        jButtonContraBarra.setBackground(new java.awt.Color(66, 66, 66));
        jButtonContraBarra.setForeground(new java.awt.Color(255, 255, 255));
        jButtonContraBarra.setText("\\");
        jButtonContraBarra.setBorderPainted(false);
        jButtonContraBarra.setFocusPainted(false);

        jButtonQ.setBackground(new java.awt.Color(66, 66, 66));
        jButtonQ.setForeground(new java.awt.Color(255, 255, 255));
        jButtonQ.setText("Q");
        jButtonQ.setBorderPainted(false);
        jButtonQ.setFocusPainted(false);

        jButtonFechaColchetes.setBackground(new java.awt.Color(66, 66, 66));
        jButtonFechaColchetes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFechaColchetes.setText("]");
        jButtonFechaColchetes.setBorderPainted(false);
        jButtonFechaColchetes.setFocusPainted(false);

        jButtonW.setBackground(new java.awt.Color(66, 66, 66));
        jButtonW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonW.setText("W");
        jButtonW.setBorderPainted(false);
        jButtonW.setFocusPainted(false);

            jButtonAbreColchetes.setBackground(new java.awt.Color(66, 66, 66));
            jButtonAbreColchetes.setForeground(new java.awt.Color(255, 255, 255));
            jButtonAbreColchetes.setText("[");
            jButtonAbreColchetes.setBorderPainted(false);
            jButtonAbreColchetes.setFocusPainted(false);

            jButtonE.setBackground(new java.awt.Color(66, 66, 66));
            jButtonE.setForeground(new java.awt.Color(255, 255, 255));
            jButtonE.setText("E");
            jButtonE.setBorderPainted(false);
            jButtonE.setFocusPainted(false);

            jButtonP.setBackground(new java.awt.Color(66, 66, 66));
            jButtonP.setForeground(new java.awt.Color(255, 255, 255));
            jButtonP.setText("P");
            jButtonP.setBorderPainted(false);
            jButtonP.setFocusPainted(false);

            jButtonR.setBackground(new java.awt.Color(66, 66, 66));
            jButtonR.setForeground(new java.awt.Color(255, 255, 255));
            jButtonR.setText("R");
            jButtonR.setBorderPainted(false);
            jButtonR.setFocusPainted(false);

            jButtonO.setBackground(new java.awt.Color(66, 66, 66));
            jButtonO.setForeground(new java.awt.Color(255, 255, 255));
            jButtonO.setText("O");
            jButtonO.setBorderPainted(false);
            jButtonO.setFocusPainted(false);

            jButtonT.setBackground(new java.awt.Color(66, 66, 66));
            jButtonT.setForeground(new java.awt.Color(255, 255, 255));
            jButtonT.setText("T");
            jButtonT.setBorderPainted(false);
            jButtonT.setFocusPainted(false);

            jButtonY.setBackground(new java.awt.Color(66, 66, 66));
            jButtonY.setForeground(new java.awt.Color(255, 255, 255));
            jButtonY.setText("Y");
            jButtonY.setBorderPainted(false);
            jButtonY.setFocusPainted(false);

            jButtonU.setBackground(new java.awt.Color(66, 66, 66));
            jButtonU.setForeground(new java.awt.Color(255, 255, 255));
            jButtonU.setText("U");
            jButtonU.setBorderPainted(false);
            jButtonU.setFocusPainted(false);

            jButtonA.setBackground(new java.awt.Color(66, 66, 66));
            jButtonA.setForeground(new java.awt.Color(255, 255, 255));
            jButtonA.setText("A");
            jButtonA.setBorderPainted(false);
            jButtonA.setFocusPainted(false);
            

            jButtonEnter.setBackground(new java.awt.Color(66, 66, 66));
            jButtonEnter.setForeground(new java.awt.Color(255, 255, 255));
            jButtonEnter.setText("ENTER");
            jButtonEnter.setBorderPainted(false);
            jButtonEnter.setFocusPainted(false);

            jButtonS.setBackground(new java.awt.Color(66, 66, 66));
            jButtonS.setForeground(new java.awt.Color(255, 255, 255));
            jButtonS.setText("S");
            jButtonS.setBorderPainted(false);
            jButtonS.setFocusPainted(false);
            

            jButtonAsteristico.setBackground(new java.awt.Color(66, 66, 66));
            jButtonAsteristico.setForeground(new java.awt.Color(255, 255, 255));
            jButtonAsteristico.setText("*");
            jButtonAsteristico.setBorderPainted(false);
            jButtonAsteristico.setFocusPainted(false);

            jButtonD.setBackground(new java.awt.Color(66, 66, 66));
            jButtonD.setForeground(new java.awt.Color(255, 255, 255));
            jButtonD.setText("D");
            jButtonD.setBorderPainted(false);
            jButtonD.setFocusPainted(false);

            jButtonDoisPontos.setBackground(new java.awt.Color(66, 66, 66));
            jButtonDoisPontos.setForeground(new java.awt.Color(255, 255, 255));
            jButtonDoisPontos.setText(":");
            jButtonDoisPontos.setBorderPainted(false);
            jButtonDoisPontos.setFocusPainted(false);

            jButtonF.setBackground(new java.awt.Color(66, 66, 66));
            jButtonF.setForeground(new java.awt.Color(255, 255, 255));
            jButtonF.setText("F");
            jButtonF.setBorderPainted(false);
            jButtonF.setFocusPainted(false);

            jButtonL.setBackground(new java.awt.Color(66, 66, 66));
            jButtonL.setForeground(new java.awt.Color(255, 255, 255));
            jButtonL.setText("L");
            jButtonL.setBorderPainted(false);
            jButtonL.setFocusPainted(false);

            jButtonG.setBackground(new java.awt.Color(66, 66, 66));
            jButtonG.setForeground(new java.awt.Color(255, 255, 255));
            jButtonG.setText("G");
            jButtonG.setBorderPainted(false);
            jButtonG.setFocusPainted(false);

            jButtonH.setBackground(new java.awt.Color(66, 66, 66));
            jButtonH.setForeground(new java.awt.Color(255, 255, 255));
            jButtonH.setText("H");
            jButtonH.setBorderPainted(false);
            jButtonH.setFocusPainted(false);

            jButtonJ.setBackground(new java.awt.Color(66, 66, 66));
            jButtonJ.setForeground(new java.awt.Color(255, 255, 255));
            jButtonJ.setText("J");
            jButtonJ.setBorderPainted(false);
            jButtonJ.setFocusPainted(false);

            jButtonK.setBackground(new java.awt.Color(66, 66, 66));
            jButtonK.setForeground(new java.awt.Color(255, 255, 255));
            jButtonK.setText("K");
            jButtonK.setBorderPainted(false);
            jButtonK.setFocusPainted(false);

            jButtonCapslock.setBackground(new java.awt.Color(66, 66, 66));
            jButtonCapslock.setForeground(new java.awt.Color(255, 255, 255));
            jButtonCapslock.setText("CAPS LOCK");
            jButtonCapslock.setBorderPainted(false);
            jButtonCapslock.setFocusPainted(false);

            jButtonVirgula.setBackground(new java.awt.Color(66, 66, 66));
            jButtonVirgula.setForeground(new java.awt.Color(255, 255, 255));
            jButtonVirgula.setText(",");
            jButtonVirgula.setBorderPainted(false);
            jButtonVirgula.setFocusPainted(false);

            jButtonShift.setBackground(new java.awt.Color(66, 66, 66));
            jButtonShift.setForeground(new java.awt.Color(255, 255, 255));
            jButtonShift.setText("SHIFT");
            jButtonShift.setBorderPainted(false);
            jButtonShift.setFocusPainted(false);

            jButtonZ.setBackground(new java.awt.Color(66, 66, 66));
            jButtonZ.setForeground(new java.awt.Color(255, 255, 255));
            jButtonZ.setText("Z");
            jButtonZ.setBorderPainted(false);
            jButtonZ.setFocusPainted(false);

            jButtonX.setBackground(new java.awt.Color(66, 66, 66));
            jButtonX.setForeground(new java.awt.Color(255, 255, 255));
            jButtonX.setText("X");
            jButtonX.setBorderPainted(false);
            jButtonX.setFocusPainted(false);

            jButtonC.setBackground(new java.awt.Color(66, 66, 66));
            jButtonC.setForeground(new java.awt.Color(255, 255, 255));
            jButtonC.setText("C");
            jButtonC.setBorderPainted(false);
            jButtonC.setFocusPainted(false);

            jButtonInterrogacao.setBackground(new java.awt.Color(66, 66, 66));
            jButtonInterrogacao.setForeground(new java.awt.Color(255, 255, 255));
            jButtonInterrogacao.setText("?");
            jButtonInterrogacao.setBorderPainted(false);
            jButtonInterrogacao.setFocusPainted(false);
            

            jButtonV.setBackground(new java.awt.Color(66, 66, 66));
            jButtonV.setForeground(new java.awt.Color(255, 255, 255));
            jButtonV.setText("V");
            jButtonV.setBorderPainted(false);
            jButtonV.setFocusPainted(false);

            jButtonPonto.setBackground(new java.awt.Color(66, 66, 66));
            jButtonPonto.setForeground(new java.awt.Color(255, 255, 255));
            jButtonPonto.setText(".");
            jButtonPonto.setBorderPainted(false);
            jButtonPonto.setFocusPainted(false);

            jButtonB.setBackground(new java.awt.Color(66, 66, 66));
            jButtonB.setForeground(new java.awt.Color(255, 255, 255));
            jButtonB.setText("B");
            jButtonB.setBorderPainted(false);
            jButtonB.setFocusPainted(false);

            jButtonN.setBackground(new java.awt.Color(66, 66, 66));
            jButtonN.setForeground(new java.awt.Color(255, 255, 255));
            jButtonN.setText("N");
            jButtonN.setBorderPainted(false);
            jButtonN.setFocusPainted(false);

            jButtonM.setBackground(new java.awt.Color(66, 66, 66));
            jButtonM.setForeground(new java.awt.Color(255, 255, 255));
            jButtonM.setText("M");
            jButtonM.setBorderPainted(false);
            jButtonM.setFocusPainted(false);

            jButtonSpace.setBackground(new java.awt.Color(66, 66, 66));
            jButtonSpace.setForeground(new java.awt.Color(255, 255, 255));
            jButtonSpace.setText("SPACE");
            jButtonSpace.setBorderPainted(false);
            jButtonSpace.setFocusPainted(false);

            jButtonDown.setBackground(new java.awt.Color(66, 66, 66));
            jButtonDown.setForeground(new java.awt.Color(255, 255, 255));
            jButtonDown.setText("v");
            jButtonDown.setBorderPainted(false);
            jButtonDown.setFocusPainted(false);

            jButtonLeft.setBackground(new java.awt.Color(66, 66, 66));
            jButtonLeft.setForeground(new java.awt.Color(255, 255, 255));
            jButtonLeft.setText("<");
            jButtonLeft.setBorderPainted(false);
            jButtonLeft.setFocusPainted(false);

            jButtonRight.setBackground(new java.awt.Color(66, 66, 66));
            jButtonRight.setForeground(new java.awt.Color(255, 255, 255));
            jButtonRight.setText(">");
            jButtonRight.setBorderPainted(false);
            jButtonRight.setFocusPainted(false);

            jButtonUp.setBackground(new java.awt.Color(66, 66, 66));
            jButtonUp.setForeground(new java.awt.Color(255, 255, 255));
            jButtonUp.setText("^");
            jButtonUp.setBorderPainted(false);
            jButtonUp.setFocusPainted(false);

            jPanelChallenge.setBackground(new java.awt.Color(36, 36, 36));

            jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("DESAFIO:");

            jLabelChallengeLetter.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
            jLabelChallengeLetter.setForeground(new java.awt.Color(255, 255, 255));
            

            jTextAreaChallenge.setBackground(new java.awt.Color(234, 234, 234));
            jTextAreaChallenge.setColumns(20);
            jTextAreaChallenge.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
            jTextAreaChallenge.setRows(5);
            jTextAreaChallenge.setFocusable(false);
            
            jScrollPane1.setViewportView(jTextAreaChallenge);

            javax.swing.GroupLayout jPanelChallengeLayout = new javax.swing.GroupLayout(jPanelChallenge);
            jPanelChallenge.setLayout(jPanelChallengeLayout);
            jPanelChallengeLayout.setHorizontalGroup(
                jPanelChallengeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChallengeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelChallengeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanelChallengeLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelChallengeLetter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            jPanelChallengeLayout.setVerticalGroup(
                jPanelChallengeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelChallengeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelChallengeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelChallengeLetter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );


            javax.swing.GroupLayout jPanelKeyboardLayout = new javax.swing.GroupLayout(jPanelKeyboard);
            jPanelKeyboard.setLayout(jPanelKeyboardLayout);
            jPanelKeyboardLayout.setHorizontalGroup(
                jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                            .addComponent(jButtonAc_Tio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonBackspace))
                        .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                .addComponent(jButtonCapslock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAsteristico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKeyboardLayout.createSequentialGroup()
                                    .addComponent(jButtonTab)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonAbreColchetes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonFechaColchetes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonContraBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                    .addComponent(jButtonShift)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                            .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addComponent(jButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonInterrogacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                            .addComponent(jButtonDown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap(21, Short.MAX_VALUE))
                .addComponent(jPanelChallenge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanelKeyboardLayout.setVerticalGroup(
                jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKeyboardLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanelChallenge, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAc_Tio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonTab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAbreColchetes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonFechaColchetes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonContraBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCapslock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAsteristico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonShift, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonInterrogacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonDown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(19, 19, 19))
            );

            getContentPane().add(jPanelKeyboard, java.awt.BorderLayout.CENTER);

            pack();
    }
    
    
    //Declaração de variaveis
    private JButton jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9;
    private JButton jButtonA, jButtonAbreColchetes, jButtonAc_Tio, jButtonAsteristico, jButtonB, jButtonBackspace, jButtonC;
    private JButton jButtonCapslock, jButtonContraBarra, jButtonD, jButtonDoisPontos, jButtonDown, jButtonE, jButtonEnter;
    private JButton jButtonF, jButtonFechaColchetes, jButtonG, jButtonH, jButtonI, jButtonInterrogacao, jButtonJ, jButtonK;
    private JButton jButtonL, jButtonLeft, jButtonM, jButtonMais, jButtonMenos, jButtonN, jButtonO, jButtonP, jButtonPonto;
    private JButton jButtonQ, jButtonR, jButtonRight, jButtonS, jButtonShift, jButtonSpace, jButtonT, jButtonTab;
    private JButton jButtonU, jButtonUp, jButtonV, jButtonVirgula, jButtonW, jButtonX, jButtonY, jButtonZ;
    private JLabel jLabel1,jLabelChallengeLetter;
    private JPanel jPanelChallenge, jPanelKeyboard;
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaChallenge;
    public String player;
    private String typedChar = "";
    private final String keyIndice = "1234567890qwertyuiopasdfghjklzxcvbnm,. ";
    private JButton aux = new JButton();
    int fraseLevel = 0;
    private String challengeLevel[] = new String[4];
    private final String
            frase1 = "grave e cabisbaixo, o filho justo zelava pela querida mae doente",
            frase2 = "marta foi a cozinha pois queria ver belo jogo de xicaras",
            frase3 = "hoje a noite, sem luz, decidi xeretar a quinta gaveta de vovo. achei linguiça, pao e fuba",
            frase4 = "gazeta publica hoje breve anuncio de faxina na quermesse";
    //O nivel 2 ainda não está configurado.
    /*private String challenge2 = "﻿The quick brown fox jumps over a lazy dog/"
            + "Sphinx of black quartz, judge my vow";
    private final String challenge3 = "AINDA NÃO POSSUI CONFIGURAÇÃO";*/
    
    
    //Variaveis contadoras
    int erros = 0;
    int i = 0;
    char c;
    
    //Método que define o proximo nivel e a proxima frase do jogo
    public void nextLevel(){
        
        fraseLevel++;
        if(fraseLevel > 3){
            JOptionPane.showMessageDialog(null, "" +player+ ", Parabens! você venceu o primeiro nível!!\nAguarde atualização para o próximo nível!");
            JOptionPane.showMessageDialog(null, "Número de erros: " +erros);
            fraseLevel = 0;
            jLabelChallengeLetter.setText(challengeLevel[fraseLevel]);
            i = 0;
            typedChar = "";
            jTextAreaChallenge.setText("");
            JOptionPane.showMessageDialog(null, "PRONTO PARA COMEÇAR NOVAMENTE?");
        }else{
        JOptionPane.showMessageDialog(null, "Próxima frase!");
        jLabelChallengeLetter.setText(challengeLevel[fraseLevel]);
        i = 0;
        typedChar = "";
        jTextAreaChallenge.setText("");
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        Color cor;
        if(e.getKeyChar() == jLabelChallengeLetter.getText().charAt(i)){
            i++;
            c = e.getKeyChar();
            typedChar += c;
            jTextAreaChallenge.setText(typedChar);
            cor = Color.green;
        }else{
            cor = Color.red;
            erros++;
        }
        aux.setBackground(cor);
        if (i == jLabelChallengeLetter.getText().length()){
            nextLevel();
        }
    }
    
    
    
    @Override
    public void keyPressed(KeyEvent e) {
        for(int i = 0; i <= 38; i++){
            if (e.getKeyChar() == keyIndice.charAt(0)){
                aux = jButton1;
            }else if (e.getKeyChar() == keyIndice.charAt(1)){
                aux = jButton2;
            }else if (e.getKeyChar() == keyIndice.charAt(2)){
                aux = jButton3;
            }else if (e.getKeyChar() == keyIndice.charAt(3)){
                aux = jButton4;
            }else if (e.getKeyChar() == keyIndice.charAt(4)){
                aux = jButton5;
            }else if (e.getKeyChar() == keyIndice.charAt(5)){
                aux = jButton6;
            }else if (e.getKeyChar() == keyIndice.charAt(6)){
                aux = jButton7;
            }else if (e.getKeyChar() == keyIndice.charAt(7)){
                aux = jButton8;
            }else if (e.getKeyChar() == keyIndice.charAt(8)){
                aux = jButton9;
            }else if (e.getKeyChar() == keyIndice.charAt(9)){
                aux = jButton0;
            }else if (e.getKeyChar() == keyIndice.charAt(10)){
                aux = jButtonQ;
            }else if (e.getKeyChar() == keyIndice.charAt(11)){
                aux = jButtonW;
            }else if (e.getKeyChar() == keyIndice.charAt(12)){
                aux = jButtonE;
            }else if (e.getKeyChar() == keyIndice.charAt(13)){
                aux = jButtonR;
            }else if (e.getKeyChar() == keyIndice.charAt(14)){
                aux = jButtonT;
            }else if (e.getKeyChar() == keyIndice.charAt(15)){
                aux = jButtonY;
            }else if (e.getKeyChar() == keyIndice.charAt(16)){
                aux = jButtonU;
            }else if (e.getKeyChar() == keyIndice.charAt(17)){
                aux = jButtonI;
            }else if (e.getKeyChar() == keyIndice.charAt(18)){
                aux = jButtonO;
            }else if (e.getKeyChar() == keyIndice.charAt(19)){
                aux = jButtonP;
            }else if (e.getKeyChar() == keyIndice.charAt(20)){
                aux = jButtonA;
            }else if (e.getKeyChar() == keyIndice.charAt(21)){
                aux = jButtonS;
            }else if (e.getKeyChar() == keyIndice.charAt(22)){
                aux = jButtonD;
            }else if (e.getKeyChar() == keyIndice.charAt(23)){
                aux = jButtonF;
            }else if (e.getKeyChar() == keyIndice.charAt(24)){
                aux = jButtonG;
            }else if (e.getKeyChar() == keyIndice.charAt(25)){
                aux = jButtonH;
            }else if (e.getKeyChar() == keyIndice.charAt(26)){
                aux = jButtonJ;
            }else if (e.getKeyChar() == keyIndice.charAt(27)){
                aux = jButtonK;
            }else if (e.getKeyChar() == keyIndice.charAt(28)){
                aux = jButtonL;
            }else if (e.getKeyChar() == keyIndice.charAt(29)){
                aux = jButtonZ;
            }else if (e.getKeyChar() == keyIndice.charAt(30)){
                aux = jButtonX;
            }else if (e.getKeyChar() == keyIndice.charAt(31)){
                aux = jButtonC;
            }else if (e.getKeyChar() == keyIndice.charAt(32)){
                aux = jButtonV;
            }else if (e.getKeyChar() == keyIndice.charAt(33)){
                aux = jButtonB;
            }else if (e.getKeyChar() == keyIndice.charAt(34)){
                aux = jButtonN;
            }else if (e.getKeyChar() == keyIndice.charAt(35)){
                aux = jButtonM;
            }else if (e.getKeyChar() == keyIndice.charAt(36)){
                aux = jButtonVirgula;
            }else if (e.getKeyChar() == keyIndice.charAt(37)){
                aux = jButtonPonto;
            }else if (e.getKeyChar() == keyIndice.charAt(38)){
                aux = jButtonSpace;
            }
            else{
                JOptionPane.showMessageDialog(null,"Não encontrada");
                break;
            }
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        aux.setBackground(new java.awt.Color(66, 66, 66));
    }

}
