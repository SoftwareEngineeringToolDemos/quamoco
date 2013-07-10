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

package de.quamoco.qm.util.migration;

import org.eclipse.emf.edapt.migration.CustomMigration;
import org.eclipse.emf.edapt.migration.Instance;
import org.eclipse.emf.edapt.migration.Metamodel;
import org.eclipse.emf.edapt.migration.MigrationException;
import org.eclipse.emf.edapt.migration.Model;

public class ImpactRequirementMigration extends CustomMigration {

	@Override
	public void migrateBefore(Model model, Metamodel metamodel)
			throws MigrationException {
		for (Instance impact : model.getAllInstances("qm.Impact")) {
			Instance qualityModel = getQualityModel(impact);
			Instance requirement = getOrCreateRequirement(model, qualityModel);
			requirement.getLinks("impacts").add(impact);
		}
	}

	private Instance getQualityModel(Instance impact) {
		Instance element = impact.getContainer();
		while (!element.instanceOf("qm.QualityModel")) {
			element = element.getContainer();
		}
		return element;
	}

	private Instance getOrCreateRequirement(Model model, Instance qualityModel) {
		if (qualityModel.getLinks("requirements").isEmpty()) {
			Instance requirement = model.newInstance("qm.QualityRequirement");
			qualityModel.getLinks("requirements").add(requirement);
			return requirement;
		}
		return qualityModel.getLinks("requirements").get(0);
	}

}
