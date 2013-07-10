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

/**
 * <copyright>
 * </copyright>
 *
 * $Id: NormalizationMeasureImpl.java 4974 2012-02-17 09:34:10Z lochmann $
 */
package de.quamoco.qm.impl;

import org.eclipse.emf.ecore.EClass;

import de.quamoco.qm.NormalizationMeasure;
import de.quamoco.qm.QmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normalization Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NormalizationMeasureImpl extends MeasureImpl implements NormalizationMeasure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalizationMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmPackage.Literals.NORMALIZATION_MEASURE;
	}

} //NormalizationMeasureImpl
