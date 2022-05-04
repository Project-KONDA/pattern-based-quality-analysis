/**
 *
 * $Id$
 */
package qualitypatternmodel.adaptionxml.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;

/**
 * A sample validator interface for {@link qualitypatternmodel.adaptionxml.AxisOptionParam}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelationOptionParamValidator {
	boolean validate();

	boolean validateOptions(EList<AxisKind> value);
	boolean validateValue(AxisKind value);
	boolean validateRelations(EList<XmlNavigation> value);
}