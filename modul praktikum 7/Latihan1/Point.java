
/**
 * Latihan 1 Modul Praktikum 7
 * Materi yang dibahas (COMPOSITION , POLIMORFISME)
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 06 Desember 2020)
 */
public class Point
{
    private int x;
    private int y;
     
    public Point() 
    { 
        x = 0;
        y = 0;
    }
     
    public Point(int x, int y)
    {
        this.x = x; 
        this.y = y;
    }
    
    public int getX()
    {
        return this.x; 
    }
     
    public void setX(int x)
    {
        this.x = x;
    }
     
    public int getY()
    { 
        return this.y;
    }
    
    public void sety(int y)
    { 
        this.y = y;
    } 
    
    public String toString()
    {
        return "Titik dengan x=" +x+ " y=" +y ;
    } 
}

    