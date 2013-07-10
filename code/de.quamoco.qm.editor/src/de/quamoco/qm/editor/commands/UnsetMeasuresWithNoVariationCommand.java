/*-------------------------------------------------------------------------+
|                                                                          |
| Copyright 2012 Technische Universitaet Muenchen and                      |
| Fraunhofer-Institut fuer Experimentelles Software Engineering (IESE)     |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
|                                                                          |
+-------------------------------------------------------------------------*/

package de.quamoco.qm.editor.commands;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.ChangeCommand;

import de.quamoco.qm.LinearFunction;
import de.quamoco.qm.MeasureRanking;
import de.quamoco.qm.QualityModel;
import de.quamoco.qm.WeightedSumMultiMeasureEvaluation;

/**
 * Command to add a source to all elements in the same resource.
 * 
 * @author herrmama
 * @author $Author: hummelb $
 * @version $Rev: 18709 $
 * @levd.rating YELLOW Hash: 52677D416688FDD0074046742C0024CB
 */
public class UnsetMeasuresWithNoVariationCommand extends ChangeCommand {
	
	/** Counts how many ranks where set to 0 */
	private int counter = 0;

	/** The source that should be added to all elements. */
	private final QualityModel qm;

	/** Constructor. */
	public UnsetMeasuresWithNoVariationCommand(QualityModel source) {
		super(source.eResource().getResourceSet());

		this.qm = source;
	}
	
	public int getNumberOfRanksSetTo0() {
		return counter;
	}

	/** {@inheritDoc} */
	@Override
	public void doExecute() {
		ResourceSet rs = qm.eResource().getResourceSet();

		for (Resource r : rs.getResources()) {
			for (Iterator<EObject> i = r.getAllContents(); i.hasNext();) {
				EObject object = i.next();
				if (object instanceof WeightedSumMultiMeasureEvaluation) {
					checkAndChange((WeightedSumMultiMeasureEvaluation) object);
				}
			}
		}
	}

	private void checkAndChange(WeightedSumMultiMeasureEvaluation object) {
		for(MeasureRanking mr: object.getRankings()) {
			if(mr.getFunction() instanceof LinearFunction) {
				LinearFunction f = (LinearFunction) mr.getFunction();
				if(f.getLowerBound() == 1e-7 || f.getUpperBound() == 1e-7) {
					mr.setRank(0);
					counter ++;
				}
			}
		}
	}
}
