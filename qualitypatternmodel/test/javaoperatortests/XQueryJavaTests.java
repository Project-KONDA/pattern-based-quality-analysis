package javaoperatortests;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class XQueryJavaTests {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<Boolean> results = new ArrayList<Boolean>();
		List<String> expectations = List.of(expectedReturn1, expectedReturn2, expectedReturn3, expectedReturn4,
				expectedReturn5, expectedReturn6, expectedReturn7, expectedReturn8, expectedReturn9where, expectedReturn10);
		List<CompletePattern> patterns = OneArgTestPatterns.getXmlTestPatterns();
		
		int from = 1;
		int to = 10;
		for (int i = from-1; i<patterns.size() && i < expectations.size() && i < to; i++) {
			System.out.println("Example " + (i+1) + ":");
			try {
				results.add(testTestPattern(patterns.get(i), expectations.get(i)));
			}
			catch (InvalidityException e) {
				e.printStackTrace();
				results.add(false);
			}
		}
			
		System.out.println(results);
		System.out.print("total: " + (!results.contains(false)));
	}

	static Boolean testTestPattern(CompletePattern testpattern, String expected) throws InvalidityException {
		String result = " ";
		try {
			result = testpattern.generateXQueryJava();
		} catch (InvalidityException e) {
			e.printStackTrace();
		}
		boolean equal = Objects.equals(result, expected);
		System.err.println(equal? "equal": ( "not equal" + restAfterDif(result, expected)));
		if(!equal) {
//			System.out.println("\n\nquery:\n\n" + testpattern.generateXQuery());
//			System.out.println("\n\nstructure:\n\n" + testpattern.myToString());
			System.out.println("\n\nresult:\n\n'" + result + "'");
			System.out.println("\n\nexpected:\n\n'" + expected + "'");
		}
		return equal;
	}
	
	
	static String expectedStart = "return\n"
			+ "  (\n"
			+ "  \"<interim>\",\n"
			+ "  \"<return>\",\n";
	static String expectedMid = "  \"</return>\",\n"
			+ "  \"<condition>\",\n";
	static String expectedEnd = "  \"</condition>\",\n"
			+ "  \"</interim>\")";
	
	static String expectedReturn1 = 
			"for $var2_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var2_0,\n"
			+ expectedMid
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var3_0 in $var2_0/text()\n"
			+ "  return $var3_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ expectedEnd;
	static String expectedReturn2 = 
			"for $var2_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var2_0,\n"
			+ expectedMid
			+ "  \"<quantifier>\",\n"
					+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var3_0 in $var2_0/text()[matches(., \".*a.*\")]\n"
			+ "  return $var3_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ expectedEnd;
	static String expectedReturn3 = 
			"for $var3_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<formula>\",\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var4_0 in $var3_0/text()\n"
			+ "  return $var4_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var5_0 in $var3_0/text()\n"
			+ "  return $var5_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ "  \"</formula>\",\n"
			+ expectedEnd;
	static String expectedReturn4 = 
			"for $var3_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<formula>\",\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var4_0 in $var3_0/text()\n"
			+ "  return $var4_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var5_0 in $var3_0/text()\n"
			+ "  return $var5_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ "  \"</formula>\",\n"
			+ expectedEnd;
	static String expectedReturn4Where = 
			"for $var3_0 in /descendant::*\n"
			+ "where ((\n"
			+ "  some $var4_0 in $var3_0/text()[matches(., \"\"something\"\")]\n"
			+ "  satisfies (true()))\n"
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<formula>\",\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var4_0 in $var3_0/text()\n"
			+ "  return $var4_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var5_0 in $var3_0/text()\n"
			+ "  return $var5_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ "  \"</formula>\",\n"
			+ expectedEnd;
	static String expectedReturn5 = "for $var3_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<formula>\",\n"
			+ "  \"<boolean>\",\n"
			+ "  (  \n"
			+ "  some $var4_0 in $var3_0/text()[matches(., \"something\")]\n"
			+ "  satisfies (true())\n"
			+ "  ),\n"
			+ "  \"</boolean>\",\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var5_0 in $var3_0/text()\n"
			+ "  return $var5_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ "  \"</formula>\",\n"
			+ expectedEnd;
	static String expectedReturn5Where = 
			"for $var3_0 in /descendant::*\n"
			+ "where ((\n"
			+ "  some $var4_0 in $var3_0/text()[matches(., \"\"something\"\")]\n"
			+ "  satisfies (true()))\n" 
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<formula>\",\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var5_0 in $var3_0/text()\n"
			+ "  return $var5_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ "  \"</formula>\",\n"
			+ expectedEnd;
	static String expectedReturn6 = 
			"for $var3_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<formula>\",\n"
			+ "  \"<boolean>\",\n"
			+ "  (  \n"
			+ "  some $var4_0 in $var3_0/text()[matches(., \"something\")]\n"
			+ "  satisfies (true())\n"
			+ "  ),\n"
			+ "  \"</boolean>\",\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var5_0 in $var3_0/text()\n"
			+ "  return $var5_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ "  \"</formula>\",\n"
			+ expectedEnd;
	static String expectedReturn7Old = 
			"for $var3_0 in /descendant::*\n" 
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<quantifier>\",\n"
			+ "  (for $var4_0 in $var3_0/child::*\n"
			+ "  return \n"
			+ "  (\n"
			+ "  \"<quantifier>\",\n"
			+ "  (for $var5_0 in $var4_0/text()\n"
			+ "  return $var5_0)\n"
			+ "  \"</quantifier>\")\n"
			+ "  )\n"
			+ "  \"</quantifier>\",\n"
			+ expectedEnd;
	static String expectedReturn7 = 
			"for $var3_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<quantifier>\",\n"
			+ "  (\n"
			+ "  for $var4_0 in $var3_0/child::*\n"
			+ "  return (\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var5_0 in $var4_0/text()\n"
			+ "  return $var5_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\"),\n"
			+ "  \"</quantifier>\"),\n"
			+ expectedEnd;
	static String expectedReturn8Where = 
			"for $var4_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var4_0,\n"
			+ expectedMid
			+ "  \"<quantifier>\",\n"
			+ "  (\n"
			+ "  for $var5_0 in $var4_0/child::*\n"
			+ "  return (\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\n"
			+ "  for $var6_0 in $var5_0/child::*\n"
			+ "  return (\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var7_0 in $var6_0/text()\n"
			+ "  return $var7_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\"),\n"
			+ "  \"</quantifier>\")),\n"
			+ "  \"</quantifier>\"),\n"
			+ expectedEnd;
	static String expectedReturn8 = 
			"for $var4_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var4_0,\n"
			+ expectedMid
			+ "  \"<quantifier>\",\n"
			+ "  (\n"
			+ "  for $var5_0 in $var4_0/child::*\n"
			+ "  return (\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\n"
			+ "  for $var6_0 in $var5_0/child::*\n"
			+ "  return (\n"
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var7_0 in $var6_0/text()\n"
			+ "  return $var7_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\"),\n"
			+ "  \"</quantifier>\")),\n"
			+ "  \"</quantifier>\"),\n"
			+ expectedEnd;
	static String expectedReturn9where = 
			"for $var3_0 in /descendant::*\n"
			+ "where \n"
			+ "  some $var4_0 in $var3_0/text()[matches(., \".*a.*\")]\n"
			+ "  satisfies (true())\n" 
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var5_0 in $var3_0/text()\n"
			+ "  return $var5_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ expectedEnd;
	static String expectedReturn9 = 
			"for $var3_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var4_0 in $var3_0/text()\n"
			+ "  return $var4_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  (\"<boolean>\",\n"
			+ "  (  \n"
			+ "  some $var5_0 in $var3_0/text()[matches(., \".*a.*\")]\n"
			+ "  satisfies (true())\n"
			+ "  ),\n"
			+ "  \"</boolean>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ expectedEnd;
	static String expectedReturn10 = 
			"for $var3_0 in /descendant::*\n"
			+ expectedStart
			+ "  $var3_0,\n"
			+ expectedMid
			+ "  \"<quantifier>\",\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var4_0 in $var3_0/text()\n"
			+ "  return $var4_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  (\"<value>\",\n"
			+ "  (  \n"
			+ "  for $var5_0 in $var3_0/text()\n"
			+ "  return $var5_0\n"
			+ "  ),\n"
			+ "  \"</value>\"\n"
			+ "  ),\n"
			+ "  \"</quantifier>\",\n"
			+ expectedEnd;
	
	private static String restAfterDif(String a, String b) {
		while(!a.isBlank() && !b.isBlank() && a.charAt(0) == b.charAt(0)) {
			a = a.substring(1);
			b = b.substring(1);
		}
		
		
		return "[" + a.charAt(0) + "]" + "[" + b.charAt(0) + "]\n'" + a + "' /n '" + b + "'";
	}
}
