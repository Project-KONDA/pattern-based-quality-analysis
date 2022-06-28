package qualitypatternmodel.xmlservlettests;

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
   QueryServletTest.class,
   
   DatabasesListServletTest.class,
   DatabasesRegistrationServletTest.class,
   DatabasesSettingServletTest.class,
   DatabasesGettingServletTest.class,
   PatternApplicationServletTest.class,
   SchemaValidationServletTest.class,
   ParameterExplanationServletTest.class
   
})

public class TestSuite {   
}  
