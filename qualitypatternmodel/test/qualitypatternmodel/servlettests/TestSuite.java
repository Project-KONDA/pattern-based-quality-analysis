package qualitypatternmodel.servlettests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   AbstractPatternInstantiationServletTest.class,
   AbstractPatternListServletTest.class,
   ConcretePatternDeletionServletTest.class,
   ConcretePatternListServletTest.class,
   ConcretisationFinalizationServletTest.class,
   ConcretisationServletTest.class,
   ConcretePatternTextServletTest.class,
   QueryServletTest.class
})

public class TestSuite {   
}  
