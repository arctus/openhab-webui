/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.ui.habmin.internal.services.designer.blocks;

import org.openhab.ui.habmin.internal.services.designer.DesignerBlockBean;
import org.openhab.ui.habmin.internal.services.designer.DesignerFieldBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Chris Jackson
 * @since 1.5.0
 * 
 */
public class VariableGetBlock extends DesignerRuleCreator {
	private static final Logger logger = LoggerFactory.getLogger(VariableGetBlock.class);

	String processBlock(RuleContext ruleContext, DesignerBlockBean block) {
		DesignerFieldBean varField = findField(block.fields, "VAR");
		if (varField == null) {
			logger.error("VARIABLE GET contains no NUM");
			return null;
		}

		// If this is a valid item, then add .state
		String val = varField.value;

		return val;
	}
}
