/*
 * Copyright (c) 2013 Menny Even-Danan
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

package com.anysoftkeyboard.devicespecific;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.ClipboardManager;

import com.anysoftkeyboard.IndirectlyInstantiated;

@SuppressWarnings("deprecation")
@TargetApi(3)
@IndirectlyInstantiated
public class ClipboardV3 implements Clipboard {
    private final ClipboardManager cbV3;

    public ClipboardV3(ClipboardDiagram diagram) {
        cbV3 = (android.text.ClipboardManager) diagram.getContext()
                .getSystemService(Context.CLIPBOARD_SERVICE);
    }

    public void setText(CharSequence text) {
        cbV3.setText(text);
    }

    public CharSequence getText() {
        if (cbV3.hasText())
            return cbV3.getText();
        else
            return null;
    }
}