package org.jfree.data.test;

import static org.junit.Assert.*; 
import org.jfree.data.Range; 
import org.junit.*;
import java.lang.Math;

public class RangeTest {
    private Range testRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception 
    { 
    	testRange = new Range(-10, 10);
    }

//Method Contains

/**
Tests to see if the variable value is present within the range
method contains(double value)
*/
    @Test
    public void testValuePresentInRangeForMethodContains()   //Contains method
    {
    	assertTrue("Test for a value present in the range for the contains method", testRange.contains(5));
    }
    
/**
Tests to see if the variable value is not present within the range
method contains(double value)
*/
    @Test
    public void testValueNotInRangeForMethodContains()    //Contains method
    {
    	assertFalse("Test for a value not in the range for the contains method", testRange.contains(10.01));
    }
    
/**
Tests to see if the variable value is the upper value of the present range
method contains(double value)
*/    

    @Test
    public void testValueIsUpperBoundaryForMethodContains() //Contains method
    {
    	assertTrue("Test for a value that equals the upper bound for the contains method", testRange.contains(10));
    }
    
/**
Tests to see if the variable value is the lower value of the present range
method contains(double value)
*/    
    @Test
    public void testValueIsLowerBoundaryForMethodContains() //Contains method
    {
    	assertTrue("Test for a value that equals the lower bound for the contains method", testRange.contains(-10));
    }

/**
Tests to see if the variable value is Not a Number (NaN)
method contains(double value)
*/    
    @Test
    public void testValueIsNaNForMethodContains() 
    {
    	assertFalse("Test for a value that equals NaN for the contains method", testRange.contains(0.0/0.0));
    }
    

/**
Tests to see the lowest value possible value of the variable value is contained in it. 
method contains(double value)
*/    
    @Test
    public void testLowestDoubleForMethodContains() //Contains method
    {
    	double x = Math.pow(2,-1024);
    	assertTrue("Test for a value that is lower than the floor of a double for the contains method", testRange.contains(x));
    }
    
/**
Tests to see if Negative Infinity is in the range 
method contains(double value)
*/    
    @Test
    public void testNegativeInfinityValueForMethodContains() //Contains method
    {
    	assertFalse("Test for a negative infinity value for the contains method", testRange.contains(-1.0/0.0));
    }
    
/**
Tests to see if Positive Infinity is in the range
method contains(double value)
*/    
    @Test
    public void testPositiveInfinityValueForMethodContains() //Contains method
    {
    	assertFalse("Test for a positive infinity value for the contains method", testRange.contains(1.0/0.0));
    }
    
    /**Constrain Method*/
    
/**
Tests to see if "value" is within the range that is closest to the specified value is the predicted one
method constrain(double value)
*/    
    @Test
    public void testValueInTheRangeForMethodConstrain() //Constrain Method
    {
    	assertEquals("Test for a value in the range for the constrain method", 5.0, testRange.constrain(5.0),.000000001d);
    }
    
/**
Tests to see if value within the range that is closest to the specified "value" variable
 is the predicted one where both are Not a Number
 method constrain(double value)
*/     
    @Test
    public void testValueThatIsNaNForMethodConstrain() //Constrain Method
    {
    	assertEquals("Test for a value that is not a number for the constrain method", Double.NaN, testRange.constrain(0.0/0.0),.000000001d);
    }
    
/**
Tests to see if the value within the range that is closest to the 
specified "value" variable is the predicted one where both are the upper bound of the range
 method constrain(double value)
*/    
    @Test
    public void testUpperBoundNumberForMethodConstrain() //Constrain Method
    {
    	assertEquals("Test for a value that is equal to the upper bound for the constrain method", 10, testRange.constrain(10),.000000001d);
    }
    
/**
Tests to see if the the value within the range that is closest to the specified
 "value" variable is the predicted one where they are both infinity
method constrain(double value)
*/    
    @Test
    public void testInfinityValueForMethodConstrain() //Constrain Method
    {
    	assertEquals("Test for infinity for the constrain method", 10, testRange.constrain(1.0/0.0), .000000001d);
    }
    
