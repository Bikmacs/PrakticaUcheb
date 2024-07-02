package com.bignerdranch.android.webFragment.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/bignerdranch/android/webFragment/adapters/ProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bignerdranch/android/webFragment/adapters/ProductAdapter$ViewHolder;", "()V", "_context", "Landroid/content/Context;", "items", "", "Lcom/bignerdranch/android/webFragment/ui/models/Product;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshProducts", "Factory", "ViewHolder", "app_debug"})
public final class ProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bignerdranch.android.webFragment.adapters.ProductAdapter.ViewHolder> {
    private android.content.Context _context;
    private java.util.List<com.bignerdranch.android.webFragment.ui.models.Product> items;
    @org.jetbrains.annotations.NotNull
    public static final com.bignerdranch.android.webFragment.adapters.ProductAdapter.Factory Factory = null;
    
    public ProductAdapter() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.bignerdranch.android.webFragment.adapters.ProductAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.bignerdranch.android.webFragment.adapters.ProductAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void refreshProducts(@org.jetbrains.annotations.NotNull
    java.util.List<com.bignerdranch.android.webFragment.ui.models.Product> items) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/bignerdranch/android/webFragment/adapters/ProductAdapter$Factory;", "", "()V", "create", "Lcom/bignerdranch/android/webFragment/adapters/ProductAdapter;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Factory {
        
        private Factory() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.bignerdranch.android.webFragment.adapters.ProductAdapter create(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/bignerdranch/android/webFragment/adapters/ProductAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/bignerdranch/android/application_practica2/databinding/ProductItemBinding;", "(Lcom/bignerdranch/android/application_practica2/databinding/ProductItemBinding;)V", "tvCartImage", "Landroid/widget/TextView;", "getTvCartImage", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tvCartImage = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.bignerdranch.android.application_practica2.databinding.ProductItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvCartImage() {
            return null;
        }
    }
}