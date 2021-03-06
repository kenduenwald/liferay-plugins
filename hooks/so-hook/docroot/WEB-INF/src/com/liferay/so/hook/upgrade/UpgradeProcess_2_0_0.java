/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This file is part of Liferay Social Office. Liferay Social Office is free
 * software: you can redistribute it and/or modify it under the terms of the GNU
 * Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Liferay Social Office is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Liferay Social Office. If not, see http://www.gnu.org/licenses/agpl-3.0.html.
 */

package com.liferay.so.hook.upgrade;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.so.hook.upgrade.v2_0_0.UpgradeAssetPublisher;
import com.liferay.so.hook.upgrade.v2_0_0.UpgradeDocumentLibrary;
import com.liferay.so.hook.upgrade.v2_0_0.UpgradeGroup;

/**
 * @author Ryan Park
 */
public class UpgradeProcess_2_0_0 extends UpgradeProcess {

	@Override
	public int getThreshold() {
		return 200;
	}

	@Override
	protected void doUpgrade() throws Exception {
		if (UpgradeUtil.isFirstRun()) {
			return;
		}

		upgrade(UpgradeAssetPublisher.class);
		upgrade(UpgradeDocumentLibrary.class);
		upgrade(UpgradeGroup.class);
	}

}