    /**Shift Method*/
/**
Tests to see if the base shifts to a higher value using delta that has a decimal value as well
 method shift(Range base, double delta)
*/    
    @Test
    public void testUpperBoundaryShiftWithDecimalForMethodShift() //Shift Method     FAILED CASE
    {
    	assertEquals("Test for upper boundary using positive number shift for shift method", new Range(0.1,20.1), Range.shift(testRange, 10.1));
    }
    
/**
Tests to see if the base shifts to a lower value using delta that has a decimal value as well
 method shift(Range base, double delta)
*/ 
    @Test
    public void testLowerBoundaryShiftWithDecimalForMethodShift() //Shift Method   FAILED CASE
    {
    	assertEquals("Test for lower boundary using negative number shift for shift method", new Range(-20.1,-0.1), Range.shift(testRange, -10.1));
    }
    
/**
Tests to see if the base shifts to a higher value using delta that has does not have decimal value
 method shift(Range base, double delta)
*/ 
    @Test
    public void testUpperBoundaryShiftNoDecimalForMethodShift() //Shift Method    
    {
    	assertEquals("Test for upper boundary using positive number shift for shift method", new Range(0,20), Range.shift(testRange, 10));
    }
    
/**
Tests to see if the base shifts to a lower value using delta that has does not have decimal value
 method shift(Range base, double delta)
*/ 
    @Test
    public void testLowerBoundaryShiftNoDecimalForMethodShift() //Shift Method   
    {
    	assertEquals("Test for lower boundary using negative number shift for shift method", new Range(-20,-0), Range.shift(testRange, -10));
    }
    
/**
Tests to see if the base shifts to a using delta which is Not a Number(NaN)
 method shift(Range base, double delta)
*/ 
    @Test
    public void testNaNShiftForMethodShift() //Shift Method FAILED CASE
    {
    	assertEquals("Test for a shift of NaN for shift method", new Range(-10,10), Range.shift(testRange,0.0/0.0));
    }
    
/**
Tests to see if the base shifts to a using delta which is positive infinity
 method shift(Range base, double delta)
*/ 
    @Test
    public void testPositiveInfinityForMethodShift() //Shift Method FAILED CASE
    {
    	assertEquals("Test for a shift of positive infinity for shift method", new Range(-10,10), Range.shift(testRange,1.0/0.0));
    }
    
/**
Tests to see if the base shifts using delta. Where the base has a range of
Not a Number in both upper and lower boundary.
 method shift(Range base, double delta)
*/ 
    @Test
    public void testRangeObjectWithNaNBoundaryForMethodShift() //Shift Method  COME BACK TO THIS
    {
    	Range obj = new Range(Double.NaN, Double.NaN);
    	assertEquals("Test for a NaN range object for shift method", new Range(Double.NaN, Double.NaN), Range.shift(obj,10));
    }


/**
Tests to see if the base shifts using delta. Where the base has a range of
Not a Number a lower boundary of null.
method shift(Range base, double delta)
*/
    
    @Test
    public void testNullRangeObjectForMethodShift() //Shift Method
    {
    	try {
    		Range.shift(null, 10).getUpperBound();
    	}
    	
    	catch(Exception e)
    	{
    		String expected = "Null 'base' argument.";
    		assertEquals(expected,e.getMessage());
    	}
    	//assertEquals("Test for a null range for shift method", , Range.shift(null, 10).getUpperBound(), .000000001d);
    }
    
    /**expandToInclude Method*/
    


/**
Tests to see if it returns a range that includes all the values in the specified "range" AND 
the specified "value" compared to the expected values
method expandToInclude(Range range, double value)
*/ 
    @Test
    public void testValidDoubleValueForMethodExpandToInclude() //expandToInclude Method
    {
    	assertEquals("Test for a valid double value for expandToInclude Method", new Range(-10,20), Range.expandToInclude(testRange, 20));
    }


/**
Tests to see if it returns a range that includes all the values in the specified "range" AND the specified "value"
compared to the expected values where there is a value that is Not a Number "NaN"
method expandToInclude(Range range, double value)
*/     
    @Test
    public void testDoubleNaNValueForMethodExpandToInclude() //expandToInclude Method
    {
    	assertEquals("Test for a double NaN value for expandToInclude Method", new Range(-10,10), Range.expandToInclude(testRange, Double.NaN));
    }
   
/**
Tests to see if it returns a range that includes all the values in the specified "range" AND the specified "value"
compared to the expected values where there is a value that is null
method expandToInclude(Range range, double value)
*/      
    @Test
    public void testNullRangeForMethodExpandToInclude() //expandToInclude Method
    {
    	assertEquals("Test for a null range for expandToInclude Method", new Range(30,30), Range.expandToInclude(null, 30));
    }
    

/**
Tests to see if it returns a range that is Not a Number (NaN) the specified "range" AND the specified "value"
compared to the expected values where the is a values are Not a Number "NaN"
method expandToInclude(Range range, double value)
*/     
    @Test
    public void testNaNRangeForMethodExpandToInclude() //expandToInclude Method   cbts
    {
    	Range obj = new Range(Double.NaN, Double.NaN);
    	assertEquals("Test for a NaN range for expandToInclude Method", new Range(Double.NaN, Double.NaN), Range.expandToInclude(obj, 20));
    }
    



