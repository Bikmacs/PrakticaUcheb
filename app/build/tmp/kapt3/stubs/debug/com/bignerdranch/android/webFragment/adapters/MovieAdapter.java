package com.bignerdranch.android.webFragment.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000bJ\u0014\u0010\u0018\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/bignerdranch/android/webFragment/adapters/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bignerdranch/android/webFragment/adapters/MovieAdapter$ViewHolder;", "movies", "", "Lcom/bignerdranch/android/webFragment/ui/models/Movie;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "items", "movieClickListener", "Lcom/bignerdranch/android/webFragment/adapters/MovieAdapter$onItemClickMovie;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnMovieClickListener", "listener", "updateMovie", "ViewHolder", "onItemClickMovie", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bignerdranch.android.webFragment.adapters.MovieAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie> movies;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie> items;
    @org.jetbrains.annotations.Nullable
    private com.bignerdranch.android.webFragment.adapters.MovieAdapter.onItemClickMovie movieClickListener;
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie> movies, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void setOnMovieClickListener(@org.jetbrains.annotations.NotNull
    com.bignerdranch.android.webFragment.adapters.MovieAdapter.onItemClickMovie listener) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.bignerdranch.android.webFragment.adapters.MovieAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.bignerdranch.android.webFragment.adapters.MovieAdapter.ViewHolder holder, int position) {
    }
    
    public final void updateMovie(@org.jetbrains.annotations.NotNull
    java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie> items) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/bignerdranch/android/webFragment/adapters/MovieAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "movieLayout", "Landroid/widget/LinearLayout;", "getMovieLayout", "()Landroid/widget/LinearLayout;", "movieName", "Landroid/widget/TextView;", "getMovieName", "()Landroid/widget/TextView;", "movieRating", "getMovieRating", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView movieName = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView movieRating = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.LinearLayout movieLayout = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getMovieName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getMovieRating() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getMovieLayout() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/bignerdranch/android/webFragment/adapters/MovieAdapter$onItemClickMovie;", "", "onMovieClick", "", "movieUrl", "", "app_debug"})
    public static abstract interface onItemClickMovie {
        
        public abstract void onMovieClick(@org.jetbrains.annotations.NotNull
        java.lang.String movieUrl);
    }
}