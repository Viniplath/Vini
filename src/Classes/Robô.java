/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;

/**
 *
 * @author Vinícius
 */
public class Robô 
{
    private int c;
    private int l;
    private String v;
    
    Random a;
    
    public Robô()
    {
        a = new Random();
        setC(a.nextInt(10));
        setL(a.nextInt(10));
        v = "Baixo";
    }
    
    public int getC() 
    {
        return c;
    }
    public void setC(int c) 
    {
        if (c == 10)
            c = 0;
        if (c == -1)
            c = 9;
        this.c = c;
    }

    public int getL()
    {
        return l;
    }
    public void setL(int l) 
    {
        if (l == 10)
            l = 0;
        if (l == -1)
            l = 9;
        this.l = l;
    }
    
    public String getV() 
    {
        return v;
    }
    public void setV(String v) 
    {
        this.v = v;
    }
    
    public void Andar(String direção)
    {
        switch(direção)
        {
            case "Cima":
                setL(l-1);
                break;
                
            case "Baixo":
                setL(l+1);
                break;
                
            case "Direita":
                setC(c+1);
                break;
                
            case "Esquerda":
                setC(c-1);
                break;
        }
    }
}
