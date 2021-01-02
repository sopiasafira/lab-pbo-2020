/**
 * Latihan 1 Modul Praktikum 7
 * Materi yang dibahas (COMPOSITION. , POLIMORFISME)
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 06 Desember 2020)
 */
public class Line
{
    private Point begin;
    private Point end; 
    
    public Line(int x1, int y1, int x2, int y2) 
    {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
     
    public Line(Point begin, Point end) 
    {
        this.begin = begin;
        this.end = end;
    }
    
    public Point getBegin() 
    {
        return begin; 
    }
    
    public void setBegin(Point begin) 
    {
        this.begin = begin; 
    }
     
    public Point getEnd()
    {
        return end;
    }
     
    public void setEnd(Point end)
    { 
        this.end = end;
    }
    
    public int getBeginX()
    {
        return begin.getX();
    }
    
    public void setBeginX(int x)
    {
        begin.setX(x);
    }
    //method yang ditambahkan dari sini dan seterusnya
    public int getBeginY()
    {
        return begin.getY();
    }
    
    public void setBeginY(int y)
    {
        begin.sety(y);
    }
    
    public int getEndX()
    {
        return end.getX();
    }
    
    public void setEndX(int x)
    {
        end.setX(x);
    }
    
    public int getEndY()
    {
        return end.getY();
    }
    
    public void setEndY(int y)
    {
        end.sety(y);
    }
    
    public String toString()
    {
        return "garis dengan titik" + super.toString();
    }
    
    public double getLength()
    {
        return Math.sqrt(Math.pow((end.getX()-begin.getX()), 2) + Math.pow((end.getY()-begin.getY()), 2));
    }
    

} 

 /*pada latihan ini kita diperintahkan untuk melengkapi method pada class Line dengan menambahkan method
 getBeginX,  setBeginX, getBeginY, setBeginY, getEndX, setEndX, getEndY, setEndY, toString dan getLength.
 */