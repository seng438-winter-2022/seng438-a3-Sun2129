package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.Range;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataUtilitiesTest extends DataUtilities {

	@BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception 
    { 
    	
    }
    
    /*
     * this test covers a valid value for variable data for the
     * method getCumulativePercentages(data)
     * */
    /**GetCumulativePercentages*/
    @Test
    public void testAValidInputForMethodGetCumulativePercentages()
    {
    	Mockery mock1 = new Mockery();
    	final KeyedValues value1 = mock1.mock(KeyedValues.class);// created a mockery for the keyedValues class
        mock1.checking(new Expectations() {
            {
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            	allowing(value1).getValue(0);// setting up the mock of object
            	will(returnValue(5.0)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            	allowing(value1).getValue(1);// setting up the mock of object
            	will(returnValue(7.0)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	          	
            	allowing(value1).getKey(0);// setting up the mock of object
            	will(returnValue(0)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            	allowing(value1).getKey(1);// setting up the mock of object
            	will(returnValue(1)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            }
        });
        
        KeyedValues result = DataUtilities.getCumulativePercentages(value1);// call the getCumulativePercentage method and passed the variable data
        // verify
        assertEquals("This test is for a valid input for the cumulative percentages method", (double)result.getValue(0), 5.0/12.0, .000000001d);
        
    }
    
    /*
     * this test covers a invalid value for variable data for the 
     * method getCumulativePercentages(data)
     * */
    @Test
    public void testANullInputForMethodGetCumulativePercentages()
    {
    	Mockery mock1 = new Mockery();
    	final KeyedValues value1 = mock1.mock(KeyedValues.class);// created a mockery for the keyedValues class
        mock1.checking(new Expectations() {
            {
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            	allowing(value1).getValue(0);// setting up the mock of object
            	will(returnValue(5.0)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            	allowing(value1).getValue(1);// setting up the mock of object
            	will(returnValue(7.0)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	          	
            	allowing(value1).getKey(0);// setting up the mock of object
            	will(returnValue(0)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            	allowing(value1).getKey(1);// setting up the mock of object
            	will(returnValue(1)); //returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2)); //returns the value
            	
            }
        });
        try {
        	KeyedValues result = DataUtilities.getCumulativePercentages(null);// call the getCumulativePercentage method and passed the variable data
    	}
    	
    	catch(Exception e)
    	{
    		String expected = "Null 'data' argument.";//expected output
    		assertEquals("This test is for a null input for the cumulative percentages method", expected, e.getMessage());// verify
    	}
        
       
    }
	
    /*
     * this test covers a invalid value for variable data for the
     * method getCumulativePercentages(KeyedValues data)
     * */
    @Test
    public void testADoubleNaNForMethodGetCumulativePercentages()
    {
    	Mockery mock1 = new Mockery();
    	final KeyedValues value1 = mock1.mock(KeyedValues.class);// created a mockery for the keyedValues class
        mock1.checking(new Expectations() {
            {
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2));//returns the value
            	
            	allowing(value1).getValue(0);// setting up the mock of object
            	will(returnValue(Double.NaN));//returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2));//returns the value
            	
            	allowing(value1).getValue(1);// setting up the mock of object
            	will(returnValue(7.0));//returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2));//returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2));//returns the value
            	          	
            	allowing(value1).getKey(0);// setting up the mock of object
            	will(returnValue(0));//returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2));//returns the value
            	
            	allowing(value1).getKey(1);// setting up the mock of object
            	will(returnValue(1));//returns the value
            	
            	allowing(value1).getItemCount();// setting up the mock of object
            	will(returnValue(2));//returns the value
            	
            }
        });
        KeyedValues result = DataUtilities.getCumulativePercentages(value1);// call the getCumulativePercentage method and passed the variable data
        // verify
        assertEquals("This test is for a NaN input for the cumulative percentages method", (double)result.getValue(0), Double.NaN, .000000001d);
               
    }
    
    
    /**calculateColumnTotal*/
    
    /*
     * this test covers a valid value for variable data and normal value column and validRows in the 
     * method CalculateColumnTotal(Values2D data, int column, int[] validRows)
     * */
    @Test
    public void testAValidInputForMethodCalculateColumnTotal()
    {
    	Mockery mock1 = new Mockery();
    	final Values2D value1 = mock1.mock(Values2D.class);// created a mockery for the Values2D class
    	mock1.checking(new Expectations() {
    		{
    			allowing(value1).getRowCount();// setting up the mock of object
    			will(returnValue(4));
    			allowing(value1).getValue(0, 0);// setting up the mock of object
    			will(returnValue(3.4));//returns the value
    			allowing(value1).getValue(1, 0);// setting up the mock of object
    			will(returnValue(2.6));//returns the value
    			allowing(value1).getValue(3, 0);// setting up the mock of object
    			will(returnValue(7.6));//returns the value
    			allowing(value1).getValue(2, 0);// setting up the mock of object
    			will(returnValue(5.9));//returns the value
    			
    		}
    	});
    	int [] arr = {0,1,3,2};
    	double result = DataUtilities.calculateColumnTotal(value1, 0, arr);// call the calculateColumnTotal method and passed the variable data, column and validRows
    	assertEquals("This test is for a valid input for a valid input for the calculateColumnTotal method", 19.5, result, .000000001d);//verify
    }
    
    /*
     * this test covers a invalid value for variable data and normal value column and validRows in the 
     * method CalculateColumnTotal(Values2D data, int column, int[] validRows)
     * */
    @Test
    public void testNullValues2DObjectForMethodCalculateColumnTotal()
    {
    	Mockery mock1 = new Mockery();
    	final Values2D value1 = mock1.mock(Values2D.class);// created a mockery for the Values2D class
    	mock1.checking(new Expectations() {
    		{
    			allowing(value1).getRowCount();// setting up the mock of object
    			will(returnValue(4));//returns the value
    			allowing(value1).getValue(0, 0);// setting up the mock of object
    			will(returnValue(3.4));//returns the value
    			allowing(value1).getValue(1, 0);// setting up the mock of object
    			will(returnValue(2.6));//returns the value
    			allowing(value1).getValue(3, 0);// setting up the mock of object
    			will(returnValue(7.6));//returns the value
    			allowing(value1).getValue(2, 0);// setting up the mock of object
    			will(returnValue(5.9));//returns the value
    		}
    	});
    	
        try {
        	int [] arr = {0,1,3,2};
        	double result = DataUtilities.calculateColumnTotal(null, 0, arr);// call the calculateColumnTotal method and passed the variable data, column and validRows
    	}
    	
    	catch(Exception e)
    	{
    		String expected = "Null 'data' argument."; //expected message
    		assertEquals("This test is for a null input for the calculateColumnTotal  method", expected, e.getMessage());//verify
    	}
    	
    }
    
    
    /*
     * this test covers a invalid value for variable column and normal value data and column in the 
     * method CalculateColumnTotal(Values2D data, int column, int[] validRows)
     * */
    @Test
    public void testForNaNInputForColumnForMethodCalculateColumnTotal()
    {
    	Mockery mock1 = new Mockery();
    	final Values2D value1 = mock1.mock(Values2D.class);// created a mockery for the Values2D class
    	mock1.checking(new Expectations() {
    		{
    			allowing(value1).getRowCount();// setting up the mock of object
    			will(returnValue(4));//returns the value
    			allowing(value1).getValue(0, (int)Double.NaN);// setting up the mock of object
    			will(returnValue(null));//returns the value
    			allowing(value1).getValue(1, (int)Double.NaN);// setting up the mock of object
    			will(returnValue(null));//returns the value
    			allowing(value1).getValue(3, (int)Double.NaN);// setting up the mock of object
    			will(returnValue(null));//returns the value
    			allowing(value1).getValue(2, (int)Double.NaN);// setting up the mock of object
    			will(returnValue(null));//returns the value
    			
    		}
    	});
    	
    	int [] arr = {0,1,3,2};
    	double result = DataUtilities.calculateColumnTotal(value1, (int)Double.NaN, arr);// call the calculateColumnTotal method and passed the variable data, column and validRows
    	assertEquals("This test is for a NaN input for the method calculateColumnTotal", 0.0, result, .000000001d);//verify
    }
    
    /*
     * this test covers a invalid value for variable validRows and normal value data and column in the 
     * method CalculateColumnTotal(Values2D data, int column, int[] validRows)
     * */
    @Test
    public void testForNullIntArrayForMethodCalculateColumnTotal() //Failed Test Case, should have thrown an exception
    {
    	Mockery mock1 = new Mockery();
    	final Values2D value1 = mock1.mock(Values2D.class);//created a mockery for the Values2D class
    	mock1.checking(new Expectations() {
    		{
    			allowing(value1).getRowCount();// setting up the mock of object
    			will(returnValue(4));//returns the value
    			allowing(value1).getValue(0, 0);// setting up the mock of object
    			will(returnValue(4));//returns the value
    			allowing(value1).getValue(1, 0);// setting up the mock of object
    			will(returnValue(2));//returns the value
    			allowing(value1).getValue(3, 0);// setting up the mock of object
    			will(returnValue(5));//returns the value
    			allowing(value1).getValue(2, 0);// setting up the mock of object
    			will(returnValue(7));//returns the value
    			
    		}
    	});
    	 try {
    		 int [] arr = null;
    	     double result = DataUtilities.calculateColumnTotal(value1, 0, arr);// call the calculateColumnTotal method and passed the variable data, column and validRows
     	}
     	
     	catch(Exception e)
     	{
     		String expected = "Null 'data' argument.";//expected message
     		assertEquals("This test is for a null array input for the method calculateColumnTotal", expected, e.getMessage());//verify
     	}
    	
    	
    }
    
    /*
     * this test covers a invalid value for variable validRows and normal value data and column in the 
     * method CalculateColumnTotal(Values2D data, int column, int[] validRows)
     * */
    @Test
    public void testForNaNIntArrayForMethodCalculateColumnTotal() 
    {
    	Mockery mock1 = new Mockery();
    	final Values2D value1 = mock1.mock(Values2D.class);//created a mockery for the value2D class
    	mock1.checking(new Expectations() {
    		{
    			allowing(value1).getRowCount();// setting up the mock of object
    			will(returnValue(4));//returns the value
    			allowing(value1).getValue((int)Double.NaN, 0);// setting up the mock of object
    			will(returnValue(null));//returns the value
    			allowing(value1).getValue(1, 0);// setting up the mock of object
    			will(returnValue(2));//returns the value
    			allowing(value1).getValue(3, 0);// setting up the mock of object
    			will(returnValue(5));//returns the value
    			allowing(value1).getValue(2, 0);// setting up the mock of object
    			will(returnValue(7));//returns the value
    			
    		}
    	});
    		 int [] arr = {(int)Double.NaN,1,3,2};
    	     double result = DataUtilities.calculateColumnTotal(value1, 0, arr);// call the calculateColumnTotal method and passed the variable data, column and validRows
     		assertEquals("This test is for a NaN array input for the method calculateColumnTotal", 14, result, .000000001d);//verify
    	
    }
    
    
    
    /**calculateRowTotal*/
    
    /*
     * this test covers a valid value for variable data and row in the 
     * method calculateRowTotal(Values2D data, int row)
     * */
    @Test
    public void testAValidInputForMethodCalculateRowTotal()
    {
    	Mockery mock1 = new Mockery();
    	final Values2D value1 = mock1.mock(Values2D.class);//created a mockery for the value2D class
    	mock1.checking(new Expectations() {
    		{
    			allowing(value1).getColumnCount();// setting up the mock of object
    			will(returnValue(4));//returns the value
    			allowing(value1).getValue(0, 0);// setting up the mock of object
    			will(returnValue(3.4));//returns the value
    			allowing(value1).getValue(0, 1);// setting up the mock of object
    			will(returnValue(2.6));//returns the value
    			allowing(value1).getValue(0, 2);// setting up the mock of object
    			will(returnValue(7.6));//returns the value
    			allowing(value1).getValue(0, 3);// setting up the mock of object
    			will(returnValue(5.9));//returns the value
    			
    		}
    	});
    	double result = DataUtilities.calculateRowTotal(value1, 0);// call the calculateRowTotal method and passed the variable data and row
    	assertEquals("This test is for a valid input for a valid input for the calculateRowTotal method", 19.5, result, .000000001d);//verify
    }
    
    /*
     * this test covers a invalid value for variable data and normal value row in the 
     * method calculateRowTotal(Values2D data, int row)
     * */
    @Test
    public void testNullValues2DObjectForMethodCalculateRowTotal()
    {
    	Mockery mock1 = new Mockery();
    	final Values2D value1 = mock1.mock(Values2D.class);//created a mockery for the value2D class
    	mock1.checking(new Expectations() {
    		{
    			allowing(value1).getColumnCount();// setting up the mock of object
    			will(returnValue(4));//returns the value
    			allowing(value1).getValue(0, 0);// setting up the mock of object
    			will(returnValue(3.4));//returns the value
    			allowing(value1).getValue(0, 1);// setting up the mock of object
    			will(returnValue(2.6));//returns the value
    			allowing(value1).getValue(0, 2);// setting up the mock of object
    			will(returnValue(7.6));//returns the value
    			allowing(value1).getValue(0, 3);// setting up the mock of object
    			will(returnValue(5.9));//returns the value
    			
    		}
    	});
    	
        try {
        	double result = DataUtilities.calculateRowTotal(null, 0); // call the calculateRowTotal method and passed the variable data and row
    	}
    	
    	catch(Exception e)
    	{
    		String expected = "Null 'data' argument.";//expected message
    		assertEquals("This test is for a null input for the calculateRowTotal method", expected, e.getMessage());//verify
    	}
    	
    }
    
    
    
    /*
     * this test covers a invalid value for variable row and normal value data in the 
     * method calculateRowTotal(Values2D data, int row)
     * */
    @Test
    public void testForNaNInputForRowForMethodCalculateRowTotal()
    {
    	Mockery mock1 = new Mockery();
    	final Values2D value1 = mock1.mock(Values2D.class);//created a mockery for the value2D class
    	mock1.checking(new Expectations() {
    		{
    			allowing(value1).getColumnCount();// setting up the mock of object
    			will(returnValue(4));//returns the value
    			allowing(value1).getValue((int)Double.NaN, 0);// setting up the mock of object
    			will(returnValue(null));//returns the value
    			allowing(value1).getValue((int)Double.NaN, 1);// setting up the mock of object
    			will(returnValue(null));//returns the value
    			allowing(value1).getValue((int)Double.NaN, 2);// setting up the mock of object
    			will(returnValue(null));//returns the value
    			allowing(value1).getValue((int)Double.NaN, 3);// setting up the mock of object
    			will(returnValue(null));//returns the value
    			
    		}
    	});
    	
    	double result = DataUtilities.calculateRowTotal(value1, (int)Double.NaN);// call the calculateRowTotal method and passed the variable data and row
    	assertEquals("This test is for a NaN input for the method calculateRowTotal", 0.0, result, .000000001d);//verify
    }
    
    
    /**equal*/
    
    /*
     * this test covers a valid value for variable a and b in the 
     * method equal(double[][] a,double[][] b)
     * */
    @Test
    public void testForTwoEqualArrayInputForMethodEqual()
    {
    	double [][] a = {
    	   {2,4.4,6.6,3},
    	   {5,7.7,9,3}
    	};// create the 2d array a
    	double [][] b = {
    	    {2,4.4,6.6,3},
    	    {5,7.7,9,3}
    	};// create the 2d array b
    	
    	
    	boolean result = DataUtilities.equal(a, b);// call the equal method and passed the variable a and b
    	assertTrue("This is a test for a valid input for the method equal", result);//verify
    }
    
    /*
     * this test covers a valid value for variable a and b in the 
     * method equal(double[][] a,double[][] b)
     * */
    @Test
    public void testForTwoDifferentArrayInputForMethodEqual()
    {
    	double [][] a = {
    	   {2,4.4,6.6,3},
    	   {5,7.7,9,3}
    	};// create the 2d array a
    	double [][] b = {
    	    {2,4.4,6.6,3},
    	    {5,3,9,3}
    	};// create the 2d array b
    	
    	
    	boolean result = DataUtilities.equal(a, b);// call the equal method and passed the variable a and b
    	assertFalse("This is a test for an input of two different arrays for the method equal", result);//verify
    }
    
    /*
     * this test covers a invalid value for variable b and normal value for variable a in the 
     * method equal(double[][] a,double[][] b)
     * */
    @Test
    public void testForOneNullArrayInputForMethodEqual()
    {
    	double [][] a = {
    	   {2,4.4,6.6,3},
    	   {5,7.7,9,3}
    	};// create the 2d array a
    	double [][] b = null;// create the 2d array b as and initialize it to null
    	
    	boolean result = DataUtilities.equal(a, b);// call the equal method and passed the variable a and b
    	assertFalse("This is a test for an input of one null array and one valid array for the method equal", result);//verify
    }
    
    /*
     * this test covers a invalid value for variable b and a in the 
     * method equal(double[][] a,double[][] b)
     * */
    @Test
    public void testForTwoNullArrayInputForMethodEqual()
    {
    	double [][] a = null;// create the 2d array a as and initialize it to null
    	double [][] b = null;// create the 2d array b as and initialize it to null
    	
    	
    	boolean result = DataUtilities.equal(a, b);// call the equal method and passed the variable a and b
    	assertTrue("This is a test for an input of two null arrays for the method equal", result);//verify
    }
    
    /*
     * this test covers a invalid value for an input in variable b and normal value for variable a in the 
     * method equal(double[][] a,double[][] b)
     * */
    @Test
    public void testForOneNaNArrayInputForMethodEqual()
    {
    	double [][] a = {
    	   {2,4.4,6.6,3},
    	   {5,7.7,9,Double.NaN}
    	};// create the 2d array a
    	double [][] b = {
    	    {2,4.4,6.6,3},
    	    {5,7.7,9,3}// create the 2d array b as and initialize a variable to NAN
    	};
    	
    	
    	boolean result = DataUtilities.equal(a, b);// call the equal method and passed the variable a and b
    	assertFalse("This is a test for one NaN array and one valid array for the method equal", result);//verify
    }
    
    /*
     * this test covers a invalid values for inputs in variable b and a in the 
     * method equal(double[][] a,double[][] b)
     * */
    @Test
    public void testForTwoNaNArrayInputForMethodEqual()
    {
    	double [][] a = {
    	   {2,4.4,6.6,3},
    	   {5,7.7,9,Double.NaN}
    	};// create the 2d array a as and initialize a variable to NAN
    	double [][] b = {
    	    {2,4.4,6.6,3},
    	    {5,7.7,9,Double.NaN}
    	};// create the 2d array b as and initialize a variable to NAN
    	
    	
    	boolean result = DataUtilities.equal(a, b);// call the equal method and passed the variable a and b
    	assertTrue("This is a test for two NaN arrays for the method equal", result);//verify
    }
    
    
    /**createNumberArray*/
    
    /*
     * this test covers a valid value for data
     * method createNumberArray(double[] data,)
     * */
    @Test
    public void testForAValidArrayInputForMethodCreateNumberArray() 
    {
    	double [] arr = {2.4,3.0,5.6,7.0};// create the array arr
    	Number [] actual = DataUtilities.createNumberArray(arr);// call the createNumberArray method and pass arr
    	Number [] expected = {2.4,3.0,5.6,7.0}; // expected result
    	assertArrayEquals("This is a test for a valid array input for the method CreateNumberArray", expected, actual);//verify
    }
    
    /*
     * this test covers an invalid value for data
     * method createNumberArray(double[] data,)
     * */
    @Test
    public void testForANullArrayInputForMethodCreateNumberArray() 
    {

    	try 
    	{
    		double [] arr = null;// create a null array called arr 
        	Number [] actual = DataUtilities.createNumberArray(arr);// call the createNumberArray method and pass arr
    	}
    	catch(Exception e)
    	{
    		String expected = "Null 'data' argument.";// expected result
    		assertEquals("This test is for a null input for the calculateRowTotal method", expected, e.getMessage());//verify
    	}
    }
    
    
    @Test
    public void testForANaNArrayInputForMethodCreateNumberArray() 
    {
    	double [] arr = {2.4,3.0,5.6,Double.NaN};// create a null array called arr 
    	Number [] actual = DataUtilities.createNumberArray(arr);// call the createNumberArray method and pass arr
    	Number [] expected = {2.4,3.0,5.6,Double.NaN};// expected result
    	assertArrayEquals("This is a test for a valid array input for the method CreateNumberArray", expected, actual);//verify
    }
    
    /**Clone Method*/
    
    @Test
    public void testForValidInputForCloneMethod()
    {
    	double [][] expected = {{1,2},{3,4}};
    	double [][] result = DataUtilities.clone(expected);
    	assertArrayEquals("This is a test for a valid double array input for the method clone", expected, result);
    }
    
    @Test
    public void testForValidDecimalDoubleInputForCloneMethod()
    {
    	double [][] expected = {{1.3,2.2},{3.6,4.4}};
    	double [][] result = DataUtilities.clone(expected);
    	assertArrayEquals("This is a test for a valid decimal double array input for the method clone", expected, result);
    }
    
    @Test
    public void testForDifferentArraySizeInputForCloneMethod()
    {
    	double [][] expected = {{1.3,2.2},{3.6}};
    	double [][] result = DataUtilities.clone(expected);
    	assertArrayEquals("This is a test for a valid double array input for the method clone", expected, result);
    }
    
    @Test
    public void testForNullArrayInputForCloneMethod()
    {
    	double [][] array = null;
    	try {
         	double [][] result = DataUtilities.clone(array); // call the calculateRowTotal method and passed the variable data and row
     	}
     	
     	catch(Exception e)
     	{
     		String expected = "Null 'source' argument.";//expected message
     		assertEquals("This is a test for a null array input for the method clone", expected, e.getMessage());//verify
     	}
    }
    
    @Test
    public void testForEmptyArraySizeInputForCloneMethod()
    {
    	double [][] expected = {{},{}};
    	double [][] result = DataUtilities.clone(expected);
    	assertArrayEquals("This is a test for a empty double array input for the method clone", expected, result);
    }
    
    @Test
    public void testForNegativeValueInDoubleArrayInputForCloneMethod()
    {
    	double [][] expected = {{-1.3,2.2},{-3.6}};
    	double [][] result = DataUtilities.clone(expected);
    	assertArrayEquals("This is a test for a valid double array input for the method clone", expected, result);
    }
    
    /**createNumberArray2D Method*/
    @Test
    public void testForAValidArrayInputForMethodCreateNumberArray2D() 
    {
    	double [][] arr = {{2.4,3.0},{5.6,7.0}};// create the array arr
    	Number [][] actual = DataUtilities.createNumberArray2D(arr);// call the createNumberArray method and pass arr
    	Number [][] expected = {{2.4,3.0},{5.6,7.0}}; // expected result
    	assertArrayEquals("This is a test for a valid array input for the method CreateNumberArray2D", expected, actual);//verify
    }
    
    @Test
    public void testForANullArrayInputForMethodCreateNumberArray2D() 
    {

    	try 
    	{
    		double [][] arr = null;// create a null array called arr 
        	Number [][] actual = DataUtilities.createNumberArray2D(arr);// call the createNumberArray method and pass arr
    	}
    	catch(Exception e)
    	{
    		String expected = "Null 'data' argument.";// expected result
    		assertEquals("This test is for a null input for the CreateNumberArray2D method", expected, e.getMessage());//verify
    	}
    }
    
    
    @Test
    public void testForANaNArrayInputForMethodCreateNumberArray2D() 
    {
    	double [][] arr = {{2.4,3.0},{5.6,Double.NaN}};// create a null array called arr 
    	Number [][] actual = DataUtilities.createNumberArray2D(arr);// call the createNumberArray method and pass arr
    	Number [][] expected = {{2.4,3.0},{5.6,Double.NaN}};// expected result
    	assertArrayEquals("This is a test for a valid array input for the method CreateNumberArray", expected, actual);//verify
    }
    
    @Test
    public void testForAEmptyArrayInputForMethodCreateNumberArray2D() 
    {
    	double [][] arr = {{},{}};// create a null array called arr 
    	Number [][] actual = DataUtilities.createNumberArray2D(arr);// call the createNumberArray method and pass arr
    	Number [][] expected = {{},{}};// expected result
    	assertArrayEquals("This is a test for a empty array input for the method CreateNumberArray", expected, actual);//verify
    }
    
    @Test 
    public void testForzeroArrayForcreateNumberArray2D() {
        double [][] arr = {{}};
        Number [][] expected = {{}};
        Number [][] result = createNumberArray2D(arr);
        assertArrayEquals("This is a test for a valid array input for the method CreateNumberArray", expected, result);//verify

    }
    
    /**calculateRowTotal 3 Arguments */
    @Test
    public void testFor3InputForMethodCalculateRowTotal()
    {
    Mockery mock1 = new Mockery();
    final Values2D value1 = mock1.mock(Values2D.class);// created a mockery for the Values2D class
    mock1.checking(new Expectations() {
        {
            allowing(value1).getColumnCount();// setting up the mock of object
            will(returnValue(4));
            allowing(value1).getValue(0, 0);// setting up the mock of object
            will(returnValue(3.4));//returns the value
            allowing(value1).getValue(0, 1);// setting up the mock of object
            will(returnValue(2.6));//returns the value
            allowing(value1).getValue(0, 3);// setting up the mock of object
            will(returnValue(7.6));//returns the value
            allowing(value1).getValue(0, 2);// setting up the mock of object
            will(returnValue(5.9));//returns the value

        }
    });
    int [] arr = {0,1,3,2};
    double result = DataUtilities.calculateRowTotal(value1, 0, arr);// call the calculateColumnTotal method and passed the variable data, column and validRows
    assertEquals("This test is for a valid input for a valid input for the calculateRowTotal 3 args method", 19.5, result, .000000001d);//verify
    }
    
    /**calculateColumnTotal 2 arguments */
    @Test
    public void testAValidTwoInputForMethodCalculateColumnTotal()
    {
    	Mockery mock1 = new Mockery();
    	final Values2D value1 = mock1.mock(Values2D.class);//created a mockery for the value2D class
    	mock1.checking(new Expectations() {
    		{
    			allowing(value1).getRowCount();// setting up the mock of object
    			will(returnValue(4));//returns the value
    			allowing(value1).getValue(0, 0);// setting up the mock of object
    			will(returnValue(3.4));//returns the value
    			allowing(value1).getValue(1, 0);// setting up the mock of object
    			will(returnValue(2.6));//returns the value
    			allowing(value1).getValue(2, 0);// setting up the mock of object
    			will(returnValue(7.6));//returns the value
    			allowing(value1).getValue(3, 0);// setting up the mock of object
    			will(returnValue(5.9));//returns the value
    			
    		}
    	});
    	double result = DataUtilities.calculateColumnTotal(value1, 0);// call the calculateRowTotal method and passed the variable data and row
    	assertEquals("This test is for a valid input for a valid input for the calculateColumnTotal method 2 arguments", 19.5, result, .000000001d);//verify
    }
    
	 @After
	 public void tearDown() throws Exception 
	 {
		 
	 }

	 @AfterClass
	 public static void tearDownAfterClass() throws Exception 
	 {
		 
	 }

}