    /**Combine Method*/
/**
Tests to see if it the value of the actual range is the expected range with the combination of range1 and range2
method combine(Range range1, Range range2)
*/     
    @Test
    public void testValidRangeInputForMethodCombine() //Combine Method
    {
    	Range obj = new Range(2000,5000);
    	assertEquals("Test for an input of two valid ranges for combine method", new Range(-10,5000), Range.combine(testRange, obj));
    }

/**
Tests to see if it the value of the actual range is the expected range with 
the combination of range1 and range2 where range2 is null
method combine(Range range1, Range range2)
*/     
    @Test
    public void testSingleNullRangeInputForMethodCombine() //Combine Method
    {
    	assertEquals("Test for a single null range object and a normal range object for combine method", new Range(-10,10), Range.combine(testRange, null));
    }
    

/**
Tests to see if it the value of the actual range is the expected range is null using 
the combination of range1 and range2 where both are null ranges
method combine(Range range1, Range range2)
*/     
    @Test
    public void testTwoNullRangesInputForMethodCombine() //Combine Method
    {
    	assertEquals("Test for a two null range objects  for combine method", null, Range.combine(null, null));
    }
    
/**
Tests to see if it the value of the actual range is the expected range with 
the combination of range1 and range2 where range1 has a lower bound of 
Being Not a Number "NaN"
*/     
    @Test
    public void testSingleNaNInputForMethodCombine() //Combine Method  FAILED TEST CASE
    {
    	Range obj = new Range(Double.NaN, 60);
    	assertEquals("Test for a single range of NaN for combine method", new Range(-10,60), Range.combine(obj, testRange));
    }
    
  
    /**getCentralValue Method*/
    @Test
    public void testForValidRangeForMethodGetCentralValue()
    {
    	assertEquals("Test for a valid range for method getCentralValue", 0.0,testRange.getCentralValue(), .000000001d);
    }
    
    @Test
    public void testForValidNegativeDecimalLowerBoundaryRangeForMethodGetCentralValue()
    {
    	Range obj = new Range(-7.5, 5.5);
    	assertEquals("Test for a valid negative decimal range for method getCentralValue", -1.0,obj.getCentralValue(), .000000001d);
    }
    
    @Test
    public void testForDoubleNaNRangeForMethodGetCentralValue()
    {
    	Range obj = new Range(Double.NaN, 2);
    	assertEquals("Test for a Double.NaN value in range for method getCentralValue", Double.NaN,obj.getCentralValue(), .000000001d);
    }
    
    /**getLength Method*/
    @Test
    public void testForValidInputForGetLengthMethod()
    {
    	assertEquals("Test for a valid input for method getLength", 20, testRange.getLength(), .000000001d);
    }
    
    @Test
    public void testForNegativeDecimalInputForGetLengthMethod()
    {
    	Range obj = new Range(-7.5,5.5);
    	assertEquals("Test for a negative decimal valid input for method getLength", 13, obj.getLength(), .000000001d);
    }
    
    @Test
    public void testForDoubleNaNInputForGetLengthMethod()
    {
    	Range obj = new Range(Double.NaN,5.5);
    	assertEquals("Test for a Double.NaN decimal valid input for method getLength", Double.NaN, obj.getLength(), .000000001d);
    }
    
    /**getLowerBound Method*/
    @Test
    public void testForValidRangeInputForGetLowerBoundMethod()
    {
    	assertEquals("Test for a valid range being sent to getLowerBound method", -10, testRange.getLowerBound(), .000000001d);
    }
    
    /**getUpperBound Method*/
    @Test
    public void testForValidRangeInputForGetUpperBoundMethod()
    {
    	assertEquals("Test for a valid range being sent to getUpperBound method", 10, testRange.getUpperBound(), .000000001d);
    }
    
