/**
 */
package qualitypatternmodel.javaquery;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.impl.FormulaFilterPartImpl;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.patternstructure.LogicalOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getBooleanFilterPart()
 * @model abstract="true"
 * @generated
 */
public interface BooleanFilterPart extends JavaFilterPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Boolean> apply(InterimResult parameter) throws InvalidityException;

	static BooleanFilterPart combine(List<BooleanFilterPart> filterparts) {
		if (filterparts == null || filterparts.isEmpty())
			return null;
		else if (filterparts.size() == 1)
			return (BooleanFilterPart) filterparts.get(0);
		else {
			int middleIndex = filterparts.size() / 2;
			List<BooleanFilterPart> firstHalf = filterparts.subList(0, middleIndex);
			List<BooleanFilterPart> secondHalf = filterparts.subList(middleIndex, filterparts.size());
			BooleanFilterPart first = combine(firstHalf);
			BooleanFilterPart second = combine(secondHalf);
			return new FormulaFilterPartImpl(LogicalOperator.AND, first, second);
		}
	}

} // BooleanFilterPart
