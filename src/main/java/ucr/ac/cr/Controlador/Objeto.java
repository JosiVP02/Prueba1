/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Controlador;

/**
 *
 * @author Usuario
 */
public class Objeto 
{
    private int aid ;
    private String nombre;

    public Objeto(int aid, String nombre) 
    {
        this.aid = aid;
        this.nombre = nombre;
    }

    public int getAid() 
    {
        return aid;
    }

    public void setAid(int aid) 
    {
        this.aid = aid;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    @Override
    public String toString() 
    {
        return "Objeto" + "aid=" + aid + ", nombre=" + nombre;
    }
    
    
    l,
     
}
