**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report #3 – Code Coverage, Adequacy Criteria and Test Case Correlation**

| Group \#:      |  6   |
| -------------- | --- |
| Student Names: |  Sanchit Kumar   |
|                |  Aninda Shome   |
|                |  Ibrahim Asad   |
|                |  Isaiah Asaolu   |

(Note that some labs require individual reports while others require one report
for each group. Please see each lab document for details.)

# 1 Introduction

The focus of the assignment is on Unit-Testing. Unit Tests will be performed using JUnit Testing on Eclipse. We familiarize ourselves with using multiple tools followed by implementation of test suites. Unlike the previous testing we used another technique called white-box testing, this allowed us to get white-box coverage and obtain the minimum coverages needed with us needing to achieve 90% statement coverage, 70% branch coverage, and 60% condition coverage. The overall lab has taught us how to determine the adequacy of a white-box test suite based on using its coverage. We used multiple coverage tools however we found that EclEmma was a better fit. The other tools had various different problems such as CodeCover needed to have a Java application to run in order to obtain the coverages however we were not provided a Java Application so therefore the coverages cannot be fulfilled and Coverlipse would not run as we needed certain dependencies that were not provided to run it. After Completing the assignment we have gained valuable tools such as using tools such as EclEmma to measure test adequacy and become aware of similar tools for other programming environments, as result we added several more test cases to boatin the minimum value from Range and DataUtilities.understand some of the benefits and drawbacks of measuring test adequacy with code coverage tools and how data-flow coverage works and be able to calculate it by hand.

# 2 Manual data-flow coverage calculations for X and Y methods

