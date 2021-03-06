/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * Esta clase hereda de Enemigo, implementa el metodo desplazarse.
 * @author Brayan Montañez & Luis Vargas
 */
public class TIE extends Enemy {
    
    /**
     * Constructor de la Clase TIE
     * @param InitX Posicion Inicial X
     * @param InitY Posicion Inicial Y
     */
    public TIE(int InitX, int InitY) {
        super(InitX, InitY, 5, new ImageIcon("Resources/TIE.png"));
    }
        
    /**
     * Este metodo proporciona el movimiento del enemigo, colocando limites de izquierda a derecha y proporcionando
     * un desplazamiento hacia abajo
     * @Override
     */
    @Override
    public void desplazarse(int SPEED) {
        
        super.getEnemy().setLocation( super.getEnemy().getX()+ super.getVelocidad(), super.getEnemy().getY()+SPEED-2);
       
        
    }
    
}
