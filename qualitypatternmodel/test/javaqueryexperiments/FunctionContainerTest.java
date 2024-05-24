package javaqueryexperiments;

import java.util.ArrayList;
import java.util.List;

import javaqueryexperiments.testclasses.FilterFunctionContainer;
import qualitypatternmodel.exceptions.InvalidityException;

public class FunctionContainerTest {
    
	public static boolean testfunction0() {
		return true;
	}
	
	public static boolean testfunction1(String v1) {
		return v1.contains("a");
	}
	
	public static boolean testfunction2(String v1, String v2) {
		return v1.contains("a") == v2.contains("a") ;
	}
	
	public static boolean testfunction3(String v1, String v2, String v3) {
		return (v1.contains("a") == v2.contains("a")) == v3.contains("a");
	}

    public static void main(String[] args) throws InvalidityException {
        FilterFunctionContainer test0 = new FilterFunctionContainer(FunctionContainerTest::testfunction0);
        FilterFunctionContainer test1 = new FilterFunctionContainer(FunctionContainerTest::testfunction1);
        FilterFunctionContainer test2 = new FilterFunctionContainer(FunctionContainerTest::testfunction2);
        FilterFunctionContainer test3 = new FilterFunctionContainer(FunctionContainerTest::testfunction3);
        
        List<String> list = new ArrayList<String>();
        System.out.println(test0.apply(list));
        list.add("not one of the first letter");
        System.out.println(test1.apply(list));
        list.add("a is the first letter");
        System.out.println(test2.apply(list));
        list.add("one more without");
        System.out.println(test3.apply(list));
    }
}