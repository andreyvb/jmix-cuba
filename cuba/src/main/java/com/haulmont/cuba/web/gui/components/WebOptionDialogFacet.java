/*
 * Copyright 2020 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haulmont.cuba.web.gui.components;

import com.haulmont.cuba.gui.components.OptionDialogFacet;
import io.jmix.ui.component.WindowMode;
import io.jmix.ui.component.impl.OptionDialogFacetImpl;

/**
 * Use {@link io.jmix.ui.component.impl.OptionDialogFacetImpl} instead
 */
@Deprecated
public class WebOptionDialogFacet extends OptionDialogFacetImpl implements OptionDialogFacet {

    @Override
    public void setMaximized(boolean maximized) {
        setWindowMode(maximized ? WindowMode.MAXIMIZED : WindowMode.NORMAL);
    }

    @Override
    public boolean isMaximized() {
        return getWindowMode() == WindowMode.MAXIMIZED;
    }
}
