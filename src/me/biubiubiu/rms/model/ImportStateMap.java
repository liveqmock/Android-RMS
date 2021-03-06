/*
 * YesOrNoMap.java
 * Copyright (C) 2013 garlic <garlic@localhost>
 *
 * Distributed under terms of the MIT license.
 */

package me.biubiubiu.rms.model;

import android.util.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.app.*;
import android.app.AlertDialog.Builder;
import android.os.*;
import android.text.*;
import android.database.*;
import android.net.*;
import android.opengl.*;
import android.graphics.*;
import android.view.animation.*;
import android.text.TextUtils;
import me.biubiubiu.rms.R;
import android.content.res.TypedArray;

import java.util.*;

public class ImportStateMap extends EntityMap {

	public ImportStateMap() {
        put("待审核", "pending");
        put("已入库", "imported");
        put("已取消", "canceled");
	}
}


