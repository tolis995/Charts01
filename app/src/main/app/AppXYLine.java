package my.app;

import org.jfree.ui.RefineryUtilities;

/**
 * Hello world!
 *
 */
public class AppXYLine 
{
	 public static void main( String[ ] args ) {
	      XYLineChart_AWT chart = new XYLineChart_AWT("Call Block Propabilities",
	         "Call Block Propabilities");
	      
	      
	      chart.pack( );          
	      RefineryUtilities.centerFrameOnScreen( chart );          
	      chart.setVisible( true ); 
	   }
}
