package com.github.tvbox.osc.ui.dialog;

import android.content.Context;

import androidx.annotation.NonNull;

import com.github.tvbox.osc.R;

import org.jetbrains.annotations.NotNull;

public class AbouvDialog extends BaseDialog {

    public AbouvDialog(@NonNull @NotNull Context context) {
        super(context);
        setContentView(R.layout.dialog_abouv);
    }
}
