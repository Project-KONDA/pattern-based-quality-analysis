package qualitypatternmodel.xmlservlettests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import qualitypatternmodel.xmlservlettests.AbstractPatternInstantiationServletTest;
import qualitypatternmodel.xmlservlettests.AbstractPatternListServletTest;
import qualitypatternmodel.xmlservlettests.ConcretePatternDeletionServletTest;
import qualitypatternmodel.xmlservlettests.ConcretePatternListServletTest;
import qualitypatternmodel.xmlservlettests.ConcretePatternTextServletTest;
import qualitypatternmodel.xmlservlettests.ConcretisationFinalizationServletTest;
import qualitypatternmodel.xmlservlettests.ConcretisationServletTest;
import qualitypatternmodel.xmlservlettests.DatabasesGettingServletTest;
import qualitypatternmodel.xmlservlettests.DatabasesListServletTest;
import qualitypatternmodel.xmlservlettests.DatabasesRegistrationServletTest;
import qualitypatternmodel.xmlservlettests.DatabasesSettingServletTest;
import qualitypatternmodel.xmlservlettests.ParameterExplanationServletTest;
import qualitypatternmodel.xmlservlettests.PatternApplicationServletTest;
import qualitypatternmodel.xmlservlettests.QueryServletTest;
import qualitypatternmodel.xmlservlettests.SchemaValidationServletTest;

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
