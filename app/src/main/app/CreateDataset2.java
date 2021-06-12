package my.app;

import java.util.Random;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class CreateDataset2 {
	private Random r;
	   XYDataset createDataset( ) {
		// create the dataset...
		final XYSeriesCollection dataset = new XYSeriesCollection();
//
//		XYSeries chromeValues = new XYSeries("Chrome");
//		chromeValues.add(1, 72.1);
//		chromeValues.add(2, 80.3);
//		chromeValues.add(3, 90.4);
//		chromeValues.add(4, 100.1);
//		chromeValues.add(5, 110.2);
//		chromeValues.add(6, 112.3);
//		chromeValues.add(7, 122.4);
//		chromeValues.add(8, 132.2);
//		chromeValues.add(9, 142.2);
//		chromeValues.add(10, 152.2);
//
//		dataset.addSeries(chromeValues);
//
//		XYSeries firefoxValues = new XYSeries("Firefox");
//		firefoxValues.add(1, 62.3);
//		firefoxValues.add(2, 70.5);
//		firefoxValues.add(3, 80.6);
//		firefoxValues.add(4, 90.3);
//		firefoxValues.add(5, 100.5);
//		firefoxValues.add(6, 102.6);
//		firefoxValues.add(7, 112.5);
//		firefoxValues.add(8, 122.4);
//		firefoxValues.add(9, 132.3);
//		firefoxValues.add(10, 142.5);
		
		
		XYSeries ser1 = new XYSeries("Series 1");
		r=new Random();
		for (int i=1;i<100;i++) {
			ser1.add(i, 10*r.nextDouble());
		}
		
		XYSeries ser2 = new XYSeries("Series 2");
		for (int i=1;i<100;i++) {
			ser2.add(i, 8*r.nextDouble());
		}
		
		XYSeries ser3 = new XYSeries("Series 3");
		for (int i=1;i<100;i++) {
			ser3.add(i, 12*r.nextDouble());
		}
		
		dataset.addSeries(ser1);
		dataset.addSeries(ser2);
		dataset.addSeries(ser3);
		
		
		return dataset;
	   }
}
	   

