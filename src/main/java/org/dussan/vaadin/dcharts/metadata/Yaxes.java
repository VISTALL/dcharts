/**
 * Copyright (C) 2012-2013  Dušan Vejnovič  <vaadin@dussan.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dussan.vaadin.dcharts.metadata;

public enum Yaxes {

	Y("yaxis"), //
	Y2("y2axis"), //
	Y3("y3axis"), //
	Y4("y4axis"), //
	Y5("y5axis"), //
	Y6("y6axis"), //
	Y7("y7axis"), //
	Y8("y8axis"), //
	Y9("y9axis"), //
	Y_MIDDLE("yMidAxis");

	private String axis;

	private Yaxes(String axis) {
		this.axis = axis;
	}

	public String getAxis() {
		return axis;
	}

	@Override
	public String toString() {
		return getAxis();
	}

}