    /**combineIgnoringNaN Method*/
    @Test
    public void testForNullRangesInputForMethodCombineIgnoringNaN()
    {
    	Range obj = null;
    	assertEquals("Test for null range being sent to combineIgnoringNaN method", testRange, Range.combineIgnoringNaN(testRange, obj));
    }
    
    @Test
    public void testForTwoNullRangesInputForMethodCombineIgnoringNaN()
    {
    	Range obj = null;
    	Range temp = null;
    	assertEquals("Test for two null range being sent to combineIgnoringNaN method", obj, Range.combineIgnoringNaN(null, obj));
    }
    
    @Test
    public void testForValidRangeInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(-12,12);
    	assertEquals("Test for valid range being sent to combineIgnoringNaN method", obj, Range.combineIgnoringNaN(testRange, obj));
    }
    
    @Test
    public void testForNaNRangeInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(Double.NaN,12);
    	assertEquals("Test for Double.NaN range being sent to combineIgnoringNaN method", new Range(-10,12), Range.combineIgnoringNaN(testRange, obj));
    }
    
    @Test
    public void testForTwoNaNRangeInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(Double.NaN,Double.NaN);
    	Range obj2 = new Range(Double.NaN,Double.NaN);
    	assertEquals("Test for two Double.NaN range being sent to combineIgnoringNaN method", null, Range.combineIgnoringNaN(obj2, obj));
    }
    
    @Test
    public void testForNullAndDoubleNaNRangeInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(Double.NaN,Double.NaN);
    	assertEquals("Test for Double.NaN and null range being sent to combineIgnoringNaN method", null, Range.combineIgnoringNaN(null, obj));
    }
    
    @Test
    public void testForNullAndDoubleNaNRangeTwoInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(Double.NaN,Double.NaN);
    	assertEquals("Test two for Double.NaN and null range being sent to combineIgnoringNaN method", null, Range.combineIgnoringNaN(obj, null));
    }
    
    /**expands Method*/
    @Test
    public void testForValidInputForMethodExpands()
    {
    	assertEquals("Test for valid inputs for expands method", new Range(-15, 20), Range.expand(testRange, 0.25, 0.5));
    }
    
    @Test
    public void testForNegativePercentValidInputForMethodExpands()
    {
    	assertEquals("Test for negative percent valid inputs for expands method", new Range(4, 4), Range.expand(testRange, -0.9, -0.5));
    }
    
    /**intersects Method 2 arguments*/
    @Test
    public void testForALowerBoundThatIsGreaterThanTestRangeLowerBoundForMethodIntersects()
    {
    	assertTrue("Test for two valid doubles for intersects method", testRange.intersects(-5, 5));
    }
    
    @Test
    public void testForADoubleLowerThanTheLowerBoundOfTheTestRangeLowerBoundForMethodIntersects()
    {
    	assertTrue("Test for two valid doubles intersects method", testRange.intersects(-10, 10));
    }
    
    /**intersects Method 1 argument*/
    @Test
    public void testForAValidRangeForMethodIntersects() 
    {
    	Range obj = new Range(-10,10);
    	assertTrue("Test for a valid range object intersects method", testRange.intersects(obj));
    }
    
    /**scale Method*/
    @Test
    public void testForAValidRangeAndFactorForMethodScale()
    {
    	assertEquals("Test for a valid range and scale factor for the scale method", new Range(-20,20), Range.scale(testRange, 2));
    }
    
    @Test
    public void testForAValidRangeAndNegativeFactorForMethodScale()
    {
    	
    	try
    	{
    		Range.scale(testRange, -2);
    	}
    	
    	catch(Exception e)
    	{
    		String expected = "Negative 'factor' argument.";
    		assertEquals(expected,e.getMessage());
    	}
    	
    }
    
    /**Shift method with 3 args*/
    @Test
    public void testForValidRangeDoubleAndTrueForMethodShift()
    {
    	assertEquals("Test for a valid range, double and true for the method shift", new Range(-8,12), Range.shift(testRange, 2, true));
    }
    
    /**hashCode method*/
    @Test
    public void testForHashCodeMethod()
    {
    	assertEquals("Test for hashCode method", 70778880, testRange.hashCode());
    }
    
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}