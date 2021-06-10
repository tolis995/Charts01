package my.app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

public class XYScatterChart_AWT extends ApplicationFrame {
	private static final long serialVersionUID = 1L;
	private CreateDataset2 crDataset = new CreateDataset2();

public XYScatterChart_AWT( String applicationTitle, String chartTitle ) {
      super(applicationTitle);
      NumberFormat formatter = new DecimalFormat("0.######E0");
      
      
      
      JFreeChart chart = ChartFactory.createScatterPlot(chartTitle, "X-Axis", "Y-Axis", crDataset.createDataset(),
    			PlotOrientation.VERTICAL, true, true, true);

   // Changes background color
  	XYPlot plot = (XYPlot) chart.getPlot();
  	plot.setBackgroundPaint(new Color(255, 228, 196));
  	
//  	NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
//    rangeAxis.setNumberFormatOverride(formatter);
    
    NumberAxis xAxis = (NumberAxis) plot.getDomainAxis();
    xAxis.setNumberFormatOverride(formatter);

 
    
  	// Adding chart into a chart panel
  	ChartPanel chartPanel = new ChartPanel(chart );

  	// settind default size
  	chartPanel.setPreferredSize(new java.awt.Dimension(700, 470));

  	// add to contentPane
  	setContentPane(chartPanel);
//  	System.out.println("HELLO");
      
   }
   
 
}
