package org.jfree.chart.plot;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "San4sSerif";
    Object v1 = -41.872498427529116D;
    Object v2 = -5.380797605724765D;
    Object v3 = new org.jfree.data.Range((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v0),((org.jfree.data.Range)v3));
    Object v5 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v4));
    Object v6 = "San4sSerif";
    Object v7 = -41.872498427529116D;
    Object v8 = -5.380797605724765D;
    Object v9 = new org.jfree.data.Range((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v6),((org.jfree.data.Range)v9));
    Object v11 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v10));
    Object v12 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v11));
    ((org.jfree.chart.plot.Plot)v5).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v12));
    Object v13 = null;
    Object v14 = 0.0F;
    ((org.jfree.chart.plot.Plot)v5).setBackgroundImageAlpha((((java.lang.Float)v14).floatValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "San4sSerif";
    Object v1 = -41.872498427529116D;
    Object v2 = -5.380797605724765D;
    Object v3 = new org.jfree.data.Range((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v0),((org.jfree.data.Range)v3));
    Object v5 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v4));
    Object v6 = 0;
    ((org.jfree.chart.plot.Plot)v5).setBackgroundImageAlignment((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v3 = new org.jfree.data.xy.XYCoordinate();
    Object v4 = ((org.jfree.data.KeyedValues2D)v2).getColumnIndex(((java.lang.Comparable)v3));
    ((org.jfree.chart.plot.MultiplePiePlot)v1).setDataset(((org.jfree.data.category.CategoryDataset)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = new org.jfree.data.xy.XYCoordinate();
    ((org.jfree.chart.plot.MultiplePiePlot)v1).setAggregatedItemsKey(((java.lang.Comparable)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = "Null 'paint' argumeTt.";
    Object v4 = 0;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    ((org.jfree.chart.plot.Plot)v2).setNoDataMessagePaint(((java.awt.Paint)v5));
    Object v6 = null;
    Object v7 = -40.44353F;
    ((org.jfree.chart.plot.Plot)v2).setBackgroundImageAlpha((((java.lang.Float)v7).floatValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "San4sSerif";
    Object v1 = -41.872498427529116D;
    Object v2 = -5.380797605724765D;
    Object v3 = new org.jfree.data.Range((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v0),((org.jfree.data.Range)v3));
    Object v5 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v4));
    Object v6 = 23.343264599052247D;
    ((org.jfree.chart.plot.Plot)v5).zoom((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = "San4sSerif";
    Object v4 = -41.872498427529116D;
    Object v5 = -5.380797605724765D;
    Object v6 = new org.jfree.data.Range((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v3),((org.jfree.data.Range)v6));
    Object v8 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v7));
    Object v9 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v8));
    ((org.jfree.chart.plot.Plot)v2).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v9));
    Object v10 = null;
    Object v11 = "San4sSerif";
    Object v12 = -41.872498427529116D;
    Object v13 = -5.380797605724765D;
    Object v14 = new org.jfree.data.Range((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v11),((org.jfree.data.Range)v14));
    Object v16 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v15));
    Object v17 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v16));
    ((org.jfree.chart.plot.Plot)v2).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = "San4sSerif";
    Object v4 = -41.872498427529116D;
    Object v5 = -5.380797605724765D;
    Object v6 = new org.jfree.data.Range((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v3),((org.jfree.data.Range)v6));
    Object v8 = new org.jfree.chart.event.AxisChangeEvent(((org.jfree.chart.axis.Axis)v7));
    ((org.jfree.chart.plot.Plot)v2).axisChanged(((org.jfree.chart.event.AxisChangeEvent)v8));
    Object v9 = null;
    Object v10 = -15.7427225F;
    ((org.jfree.chart.plot.Plot)v2).setForegroundAlpha((((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = -34;
    ((org.jfree.chart.plot.Plot)v2).setBackgroundImageAlignment((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.MultiplePiePlot)v2).getDataExtractOrder();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Null 'paint' argumeTt.";
    Object v5 = 0;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.awt.Transparency)v6).getTransparency();
    ((org.jfree.chart.plot.Plot)v3).setBackgroundPaint(((java.awt.Paint)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = "Null 'paint' argumeTt.";
    Object v4 = 0;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    ((org.jfree.chart.plot.Plot)v2).setNoDataMessagePaint(((java.awt.Paint)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getDrawingSupplier();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.MultiplePiePlot)v2).getLegendItems();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getBackgroundImageAlignment();
    org.junit.Assert.assertEquals((Object)(15), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getInsets();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = "Null 'paint' airgument.";
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = new org.jfree.data.general.DefaultPieDataset(((org.jfree.data.KeyedValues)v3));
    Object v5 = true;
    Object v6 = true;
    Object v7 = false;
    Object v8 = org.jfree.chart.ChartFactory.createPieChart3D(((java.lang.String)v2),((org.jfree.data.general.PieDataset)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    ((org.jfree.chart.plot.MultiplePiePlot)v1).setPieChart(((org.jfree.chart.JFreeChart)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Null 'paint' argumeTt.";
    Object v5 = 0;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.plot.MultiplePiePlot)v3).setAggregatedItemsPaint(((java.awt.Paint)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Null 'paint' airgument.";
    Object v5 = new org.jfree.data.DefaultKeyedValues();
    Object v6 = new org.jfree.data.general.DefaultPieDataset(((org.jfree.data.KeyedValues)v5));
    Object v7 = true;
    Object v8 = true;
    Object v9 = false;
    Object v10 = org.jfree.chart.ChartFactory.createPieChart3D(((java.lang.String)v4),((org.jfree.data.general.PieDataset)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    ((org.jfree.chart.plot.Plot)v3).removeChangeListener(((org.jfree.chart.event.PlotChangeListener)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = "Null 'paint' argumeTt.";
    Object v4 = 0;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    ((org.jfree.chart.plot.Plot)v2).setOutlinePaint(((java.awt.Paint)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    ((org.jfree.chart.plot.MultiplePiePlot)v3).setDataset(((org.jfree.data.category.CategoryDataset)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.MultiplePiePlot)v2).getPieChart();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v5 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v4));
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    Object v7 = ((org.jfree.chart.plot.Plot)v6).getInsets();
    Object v8 = false;
    ((org.jfree.chart.plot.Plot)v3).setInsets(((org.jfree.chart.util.RectangleInsets)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = 0;
    Object v4 = new java.util.HashMap((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.awt.Font(((java.util.Map)v4));
    ((org.jfree.chart.plot.Plot)v2).setNoDataMessageFont(((java.awt.Font)v5));
    Object v6 = null;
    Object v7 = 0;
    Object v8 = new java.util.HashMap((((java.lang.Integer)v7).intValue()));
    Object v9 = new java.awt.Font(((java.util.Map)v8));
    ((org.jfree.chart.plot.Plot)v2).setNoDataMessageFont(((java.awt.Font)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.data.xy.XYCoordinate();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)v4),((org.jfree.data.general.Dataset)v5));
    Object v7 = ((java.util.EventObject)v6).toString();
    ((org.jfree.chart.plot.Plot)v3).datasetChanged(((org.jfree.data.general.DatasetChangeEvent)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = "Null 'paint' argumeTt.";
    Object v4 = 0;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    ((org.jfree.chart.plot.Plot)v2).setBackgroundPaint(((java.awt.Paint)v5));
    Object v6 = null;
    Object v7 = "Null 'paint' airgument.";
    Object v8 = new org.jfree.data.DefaultKeyedValues();
    Object v9 = new org.jfree.data.general.DefaultPieDataset(((org.jfree.data.KeyedValues)v8));
    Object v10 = true;
    Object v11 = true;
    Object v12 = false;
    Object v13 = org.jfree.chart.ChartFactory.createPieChart3D(((java.lang.String)v7),((org.jfree.data.general.PieDataset)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    ((org.jfree.chart.plot.Plot)v2).removeChangeListener(((org.jfree.chart.event.PlotChangeListener)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getOutlineStroke();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = 0;
    Object v4 = new java.util.HashMap((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.awt.Font(((java.util.Map)v4));
    ((org.jfree.chart.plot.Plot)v2).setNoDataMessageFont(((java.awt.Font)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).isSubplot();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v4 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v3));
    Object v5 = ((org.jfree.chart.plot.Plot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getInsets();
    Object v7 = false;
    ((org.jfree.chart.plot.Plot)v2).setInsets(((org.jfree.chart.util.RectangleInsets)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Null 'paint' argumeTt.";
    Object v5 = 0;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = java.awt.image.ColorModel.getRGBdefault();
    Object v8 = 36;
    Object v9 = -34;
    Object v10 = new java.awt.Rectangle((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 36;
    Object v12 = -34;
    Object v13 = new java.awt.Rectangle((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0.0D;
    Object v15 = 0.0D;
    Object v16 = java.awt.geom.AffineTransform.getTranslateInstance((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 0;
    Object v18 = new java.util.HashMap((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.awt.RenderingHints(((java.util.Map)v18));
    Object v20 = ((java.awt.Paint)v6).createContext(((java.awt.image.ColorModel)v7),((java.awt.Rectangle)v10),((java.awt.geom.Rectangle2D)v13),((java.awt.geom.AffineTransform)v16),((java.awt.RenderingHints)v19));
    ((org.jfree.chart.plot.Plot)v3).setBackgroundPaint(((java.awt.Paint)v6));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v5 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v4));
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    ((org.jfree.chart.plot.Plot)v3).setParent(((org.jfree.chart.plot.Plot)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.MultiplePiePlot)v3).getLegendItems();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.MultiplePiePlot)v3).getPieChart();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getParent();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    ((org.jfree.chart.plot.MultiplePiePlot)v3).setDataset(((org.jfree.data.category.CategoryDataset)v4));
    Object v5 = null;
    Object v6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v7 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v6));
    Object v8 = ((org.jfree.chart.plot.Plot)v7).clone();
    Object v9 = ((org.jfree.chart.plot.MultiplePiePlot)v8).getDataExtractOrder();
    ((org.jfree.chart.plot.MultiplePiePlot)v3).setDataExtractOrder(((org.jfree.chart.util.TableOrder)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = "Null 'paint' argumeTt.";
    Object v6 = 0;
    Object v7 = java.awt.Color.getColor(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.plot.Plot)v4).setOutlinePaint(((java.awt.Paint)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = -15.099158F;
    ((org.jfree.chart.plot.Plot)v3).setBackgroundAlpha((((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = 0;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.awt.Font(((java.util.Map)v6));
    ((org.jfree.chart.plot.Plot)v4).setNoDataMessageFont(((java.awt.Font)v7));
    Object v8 = null;
    Object v9 = 2;
    ((org.jfree.chart.plot.Plot)v4).setBackgroundImageAlignment((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 1.0F;
    ((org.jfree.chart.plot.Plot)v3).setBackgroundAlpha((((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getBackgroundPaint();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v4 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v3));
    Object v5 = ((org.jfree.chart.plot.Plot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.MultiplePiePlot)v5).getDataExtractOrder();
    ((org.jfree.chart.plot.MultiplePiePlot)v2).setDataExtractOrder(((org.jfree.chart.util.TableOrder)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.MultiplePiePlot)v3).getLegendItems();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = new org.jfree.data.xy.XYCoordinate();
    Object v4 = ((org.jfree.chart.plot.MultiplePiePlot)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v4 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v3));
    Object v5 = ((org.jfree.chart.plot.Plot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.MultiplePiePlot)v5).getDataExtractOrder();
    ((org.jfree.chart.plot.MultiplePiePlot)v2).setDataExtractOrder(((org.jfree.chart.util.TableOrder)v6));
    Object v7 = null;
    Object v8 = -19.92318615651906D;
    ((org.jfree.chart.plot.MultiplePiePlot)v2).setLimit((((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getDrawingSupplier();
    Object v6 = ((org.jfree.chart.plot.Plot)v4).getDrawingSupplier();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = new org.jfree.data.xy.XYCoordinate();
    Object v6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v7 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)v5),((org.jfree.data.general.Dataset)v6));
    Object v8 = ((java.util.EventObject)v7).toString();
    ((org.jfree.chart.plot.Plot)v4).datasetChanged(((org.jfree.data.general.DatasetChangeEvent)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = "Null 'paint' argumeTt.";
    Object v6 = 0;
    Object v7 = java.awt.Color.getColor(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.awt.Transparency)v7).getTransparency();
    ((org.jfree.chart.plot.MultiplePiePlot)v4).setAggregatedItemsPaint(((java.awt.Paint)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.data.xy.XYCoordinate();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)v4),((org.jfree.data.general.Dataset)v5));
    Object v7 = ((org.jfree.chart.plot.MultiplePiePlot)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.MultiplePiePlot)v2).getLimit();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = "San4sSerif";
    Object v4 = -41.872498427529116D;
    Object v5 = -5.380797605724765D;
    Object v6 = new org.jfree.data.Range((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v3),((org.jfree.data.Range)v6));
    Object v8 = new org.jfree.chart.event.AxisChangeEvent(((org.jfree.chart.axis.Axis)v7));
    ((org.jfree.chart.plot.Plot)v2).axisChanged(((org.jfree.chart.event.AxisChangeEvent)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v5));
    Object v7 = ((org.jfree.chart.plot.Plot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getRootPlot();
    Object v9 = ((org.jfree.chart.plot.Plot)v8).clone();
    Object v10 = ((org.jfree.chart.plot.Plot)v9).getDrawingSupplier();
    Object v11 = ((org.jfree.chart.plot.Plot)v9).getDrawingSupplier();
    Object v12 = ((org.jfree.chart.plot.DrawingSupplier)v11).getNextStroke();
    ((org.jfree.chart.plot.Plot)v4).setDrawingSupplier(((org.jfree.chart.plot.DrawingSupplier)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = 0.0F;
    ((org.jfree.chart.plot.Plot)v2).setBackgroundImageAlpha((((java.lang.Float)v3).floatValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = "San4sSerif";
    Object v6 = -41.872498427529116D;
    Object v7 = -5.380797605724765D;
    Object v8 = new org.jfree.data.Range((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v5),((org.jfree.data.Range)v8));
    Object v10 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v9));
    Object v11 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v10));
    ((org.jfree.chart.plot.Plot)v4).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    ((org.jfree.chart.plot.MultiplePiePlot)v4).setDataset(((org.jfree.data.category.CategoryDataset)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.chart.plot.MultiplePiePlot)v4).getAggregatedItemsKey();
    org.junit.Assert.assertEquals((Object)("Other"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = -21.33361F;
    ((org.jfree.chart.plot.Plot)v2).setBackgroundAlpha((((java.lang.Float)v3).floatValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = new org.jfree.data.xy.XYCoordinate();
    ((org.jfree.chart.plot.MultiplePiePlot)v4).setAggregatedItemsKey(((java.lang.Comparable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v7 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v6));
    Object v8 = ((org.jfree.chart.plot.Plot)v7).clone();
    Object v9 = ((org.jfree.chart.plot.Plot)v8).getRootPlot();
    Object v10 = ((org.jfree.chart.plot.Plot)v9).getOutlineStroke();
    ((org.jfree.chart.plot.Plot)v5).setOutlineStroke(((java.awt.Stroke)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getNoDataMessage();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.MultiplePiePlot)v5).getLegendItems();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getDrawingSupplier();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v5));
    Object v7 = ((org.jfree.chart.plot.Plot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getInsets();
    Object v9 = ((org.jfree.chart.util.RectangleInsets)v8).hashCode();
    Object v10 = false;
    ((org.jfree.chart.plot.Plot)v4).setInsets(((org.jfree.chart.util.RectangleInsets)v8),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = "Null 'paint' argument.";
    ((org.jfree.chart.plot.Plot)v5).setNoDataMessage(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = "Null 'paint' airgument.";
    Object v9 = new org.jfree.data.DefaultKeyedValues();
    Object v10 = new org.jfree.data.general.DefaultPieDataset(((org.jfree.data.KeyedValues)v9));
    Object v11 = true;
    Object v12 = true;
    Object v13 = false;
    Object v14 = org.jfree.chart.ChartFactory.createPieChart3D(((java.lang.String)v8),((org.jfree.data.general.PieDataset)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    ((org.jfree.chart.plot.MultiplePiePlot)v5).setPieChart(((org.jfree.chart.JFreeChart)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = "Null 'paint' argumeTt.";
    Object v6 = 0;
    Object v7 = java.awt.Color.getColor(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.plot.Plot)v4).setBackgroundPaint(((java.awt.Paint)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.MultiplePiePlot)v5).getDataset();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = "Null 'paint' argumeTt.";
    Object v6 = 0;
    Object v7 = java.awt.Color.getColor(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.plot.Plot)v4).setNoDataMessagePaint(((java.awt.Paint)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = "Null 'paint' airgument.";
    Object v7 = new org.jfree.data.DefaultKeyedValues();
    Object v8 = new org.jfree.data.general.DefaultPieDataset(((org.jfree.data.KeyedValues)v7));
    Object v9 = true;
    Object v10 = true;
    Object v11 = false;
    Object v12 = org.jfree.chart.ChartFactory.createPieChart3D(((java.lang.String)v6),((org.jfree.data.general.PieDataset)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 62;
    Object v14 = 25;
    Object v15 = 0.0D;
    Object v16 = 0.0D;
    Object v17 = new org.jfree.chart.ChartRenderingInfo();
    Object v18 = ((org.jfree.chart.JFreeChart)v12).createBufferedImage((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),((org.jfree.chart.ChartRenderingInfo)v17));
    ((org.jfree.chart.plot.MultiplePiePlot)v5).setPieChart(((org.jfree.chart.JFreeChart)v12));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 2.0F;
    ((org.jfree.chart.plot.Plot)v3).setBackgroundImageAlpha((((java.lang.Float)v4).floatValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = false;
    ((org.jfree.chart.plot.Plot)v4).setOutlineVisible((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = "Null 'paint' argumeTt.";
    Object v7 = 0;
    Object v8 = java.awt.Color.getColor(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.Plot)v5).setBackgroundPaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = 0.0F;
    ((org.jfree.chart.plot.Plot)v5).setForegroundAlpha((((java.lang.Float)v6).floatValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = 0;
    ((org.jfree.chart.plot.Plot)v4).setBackgroundImageAlignment((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v7));
    Object v9 = ((org.jfree.chart.plot.Plot)v8).clone();
    Object v10 = ((org.jfree.chart.plot.MultiplePiePlot)v9).getPieChart();
    ((org.jfree.chart.plot.Plot)v4).removeChangeListener(((org.jfree.chart.event.PlotChangeListener)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).getBackgroundImageAlignment();
    org.junit.Assert.assertEquals((Object)(15), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.MultiplePiePlot)v4).getDataset();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v5));
    Object v7 = ((org.jfree.chart.plot.Plot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getRootPlot();
    Object v9 = ((org.jfree.chart.plot.Plot)v8).getOutlineStroke();
    ((org.jfree.chart.plot.Plot)v4).setOutlineStroke(((java.awt.Stroke)v9));
    Object v10 = null;
    Object v11 = -21.527105F;
    ((org.jfree.chart.plot.Plot)v4).setForegroundAlpha((((java.lang.Float)v11).floatValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getDrawingSupplier();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v5 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v4));
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    Object v7 = ((org.jfree.chart.plot.Plot)v6).getRootPlot();
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getOutlineStroke();
    ((org.jfree.chart.plot.Plot)v3).setOutlineStroke(((java.awt.Stroke)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Plot)v3).getOutlinePaint();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = -3.757165F;
    ((org.jfree.chart.plot.Plot)v6).setForegroundAlpha((((java.lang.Float)v7).floatValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    Object v7 = 0.0D;
    ((org.jfree.chart.plot.MultiplePiePlot)v6).setLimit((((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).clone();
    Object v6 = 0;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.awt.Font(((java.util.Map)v7));
    ((org.jfree.chart.plot.Plot)v5).setNoDataMessageFont(((java.awt.Font)v8));
    Object v9 = null;
    Object v10 = 0.0F;
    ((org.jfree.chart.plot.Plot)v5).setForegroundAlpha((((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getPlotType();
    Object v7 = "San4sSerif";
    Object v8 = -41.872498427529116D;
    Object v9 = -5.380797605724765D;
    Object v10 = new org.jfree.data.Range((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v7),((org.jfree.data.Range)v10));
    Object v12 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v11));
    Object v13 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v12));
    Object v14 = "Null 'paint' airgument.";
    Object v15 = new org.jfree.data.DefaultKeyedValues();
    Object v16 = new org.jfree.data.general.DefaultPieDataset(((org.jfree.data.KeyedValues)v15));
    Object v17 = true;
    Object v18 = true;
    Object v19 = false;
    Object v20 = org.jfree.chart.ChartFactory.createPieChart3D(((java.lang.String)v14),((org.jfree.data.general.PieDataset)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    ((org.jfree.chart.event.ChartChangeEvent)v13).setChart(((org.jfree.chart.JFreeChart)v20));
    Object v21 = null;
    ((org.jfree.chart.plot.Plot)v5).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v13));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v5));
    Object v7 = ((org.jfree.chart.plot.Plot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getRootPlot();
    Object v9 = ((org.jfree.chart.plot.Plot)v8).clone();
    Object v10 = ((org.jfree.chart.plot.Plot)v9).getRootPlot();
    Object v11 = ((org.jfree.chart.plot.MultiplePiePlot)v10).getDataset();
    ((org.jfree.chart.plot.MultiplePiePlot)v4).setDataset(((org.jfree.data.category.CategoryDataset)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = "San4sSerif";
    Object v7 = -41.872498427529116D;
    Object v8 = -5.380797605724765D;
    Object v9 = new org.jfree.data.Range((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v6),((org.jfree.data.Range)v9));
    Object v11 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v10));
    Object v12 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v11));
    ((org.jfree.chart.plot.Plot)v5).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    Object v7 = 35;
    Object v8 = 0;
    Object v9 = new org.jfree.chart.ChartRenderingInfo();
    Object v10 = new org.jfree.chart.plot.PlotRenderingInfo(((org.jfree.chart.ChartRenderingInfo)v9));
    ((org.jfree.chart.plot.Plot)v6).handleClick((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((org.jfree.chart.plot.PlotRenderingInfo)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    Object v7 = 12.0D;
    ((org.jfree.chart.plot.Plot)v6).zoom((((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v5 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v4));
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    Object v7 = ((org.jfree.chart.plot.Plot)v6).getInsets();
    ((org.jfree.chart.plot.Plot)v3).setInsets(((org.jfree.chart.util.RectangleInsets)v7));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.plot.Plot)v3).getNoDataMessagePaint();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = -15.194323F;
    ((org.jfree.chart.plot.Plot)v2).setForegroundAlpha((((java.lang.Float)v3).floatValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).isSubplot();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getDatasetGroup();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getDatasetGroup();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getPlotType();
    Object v6 = ((org.jfree.chart.plot.Plot)v4).getParent();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v7));
    Object v9 = ((org.jfree.chart.plot.Plot)v8).clone();
    Object v10 = ((org.jfree.chart.plot.Plot)v9).getRootPlot();
    Object v11 = ((org.jfree.chart.plot.Plot)v10).getDrawingSupplier();
    Object v12 = ((org.jfree.chart.plot.DrawingSupplier)v11).getNextFillPaint();
    ((org.jfree.chart.plot.Plot)v6).setDrawingSupplier(((org.jfree.chart.plot.DrawingSupplier)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)v0));
    Object v2 = ((org.jfree.chart.plot.Plot)v1).clone();
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).clone();
    Object v7 = 10.113836F;
    ((org.jfree.chart.plot.Plot)v6).setBackgroundAlpha((((java.lang.Float)v7).floatValue()));
    Object v8 = null;
    Object v9 = 0.0D;
    ((org.jfree.chart.plot.MultiplePiePlot)v6).setLimit((((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }
}