[Link to the Data Flow Diagrams and def-use sets per statement.](https://github.com/seng438-winter-2022/seng438-a3-Sun2129/blob/main/DataFlowDiagrams.pdf)

[List of all du-pairs per variable for DataUtilities](https://github.com/seng438-winter-2022/seng438-a3-Sun2129/blob/main/DUPairDataUtilities.PNG)

[List of all du-pairs per variable for DataUtilities](https://github.com/seng438-winter-2022/seng438-a3-Sun2129/blob/main/DUPairRange.PNG)

List of pairs covered by each test case:

DataUtilities(calculateColumnTotal()): 

testAValidInputForMethodCalculateColumnTotal()
Pairs covered: (1-2), (1-4), (1-8), (1-5), (1-6), (4-7), (5-5), (5-6), (6-7), (6-8), (8-9), (8-10), (10-11), (3-11)

testNullValues2DObjectForMethodCalculateColumnTotal()
Pairs covered: (1-2)

testForNaNInputForColumnForMethodCalculateColumnTotal()
Pairs covered: (1-2), (1-4), (1-8), (1-5), (1-6), (4-7), (5-5), (5-6), (6-7), (6-8), (3-11)

testForNullIntArrayForMethodCalculateColumnTotal()
Pairs covered: (1-2), (1-4), (1-8), (1-5), (4-7), (5-5)

testForNaNIntArrayForMethodCalculateColumnTotal()
Pairs covered: (1-2), (1-4), (1-8), (1-5), (1-6), (4-7), (5-5), (5-6), (6-7), (6-8), (8-9), (8-10), (10-11), (3-11)

Range(combine()): 

testValidRangeInputForMethodCombine()
Pairs Covered: (1-2), (1-6), (1-7), (1-4), (1-6), (6-8), (7-8)

testSingleNullRangeInputForMethodCombine()
Pairs Covered: (1-2), (1-4), (1-5)

testTwoNullRangesInputForMethodCombine()
Pairs Covered: (1-2), (1-3)

testSingleNaNInputForMethodCombine()
Pairs Covered: (1-2), (1-6), (1-7), (1-4), (1-6), (6-8), (7-8)

DU-Pair Coverage Calculation:
DataUtilities(calculateColumnTotal()):
Total
C-uses: 10
P-uses: 5

Covered
C-uses: 10
P-uses: 5

Formula: ((Covered c-use + covered p-use)/((Total c-uses + Total p-uses) - (Infeasible C-uses + Infeasible P-uses))) x 100%

((10 + 5) / ((10 + 5) - 0)) x 100% =  100% Coverage

Range(combine()):
Total
C-uses: 5
P-uses: 2

Covered
C-uses: 5
P-uses: 2

Formula: ((Covered c-use + covered p-use)/((Total c-uses + Total p-uses) - (Infeasible C-uses + Infeasible P-uses))) x 100%

((5 + 2) / ((5 + 2) - 0)) x 100% =  100% Coverage

# 3 A detailed description of the testing strategy for the new unit test

Our test cases were written as a group, with every member chiming in and contributing.
The strategy we developed for performing the new unit test was to first make a list of all the methods in two classes. Next we examined which methods we had already done and checked if there was any condition or statement that our assignment 2 test didn’t cover. If there were, it would be on the list of methods that we were going to test. First, our strategy when picking methods was to choose the one that adds the most lines of code in order to achieve 90% statement coverage. For methods that weren’t previously tested in assignment 2, we first wrote test cases for valid, invalid, null and Not a Number inputs. We did this to ensure that methods were working as intended. 

Once that was achieved, we checked to see if the branch coverage requirement of 70% was meant. If it wasn’t, the next step in our plan was to identify methods with true and false conditions that we didn’t have a test for and write the test cases that targeted the condition. Some conditions had an if-else statement, and created test cases that covered the if-else statements.

Lastly we did Method Coverage instead of Condition Coverage. EclEmma didn’t include condition coverage so instead, for the Range and DataUtilities classes, we ensured that every method had a test written in the test suite. We achieved 100% method coverage for both classes.

# 4 A high level description of five selected test cases you have designed using coverage information, and how they have increased code coverage

public void testForNullAndDoubleNaNRangeTwoInputForMethodCombineIgnoringNaN();
The test case testForNullAndDoubleNaNRangeTwoInputForMethodCombineIgnoringNaN() was performed on the combineIgnoringNaN() method. Performing this test was necessary to reach the Statement coverage as the combineIgnoringNaN() included lines that could only if an if statement evaluated true. The test case also contributed to the reaching 70% branch coverage. The test case focused on the condition that Range1 is null and Range 2 has lower and upper bounds of double.NAN.

public void testForHashCodeMethod();
testForHashCodeMethod() was the last test case we wrote. It wasn’t necessary for condition coverage, but it was for reaching 100% method coverage and was needed to achieve above 90% statement coverage.

public void testSingleNaNInputForMethodCombine()
testSingleNaNInputForMethodCombine() was done to meet one of the 3rd if-statements. This test was important to meet and increase the branch coverage percentage. The expandToInclude() method didn't have that many lines of code, so this test case was significantly increasing the statement coverage. For method coverage we had already written a couple of methods for expandToInclude() so this test case didn't make a difference.

public void testAValidInputForMethodGetCumulativePercentages()
This test was necessary for reaching DataUtilities statements, and branch coverages. The getCumulativePercentages() method is the largest method, so having a test case that runs to the end greatly increases the statement . The method also had 2 for loops, so reaching and evaluating these two branches increased the branch coverage percentage. 
    
public void testAValidInputForMethodCalculateColumnTotal()
The test case, testAValidInputForMethodCalculateColumnTotal, increases the statement coverage percentage as this test case runs to the end of the calculateColumnTotal() method. calculateColumnTotal() has a for loop and 2 if-statements which are all covered in the test case, therefore increasing the branch coverage percentage as well. For method coverage there are other test cases for this method, so this method doesn’t increase the method coverage.

# 5 A detailed report of the coverage achieved of each class and method (a screen shot from the code cover results in green and red color would suffice)

[RangeTest Statement Coverage](https://github.com/seng438-winter-2022/seng438-a3-Sun2129/blob/main/RangeTestStatementCoverage.png)

[RangeTest Branch Coverage](https://github.com/seng438-winter-2022/seng438-a3-Sun2129/blob/main/RangeTestBranchCoverage.png)

[RangeTest method Coverage](https://github.com/seng438-winter-2022/seng438-a3-Sun2129/blob/main/RangeTestMethodCoverage.png)

[DataUtilitiesTest Branch Coverage](https://github.com/seng438-winter-2022/seng438-a3-Sun2129/blob/main/DataUtilitiesStatementCoverage.png)

[DataUtilitiesTest Statement Coverage](https://github.com/seng438-winter-2022/seng438-a3-Sun2129/blob/main/DataUtilitiesBranchCoverage.png)

[DataUtilitiesTest Method Coverage](https://github.com/seng438-winter-2022/seng438-a3-Sun2129/blob/main/DataUtilitiesMethodCoverage.png)


# 6 Pros and Cons of coverage tools used and Metrics you report

We Tested out each coverage tool before we started the lab with our test cases from assignment 2. EclEmma and JaCoCo were both able to show the Branch and Statement Coverage however we had to switch between which coverages we wanted to test. Both gave us the same percentages for the coverages. In Statement coverages we got a value of 41.7% for Range and 58.4% for DataUtilities and the Branch coverages we obtained values of 40.3% for Range and 56.2% for DataUtilities. Clover’s main pro was that we were able to see both the Statement and Branch Coverages at the same time however the tool took a long time to give us results the coverages also varied from EclEmma and JaCoCo. In Statement coverages we got a value of 39.2% for Range and 58.2% for DataUtilities and the Branch coverages we obtained values of 40.7% for Range and 56.5% for DataUtilities. CodeCover had a significant issue that did not allow us to obtain values as the tool needed a Java application to be run simultaneously however we were not provided one therefore for this lab both Branch and Statement coverages were not computed. Coverlipse also could not be run as the actual tool did not have the needed dependencies to be run so we were not able to obtain Branch and Statement coverages. Cobertura did not work on any device that the four of us have and therefore we could not obtain any Branch and Statement coverages as well.

# 7 A comparison on the advantages and disadvantages of requirements-based test generation and coverage-based test generation.

We used requirement-based testing in Lab 2 and in Lab 3 we used coverage-based testing. The difference is that with Coverage testing it gives us a percentage of how in-depth the testing that was done. Coverage Testing is based of white box testing which allows for the user to be able to see what the code is and read various statements such as if-else statements made within the methods therefore providing a more in-depth testing. In comparison to requirement-based testing which is often considered as black box testing and does not have the ability to actually see what the code for each method looks like therefore a larger potential of testing can be made done however at a larger cost to a potential project as you rely heavily on documentation and are more blindly following the documentation as compared to coverage-based which allows the user to see what conditions happen within the program. The percentages also measure the adequacy of the classes and functions within it as you are able to see all statements made within the code and their functions, along with the addition of the percentage it provides better understanding of how much of the overall class has been tested. Requirement is a longer process as you depend on the documentation therefore making it a longer process however overall you are able to think more freely of any more potential bugs but as compared to the coverage you are not able to see what the code is and what statements are made within it.  

# 8 A discussion on how the team work/effort was divided and managed

The team worked together over a call. We suggested tests and things that we could implement that would boost our statement, branch, and method coverage. Once the ideas were down, the tests were implemented one by one by the team and then ran to see if the coverage went up. Once this was done,  we met up another day in a call and worked collaboratively on the data flow graphs and def-use statements as well as the DU pairs. After this was done, we discussed the answers and topics we could talk about for each lab report question. We then split up the lab questions fairly and evenly amongst ourselves and answered them based on our discussion.

# 9 Any difficulties encountered, challenges overcome, and lessons learned from performing the lab

Setting up the different coverage tools was incredibly hard. Aside from the two that worked, it was impossible for us to get Eclipse to recognize the coverage tool plug-ins that we downloaded. It may be because some of the tools have not been updated in a long time, since Eclipse refused to download some of the plug-ins due to missing components in the download itself. Another difficulty we encountered was that when we imported our test suite from assignment 2 to this assignments project folder, the tests had a lot of errors and would not run properly. We overcame this by importing all the external jars first, and then all the other files and test suite. It worked properly after that.

# 10 Comments/feedback on the lab itself

The lab document was easier to understand because of our previous experience using Eclipse in lab 2. However, there were still some gray areas in this lab document. Trying to import the previous code from lab 2 was not clearly instructed as we had continuous difficulties trying to import the test suite for usage in lab 3. Trying to import the new JFreeChart jar before the other external jars would result in all of the code from lab 2 having errors when it is imported. The order of importing was different for us and this took some troubleshooting to figure out. It was also difficult to try out each coverage tool because their methods of installation were not given and some of the tools given in the lab document contained errors which prevented us from being able to use them.
