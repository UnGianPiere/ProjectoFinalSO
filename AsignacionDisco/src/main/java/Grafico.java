
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Grafico {
    
    //Crear un JPanel para poder Plasmarlo en el Panel Creado en el Formulario
    private final JPanel panel_grafica;
    private final int w ;
    private final int h ;

    public Grafico(JPanel panel_grafica) {
        this.panel_grafica = panel_grafica;
        w = panel_grafica.getWidth()-10;
        h = panel_grafica.getHeight()-10;
        
    } 
    public void graficar(int[] datos,int nPDisco){
        int nPSoli = datos.length;
        Graphics2D g = (Graphics2D) panel_grafica.getGraphics();
        
        //Limpiar el JPane para nuevos Gráficos
        g.clearRect(0, 0, w, h);
        
        
        //Graficar las Lineas Horizontales
        for(int i =0;i<nPSoli;i++)
        {
            g.drawLine(0,15+(i*(h/nPSoli)),w,15+(i*(h/nPSoli)));
        }
        //Graficar los puntos 
      
        for(int i =0;i<nPDisco+1;i++)
        {
            g.drawLine(0+(i*(w/nPDisco)), 0, 0+(i*(w/nPDisco)), 10);
        }
        
        Puntos(datos, nPDisco);
        
        
    };
    
    public void Puntos(int[] datos,int nPDisco){
        int nPSoli = datos.length;
        int x,x2;
        int y,y2;
        Graphics2D g = (Graphics2D) panel_grafica.getGraphics();
               
        
        //Graficar las Lineas Horizontales
        for(int i =0;i<nPSoli;i++)
        {
            //Puntos
            x = 0+(datos[i]*(w/nPDisco));
            y = 15+(i*(h/nPSoli));
            g.setColor(Color.RED);
            g.fillOval(x - 4, y - 4, 8, 8);
            g.setColor(Color.ORANGE);
            
            //Unión de Puntos
            if(i<nPSoli-1)
            {
               x2 = 0+(datos[i+1]*(w/nPDisco));
               y2 = 15+((i+1)*(h/nPSoli));
               g.drawLine(x,y,x2,y2);
            }
            
        }
    };
    
    
    
}
