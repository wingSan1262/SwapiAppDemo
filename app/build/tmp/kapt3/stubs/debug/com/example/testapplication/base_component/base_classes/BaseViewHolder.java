package com.example.testapplication.base_component.base_classes;

import java.lang.System;

/**
 * RV ViewHolder Base
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/testapplication/base_component/base_classes/BaseViewHolder;", "BaseModel", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "model", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseViewHolder<BaseModel extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View rootView) {
        super(null);
    }
    
    public abstract void bindData(BaseModel model);
}