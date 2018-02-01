/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.ImageIcon;

/**
 *
 * @author Vinícius
 */
public class Efeitos 
{
    public Efeitos()
    {
    }
    
    public ImageIcon Visão(String s)
    {
        String caminho;
        caminho = "/Imagens/" + s + "2.jpg";
        ImageIcon i = new ImageIcon(getClass().getResource(caminho));
        return i;
    }
    
    public void Delay()
    {
        
    }
}
