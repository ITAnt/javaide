package com.duy.android.compiler.builder.task.android;

import com.duy.android.compiler.builder.IBuilder;
import com.duy.android.compiler.builder.task.Task;
import com.duy.android.compiler.project.AndroidAppProject;

public class MergeAssetTask extends Task<AndroidAppProject> {

    public MergeAssetTask(IBuilder<? extends AndroidAppProject> builder) {
        super(builder);
    }

    @Override
    public String getTaskName() {
        return "Merge Asset";
    }

    @Override
    public boolean doFullTaskAction() throws Exception {
        // TODO: 02-Jun-18 impl
        return true;
    }
}
