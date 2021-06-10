package my.app;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class CreateDataset {
	   XYDataset createDataset( ) {
	      XYSeries firefox = new XYSeries( "Firefox" );
	      for (double  i=0;i<20;i+=0.2) {
	    	  firefox.add( i , 5*Math.sin(i) );
	      }
	      
	      XYSeries chrome = new XYSeries( "Chrome" );
	      for (double  i=0;i<20;i+=0.2) {
	    	  chrome.add( i , 5*Math.sin(i*2) );
	      }
	      
	      XYSeries iexplorer = new XYSeries( "Explorer" );
	      for (double  i=0;i<20;i+=0.2) {
	    	  iexplorer.add( i , 5*Math.sin(i*4) );
	      }
	      
	      
	      XYSeriesCollection dataset = new XYSeriesCollection( );          
	      dataset.addSeries( firefox );          
	      dataset.addSeries( chrome );          
	      dataset.addSeries( iexplorer );
	      return dataset;
	   }
}
