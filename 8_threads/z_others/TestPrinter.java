import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.print.PrintService;
 
public class TestPrinter implements Printable
{
    public static void main(String [] args)
    {
        try
        {
            PrintService[] services = PrinterJob.lookupPrintServices();
            // if there is print services available, choose the first one 
            if (services.length > 0) 
            {
                 System.out.println("selected printer: " + services[2]);
                 PrinterJob pjob = PrinterJob.getPrinterJob();
                 pjob.setPrintService(services[2]);
                 pjob.setPrintable(new TestPrinter(), new PageFormat());
             }
        }
        catch(Throwable t)
        {
            t.printStackTrace();
        }
    }
 
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException 
    {
		System.out.println("Hello...");
        if (pageIndex == 0)
        {
            try
            {
                int width = (int)(8.5 * 72);
                int height = 72;
 
                // create a yellow bufferedimage
                BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                Graphics2D biG = bi.createGraphics();
                biG.setColor(Color.yellow);
                biG.fillRect(0, 0, width, height);
 
                // print the buffered image to the print graphic
                Graphics2D g2Print = (Graphics2D)graphics;
                g2Print.drawImage(bi, 0, 144, null);
 
                return Printable.PAGE_EXISTS;
            }
            catch(Throwable t)
            {
                t.printStackTrace();
            }
        }
 
        return Printable.NO_SUCH_PAGE;
    }
}