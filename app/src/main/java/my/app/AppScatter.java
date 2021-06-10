package my.app;

import org.jfree.ui.RefineryUtilities;

/**
 * Hello world!
 *
 */
public class AppScatter 
{
	 public static void main( String[ ] args ) {
	      XYScatterChart_AWT chart = new XYScatterChart_AWT("Call Block Propabilities",
	         "Call Block Propabilities");
	      
	      
	      chart.pack( );          
	      RefineryUtilities.centerFrameOnScreen( chart );          
	      chart.setVisible( true ); 
	   }
}
